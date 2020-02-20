package com.wanghao.cms.utils;

public class HuanNumberUtils2 {

//	public static void main(String[] args) {
//		String a = "京H17453";
////		a.substring(5, endIndex)
//		System.out.println(a.substring(6, 7));
//	}
	/**
	 * 根据给定的距离天安门公式，输入参数 经纬度，可以计算返回具体的被抓拍车辆出现在北京市区几环
	 * @param x1
	 * @param y1
	 * @return
	 */
	public static String culte(int x1,int y1 ) {
		int de= (int) Math.round( Math.sqrt( Math.pow(x1 - 39 ,2  ) +  Math.pow(y1 - 116 ,2  ) ));
		//距离小于15 返回2环
		if(de<15) {
			return "2环";
		}
		//距离小于40 大于15 返回4环
		if(de>=15 && de<30) {
			return "3环";
		}
		if(de>=30 && de<40) {
			return "4环";
		}
		//距离小于60 大于40 返回5环
		if(de>=40 && de<60) {
			return "5环";
		}
		return "5环";
		
	}
//	public static int huan(int de ) {
//		//距离小于15 返回2环
//		if(de<15) {
//			return 2;
//		}
//		//距离小于40 大于15 返回4环
//		if(de>=15 && de<40) {
//			return 4;
//		}
//		//距离小于60 大于40 返回5环
//		if(de>=40 && de<60) {
//			return 5;
//		}
//		return 5;
//	}

}
