package com.kkxu.demo.controller;

import com.kkxu.demo.common.domain.Goods;
import com.kkxu.demo.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.List;

@Controller
public class SearchController {
    @Autowired
    private IGoodsService iGoodsService;

    //1.商品列表,不需要输入任何信息，直接显示所有商品  参数列表{无参数}
    @RequestMapping("/goodslist")
    public String GoodsList(ModelMap modelMap) {
        List<Goods> goods = iGoodsService.listAll();
        modelMap.addAttribute("goods", goods);
        return "goodslist";
    }


    //2.根据名称模糊搜索商品  参数列表{name=??}
    @RequestMapping("/searchgoodsbyname")
    public String GoodsSearch(String name, ModelMap modelMap) {
        if (name.isEmpty()) {
            modelMap.addAttribute("searcherror1", "没有输入关键字");
            return "button";
        }
            List<Goods> goods = iGoodsService.goodsSearch(name);
            Collections.sort(goods, Goods::compareTo);
            modelMap.addAttribute("goods", goods);
            return "goodslist";
        }



    //3.根据名称和价格搜索商品  参数列表{name=?? &price=??}
    @RequestMapping("/searchgoodsbyname_price")
    public String GoodsSearchByName_Price(String name, Double lowerprice,Double higherprice, ModelMap modelMap) {
        if (name.isEmpty()) {
            modelMap.addAttribute("error", "未输入查询关键字");
            return "button";
        } else if(lowerprice!=null&&higherprice!=null&&lowerprice>higherprice){
            modelMap.addAttribute("error", "价格下限不应大于价格上限");
            return "button";
        }
        else {
            if(lowerprice==null){lowerprice=(double)0;}
            if(higherprice==null){higherprice=(double)1000000;}//设定一个上限
        List<Goods> goods = iGoodsService.goodsSearchByName_Price(name, lowerprice, higherprice);
        Collections.sort(goods, Goods::compareTo);
        modelMap.addAttribute("goods", goods);
        return "goodslist";
        }
    }
    }









