package com.wanghao.cms.utils;

public class NumberUtil {
	/**
	 * 根据传递车牌号码 判断是否符合单双号限行规则
	 * @param num
	 * @return
	 */
	public static boolean isOddNumber(int num) {
		Boolean flag = null;
		if (num % 2 == 0) {
			flag = false;
		}else {
		flag = true;
		}
		return flag;
	}

	
}
