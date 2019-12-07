package com.wanghao.cms.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * 关于日期的工具类
 * @author hp
 *
 */
public class DateUtils {

	/**
	 * 一天的毫秒数
	 */
	static final int millSecondsPerDay = 1000*60*60*24;
	
	/**
	 * 计算年龄
	 * @param birthday 生日
	 * @return 返回年龄
	 */
	public static int getAge(Date birthday) {
		
		//calendar 日历的意思
		Calendar calender = Calendar.getInstance();
		//计算出生日的年.月.日
		calender.setTime(birthday);
		int birthYear = calender.get(Calendar.YEAR);
		int birthMonth = calender.get(Calendar.MONTH);
		int birthDate = calender.get(Calendar.DATE);
		
		//计算当前的年.月.日
		calender.setTime(new Date());
		int nowYear = calender.get(Calendar.YEAR);
		int nowMonth = calender.get(Calendar.MONTH);
		int nowDate = calender.get(Calendar.DATE);
		
		int age = nowYear-birthYear;
//		如果当前月份小 则年龄减1
		if(nowMonth<birthMonth) {
			age--;
		}else if(nowMonth==birthMonth && nowDate<birthDate){
			age--;
			//月份相同 当前的日期小 则年龄减去1
		}
		return age;
	}
	/**
	 * 计算剩余天数（比如到毕业的天数）
	 */
	public static int getRemainDays(Date future) {
		
		return (int )((future.getTime()- new Date().getTime())/millSecondsPerDay);
		
	}
	/**
	 * 判断是否是当天
	 */
	public static boolean isToday(Date date) {
		//年月日写在一起
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		
		String formatSrc = dateFormat.format(date);// 参数变成一个字符串
		
		String formatToday = dateFormat.format(new Date());// 把当前日期变成字符串
		
		return formatSrc.equals(formatToday);
		
	}
	
	
	/**
	 * 获取当月的月初
	 */
	public static Date getBeginOfMonth() {
		
		// 获取日历的实例
		Calendar instance = Calendar.getInstance();
		// 设置成当前的时间
		instance.setTime(new Date());
		instance.set(Calendar.SECOND, 0);// 设置0秒
		instance.set(Calendar.MINUTE, 0);// 设置0分
		instance.set(Calendar.HOUR, 0);// 设置0小时
		instance.set(Calendar.AM_PM, Calendar.AM);// 设置上午
		instance.set(Calendar.DATE, 1);// 设置1日
		
		return instance.getTime();
	}
	
	/**
	 * 获取当前月的月末
	 * @return
	 */
	public static Date getEndOfMonth() {
		// 获取日历的实例
		Calendar instance = Calendar.getInstance();
		// 设置成当前的时间
		instance.setTime(new Date());
		instance.add(Calendar.MONTH, 1);// 月份加1
		
		// 下列代码设置成月初
		instance.set(Calendar.SECOND, 0);// 设置0秒
		instance.set(Calendar.MINUTE, 0);// 设置0分
		instance.set(Calendar.HOUR, 0);// 设置0小时
		instance.set(Calendar.AM_PM, Calendar.AM);// 设置上午
		instance.set(Calendar.DATE, 1);// 设置1日
		
		// 减去一秒 变成当月的月末
		instance.add(Calendar.SECOND, -1);// 秒减去1
		return instance.getTime();
		
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	public static boolean  isThisWeek(Date date) {

		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

		Calendar firstDayOfWeek = Calendar.getInstance(Locale.getDefault());

		firstDayOfWeek.setFirstDayOfWeek(Calendar.MONDAY);

		int day = firstDayOfWeek.get(Calendar.DAY_OF_WEEK);

		firstDayOfWeek.add(Calendar.DATE, -day+1+1);// 后面的+1是因为从周日开始

		// 本周一的日期

		System.out.println(format.format(firstDayOfWeek.getTime()));

		Calendar lastDayOfWeek = Calendar.getInstance(Locale.getDefault());

		lastDayOfWeek.setFirstDayOfWeek(Calendar.MONDAY);

		day = lastDayOfWeek.get(Calendar.DAY_OF_WEEK);

		lastDayOfWeek.add(Calendar.DATE, 7-day+1);

		// 本周星期天的日期

		System.out.println(format.format(lastDayOfWeek.getTime()));
		
		return (date.getTime()<lastDayOfWeek.getTime().getTime() &&
				date.getTime()>firstDayOfWeek.getTime().getTime() );

	}
}
