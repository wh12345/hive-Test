package com.wh.hadoop.hive.test;

import java.util.HashMap;
import org.apache.hadoop.hive.ql.exec.UDF;

public class PhonNumberToArea extends UDF {
	private static HashMap<String, String> areaMap = new HashMap<String,String>();
	static {
		areaMap.put("135", "shaoguan");
		areaMap.put("187", "yongzhou");
		areaMap.put("182", "hengyang");
	}
	public String evaluate(String phoneNumber) {
		String result = areaMap.get(phoneNumber.substring(0, 3))==null ? ( phoneNumber+"  "+"huoxing"):(phoneNumber +"  "+areaMap.get(phoneNumber.substring(0, 3)));
		return result;
	}
}
