package com.cn.learn;

import java.util.Arrays;

public class LxTest {

	public static void main(String[] args) {
/*
		int[] arr = { 2, 9, 5, 4, 8, 1 };
		
		System.out.println("原始数组: " + Arrays.toString(arr));
		
		int[] a1 = arr;
		System.out.println("a1: " + Arrays.toString(a1));
		
		a1[2] = 7;
		System.out.println("a1--: " + Arrays.toString(a1));
		
		System.out.println("arr----" + Arrays.toString(arr));
		
		
		
		
		
		String str1 = "aaa";
		String str2 = str1;
		str2 = "bbb";
		System.out.println("str1----" + str1);
		System.out.println("str2----" + str2);
		
		
		
		
		Staudent zs = new Staudent("张三"); 
		System.out.println(zs.getName());
		
		Staudent ls = zs;
		System.out.println(ls.getName());
		
		ls.setName("李四");
		System.out.println(ls.getName());
		
		System.out.println(zs.getName());
		
		*/
		
		
		
		
		
		
		
		System.out.println(encrypt(123L));
		
		System.out.println(decrypt(encrypt(123L)));
		
		
		
	}
	
	
	
	
	private static final long KEY = 10000000L;
	
	/**
     * 将coin加密成可以存在zset的值，实际上就是 coin * 10000000 + now % 10000000
     * @param coin
     * @return
     */
    public static Double encrypt(Long coin){
        Long value = coin * KEY + (KEY - 1568805419 % KEY);
        return value.doubleValue();
    }

    /**
     * 将zset的值转成long型的coin
      * @param value
     * @return
     */
    public static Long decrypt(Double value){
        Double coin = value / KEY;
        return coin.longValue();
    }
	
	
	

}




class Staudent {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public Staudent() {
	}

	public Staudent(String name) {
		this.name = name;
	}
	
}



