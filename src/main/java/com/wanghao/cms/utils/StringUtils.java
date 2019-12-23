package com.wanghao.cms.utils;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringUtils {

	
//	随机字符串源
	static char array[] = new char[36];
	static {
		for (int i = 0; i < 10; i++) {
			array[i]=(char)('0'+i);
		}
		for (int i = 0; i < 26; i++) {
			array[i+10]=(char)('A'+i);
		}
	}
	/**
	 * 判断一个字符串是否为空,空字符串也认为是空
	 */
	public static boolean idBlank(String str) {
		if(str!=null && !"".equals(str.trim())) {
			return true;
		}
		return false;
	}
	/**
	 * 姓名不能有数字
	 */
	public static boolean notNumber(String str) {
		String reg = "\\d{1,}";
		Pattern compile = Pattern.compile(reg);
		Matcher matcher = compile.matcher(str);
		boolean find = matcher.find();
		return !find;
	}
	
//	判断手机号格式是否正确
	public static boolean idMoblie(String str) {
		String reg = "^(137|138|152)\\d{8}$";
//		boolean matches = str.matches(reg);
		Pattern compile = Pattern.compile(reg);
		Matcher matcher = compile.matcher(str);
		boolean find = matcher.find();
		return find;
	}
	
	
	/**
	 * 大写字母串
	 * @param n
	 * @return 
	 */
	public static String getRandomStr(int n) {
		
		 Random random = new Random();
		//容器
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			char randomChar = (char)('A'+random.nextInt(26));//random.nextInt() 1-25 是因为A 本身就是一个值 再加25个就是Z
			sb.append(randomChar);
		}
		return sb.toString();
	}
	
		/** 
		   * 获取英文和数字组合的字符串 
		 * @param n 
		 * @return 
		 */ 

	public static String getRandomStrNum(int n) {
		
		//获取随机字符串
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			int index = random.nextInt(36); //0-26
			char randomChar = array[index];
			sb.append(randomChar);
		}
		return sb.toString();
	}
	
	/**
	 * 随机获取一个中文汉字
	 * @return
	 */
	public static String getGb2312() {
		
		byte word[] = new byte[2];
		//0xA1 0x10 39 94 
		Random random = new Random();
		word[0]=(byte)(0xA1+0x10+random.nextInt(39));
		word[1]=(byte)(0xA1+random.nextInt(94));
		try {
			String string = new String(word,"GBK");
			return string ;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 随机获取多个中文汉字
	 * @return
	 */
	public static String getGb2312s(int n) {
		StringBuilder sb = new StringBuilder();
		byte word[] = new byte[2];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			
			try {
				//0xA1 0x10 39 94 
				word[0]=(byte)(0xA1+0x10+random.nextInt(39));
				word[1]=(byte)(0xA1+random.nextInt(94));
				String string = new String(word,"GBK");
				sb.append(string);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sb.toString() ;
	}
	
	
	/**
	 * 判断是否为数字
	 * @param str
	 * @return
	 */
	public static boolean isNumber(String str) {
		String regex = "^\\d{1,}$";
		Pattern compile = Pattern.compile(regex);
		Matcher matcher = compile.matcher(str);
		boolean find = matcher.find();
		return find;
	}
	
	/**
	 * 判断是否为数字且长度是否为11位
	 * @param str
	 * @return
	 */
	public static boolean judgeTelephoneIsOk(String src){
		String regex = "^\\d{1,}$";
		Pattern compile = Pattern.compile(regex);
		Matcher matcher = compile.matcher(src);
		boolean find = matcher.find();
		if(find) {
			String regex2 = "^(1)\\d{10}$";
			boolean matches = src.matches(regex2);
			return matches;
		}
		return false;
		
	}
	
	/**
	 * 验证邮箱
	 */
	public static boolean isEmail(String str) {
		
		String pattern = "^\\w+@\\w+\\.[a-zA-Z]{2,3}$";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(str);
		return matcher.matches();
	}
	
	/**
	 * 过滤String参数空格后判断是否有值
	 */
	public static boolean hasText(String str) {
		
		String trim = str.trim();
		return trim!=null;
	}
	
	
	/**
	 * 验证是否是URL
	 * @param url
	 * @return
	 */
//	public static boolean isHttpUrl(String str){
//		
//		 //转换为小写
//        str = str.toLowerCase();
//        String regex = "^((https|http|ftp|rtsp|mms)?://)"  //https、http、ftp、rtsp、mms
//                + "?(([0-9a-z_!~*'().&=+$%-]+: )?[0-9a-z_!~*'().&=+$%-]+@)?" //ftp的user@  
//               + "(([0-9]{1,3}\\.){3}[0-9]{1,3}" // IP形式的URL- 例如：199.194.52.184               
//                 + "|" // 允许IP和DOMAIN（域名） 或单域名
//                 + "[0-9a-z]*"  // 或单域名
//                 + "|" // 允许IP和DOMAIN（域名） 或单域名
//                 + "([0-9a-z_!~*'()-]+\\.)*" // 域名- www.  
//                 + "([0-9a-z][0-9a-z-]{0,61})?[0-9a-z]\\." // 二级域名  
//                + "[a-z]{2,6})" // first level domain- .com or .museum  
//                + "(:[0-9]{1,5})?" // 端口号最大为65535,5位数
//                + "((/?)|" // a slash isn't required if there is no file name  
//                + "(/[0-9a-z_!~*'().;?:@&=+$,%#-]+)+/?)$";  
//        return  str.matches(regex);	
//	}
	/**
	 * 地址判断
	 * @param url
	 * @return
	 */
	public static boolean isHttpUrl(String url) { 
        String regex = "(https?://(w{3}\\.)?)?\\w+\\.\\w+(\\.[a-zA-Z]+)*(:\\d{1,5})?(/\\w*)*(\\??(.+=.*)?(&.+=.*)?)?"; 
        return Pattern.matches(regex, url); 
   }
}
