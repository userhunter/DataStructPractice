package com.miya.recursive.method;

import java.util.Scanner;

public class RecursiveData {
	
	
	private int totalHeight = 20;         // 总高度为20
	private int a = 5;
	private int b = 3;
	private int count = 1;
	
	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	/**
	  * @Method: getBottleCount
	  * @Description: 一只青蛙每天向上爬5米，晚上下降3米,问多少次可以爬上瓶子顶部
	  * @param length 井的深度
	  * 返回类型：void
	  */
	public  void  getBottleCount(int length){
		if(length <= 5){
			return;
		}else{
			count++;
			length = length -2;
			System.out.println("第"+(count-1)+"天剩余:"+length);
			getBottleCount(length);
		}
	}
	
	
	public int getDeepwell(boolean Flag, int Deepwell) {
		if (Flag) {
			Deepwell -= 5;// 白天向上爬5米
		} else {
			Deepwell += 3;// 晚上向下掉3米
		}
		return Deepwell;
	}
	
	public void testDeepWell(int deep){
		int day = 0;// 初始变量day为0天
		while (true) {
			day++;// 进入循环之后不管井度是多少先加1天
			if (deep <= 5) {
				break;
			} else {
				deep = getDeepwell(true, deep);
				deep = getDeepwell(false, deep);
				System.out.println("第" + day + "天剩余的高度：  " + deep);
				if (deep <= 0)
					break;
			}
		}
		System.out.println("需要使用的天数：  " + day);
	}


}
