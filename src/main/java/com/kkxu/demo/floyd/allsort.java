package com.kkxu.demo.floyd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class allsort {
	    public List<List<Integer>> permute(int[] nums) {
	        List<List<Integer>> res = new ArrayList<List<Integer>>();

	        List<Integer> output = new ArrayList<Integer>();
	        for (int num : nums) {
	            output.add(num);
	        }

	        int n = nums.length;
	        backtrack(n, output, res, 0);
	        return res;
	    }

	    public void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
	        // 所有数都填完了
	        if (first == n) {
	            res.add(new ArrayList<Integer>(output));
	        }
	        for (int i = first; i < n; i++) {
	            // 动态维护数组
	            Collections.swap(output, first, i);
	            // 继续递归填下一个数
	            backtrack(n, output, res, first + 1);
	            // 撤销操作
	            Collections.swap(output, first, i);
	        }
	    }
	    static int jiecheng(int n) {
	    	if(n>1)
	    	return n*jiecheng(n-1);
	    	return 1;
	    }

	    public static void main(String[] args) {
	    	int num[]= {1,2,5,3};
	    	int length=num.length;
	    	int width=jiecheng(length);
	    	System.out.println(width+" "+length);
	    	allsort a=new allsort();
	    	Integer k;int cnt=0,i,j;
	    	int[][] res=new int[width][length];
	    	List<List<Integer>> L= a.permute(num);
	    	i=0;
	    	for (List<Integer> li:L) {
				System.out.println(li.toString());
				Integer[] ids = li.toArray(new Integer[length]);
					for(j=0;j<length;j++) {
					res[i][j]=ids[j];
					System.out.println(ids[j]);
					}
					i++;
				System.out.println(cnt);
			}

	    	for(i=0;i<width;i++) {
	    		for(j=0;j<length;j++) {
	    			System.out.print(res[i][j]+"->");
	    		}
	    		System.out.println();
	    	}
	    }
	    static int[][]  form_array(int width,int length,int a[]) {
	    	allsort a1=new allsort();
	    	List<List<Integer>> L=a1.permute(a);
	    	int [][] res=new int[width][length];
	    	int i=0,j=0;
	    	for (List<Integer> li:L) {
			//	System.out.println(li.toString());
				Integer[] ids = li.toArray(new Integer[length]);
					for(j=0;j<length;j++) {
					res[i][j]=ids[j];
				//	System.out.println(ids[j]);
					}
					i++;
	    	}
			return res;

	    }
	}



