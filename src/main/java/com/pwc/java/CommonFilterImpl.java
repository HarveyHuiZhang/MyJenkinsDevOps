package com.pwc.java;

public class CommonFilterImpl implements CommonFilter {

	public boolean filter(String flag) {
		System.out.println("#### Start to check login info ###");
		System.out.println("#### End to check login info ###");
		if (null == flag) {
			return false;
		} else if ("A".equals(flag)) {
			return true;
		} else {
			return false;
		}

	}

}
