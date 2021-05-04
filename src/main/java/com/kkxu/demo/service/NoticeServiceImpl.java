package com.kkxu.demo.service;

import com.kkxu.demo.common.domain.Notice;
import com.kkxu.demo.common.domain.NoticeExample;
import com.kkxu.demo.mapper.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    NoticeMapper noticeMapper;
    @Override
    public List<Notice> allnotice() {
        Date now = new Date();
        NoticeExample noticeExample=new NoticeExample();
        noticeExample.setOrderByClause("createtime desc");
        List<Notice> notices = noticeMapper.selectByExample(noticeExample);
        return notices;
    }
}
