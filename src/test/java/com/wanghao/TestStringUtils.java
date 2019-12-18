//package com.wanghao;
//
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import com.wanghao.cms.utils.StringUtils;
//
//public class TestStringUtils {
//
//	@Test//判断是否是空串
//	public void testIsBlank() {
//		String str =" 123 ";
//		boolean idBlank = StringUtils.idBlank(str);
//		Assert.assertTrue(idBlank==true);
//	}
//	@Test//手机号格式是否正确
//	public void testIdMoblie() {
//		String str ="15242860126";
//		boolean idMoblie = StringUtils.idMoblie(str);
//		Assert.assertTrue(idMoblie==true);
//	}
//	
//	@Test//获取数字的字符串
//	public void testGetRandomStr() {
//		String randomStr = StringUtils.getRandomStr(20);
//		System.out.println(randomStr);
//		Assert.assertTrue(randomStr.length()==20);
//	}
//	
//	
//	@Test//获取英文和数字组合的字符串
//	public void testGetRandomStrNum() {
//		 String randomStrNum = StringUtils.getRandomStrNum(50);
//		 System.out.println(randomStrNum);
//		Assert.assertTrue(randomStrNum.length()==50);
//	}
//	
//	@Test//获取单个汉字
//	public void testGetGb2312() {
//			
//			StringUtils.getGb2312();
//	}
//	
//	@Test//获取多个汉字
//	public void testGetGb2312s() {
//		String gb2312s = StringUtils.getGb2312s(10);
//		System.out.println(gb2312s);
//	}
//	
//	@Test//邮箱测试
//	public void testIsEmail() {
//		 boolean flag = StringUtils.isEmail("1370357690@qq.com");
//		System.out.println(flag);
//	}
//	@Test//测试判断手机号码是否为数值，是否长度为11位，开始位必须是1
//	public void testJudgeTelephoneIsOk() {
//		boolean flag = StringUtils.judgeTelephoneIsOk("17606121473");
//		System.out.println(flag);
//	}
//	
//	
//	
//}
