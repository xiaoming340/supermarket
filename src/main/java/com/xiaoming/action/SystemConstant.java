package com.xiaoming.action;

import java.util.ArrayList;

public class SystemConstant {
	
	// keep in session
	public static final String USER = "user";
	
	public static final ArrayList<String> allTitle = new ArrayList<String>() {
	{
		add("Super manager");
		add("Manager");
		add("Casher");
		add("Staff");
	}};

	public static final int SUPER_MANAGER = 1;
	public static final int MANAGER = 2;
	public static final int CASHER = 3;
	public static final int STAFF = 4;
	
	public static String titleIDToString(int t) {
		if(t > 0 && t <= allTitle.size())
			return allTitle.get(t-1);
		return new String("No Title");
	}
	
	public static int titleStringToID(String t) {
		for(int i=0; i<allTitle.size(); i++) {
			if(t.equals(allTitle.get(i)))
				return i+1;
		}
		return -1;
	}
	
	public static boolean isValidTitle(String t) {
		for(int i=0; i<allTitle.size(); i++) {
			if(t.equals(allTitle.get(i)))
				return true;
		}
		return false;
	}
	
	public static int getSexNum(String t) {
		if(t.equals("male") || t.equals("Male"))
			return 1;
		else if(t.equals("female") || t.equals("Female"))
			return 2;
		return -1;
	}
	
	public static boolean isValidSex(String t) {
		if(t.equals("male") || t.equals("Male") || t.equals("female") || t.equals("Female"))
			return true;
		return false;
	}
	
	public static String getSexString(int a) {
		if(a == 1)
			return "male";
		else if(a == 2)
			return "female";
		return "error";
	}
}
