package com.newer.exam.utility;

import java.util.Random;

public class ExamCodeUtil {
	  public static String genUniqueKey(){

	        Random random = new Random();

	        Integer number = random.nextInt(900000) + 100000;

	        return System.currentTimeMillis() + String.valueOf(number);
	    }
//	  public static void main(String[] args) {
//        String uniqueKey = genUniqueKey();
//        System.out.println(uniqueKey);
//    }
}
