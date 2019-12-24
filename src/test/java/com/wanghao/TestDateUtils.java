//package com.wanghao;
//
//
//import java.util.Date;
//
//import org.junit.Test;
//
//import com.wanghao.cms.utils.DateUtils;
//
///*
// * 日期工具类的测试
// */
//public class TestDateUtils {
//
//	@Test
//	public void testGetAge() {
//		//年份是从1900开始的 月份是0-11
//		Date date = new Date(1999-1900,11,14);
//		int age = DateUtils.getAge(date);
//		System.out.println(age);
//	}
//	//		@Test
//		 {
//			 List<String>	 byLines = FileUtils.readByLines("d:\\练习题目.txt");
//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//			for (String string : byLines) {
//				Car car = new Car();
//				String[] carData = string.split("\\|");
//				if(carData.length!=4) {
//					System.out.println(" 数据 不合法  长度 " + string);
//					continue;
//				}
//				
//				// 车牌号
//				car.setCarno(carData[0]);
//				//
//				try {
//					car.setLongitude(Double.parseDouble(carData[1]));	
//					car.setLatitude(Double.parseDouble(carData[2]));	
//				} catch (NumberFormatException e) {
//					// TODO: handle exception
//					System.out.println("精度或维度不合法" +  string);
//					continue;
//				}
//				car.setZptime(sdf.parse(carData[3]));
//				car.setDistance(CalculateUtils.calBylw(car.getLongitude(), car.getLatitude(), 116.38, 39.90));
////				service.add(car);
//			}
//		}
		
//	@Test
//	public void testRemainDays() {
//		
//		Date future =  new Date(120,7,1);
//		int remainDay = DateUtils.getRemainDays(future);
//		System.out.println("毕业剩余天数" + remainDay);
//		
//	}
//	
//	
//	@Test
//	public void testIstoday() {
//		Date future =  new Date(120,7,1);
//		boolean isToday = DateUtils.isToday(future);
//		System.out.println("今天 " + isToday);
//		isToday = DateUtils.isToday(new Date());
//		System.out.println("今天2 " + isToday);
//	}
//	
//	
//	@Test
//	public void testGetBeginOfMonth() {
//		
//		Date beginOfMonth = DateUtils.getBeginOfMonth();
//		System.out.println(" beginOfMonth is " + beginOfMonth);
//		
//	}
//	
//	
//	@Test
//	public void testGetEndOfMonth() {
//		
//		Date beginOfMonth = DateUtils.getEndOfMonth();
//		System.out.println(" getEndOfMonth is " + beginOfMonth);
//		
//		
//	}
//	
//}
