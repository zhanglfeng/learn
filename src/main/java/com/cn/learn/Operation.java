package com.cn.learn;

/**
 * Java中'&'与、'|'或、'^'异或、'<<'左移位、'>>'右移位
 * 
 */
public class Operation {

	public static void main(String[] args) {
		/*
         * &：与运算
         *     全为1则为1，否则为0
         */
        System.out.print(1 & 0);
        System.out.print("--");
        System.out.print(1 & 1);
        System.out.print("--");
        System.out.println(0 & 0);
        // out:0--1--0
        
        /*
         * |：或运算
         *     全为0则为0，否则为1
         */
        System.out.print(1 | 0);
        System.out.print("--");
        System.out.print(1 | 1);
        System.out.print("--");
        System.out.println(0 | 0);
        // out:1--1--0
        
        /*
         * ^：异或运算
         *     相同为0，不同为1
         */
        System.out.print(1 ^ 0);
        System.out.print("--");
        System.out.print(1 ^ 1);
        System.out.print("--");
        System.out.println(0 ^ 0);
        // out:1--0--0
        
        
        
        // ==============================================
        
        
        int integer = 2;
        printBinary(integer);
        integer = 2 >> 1;
        printBinary(integer);
        integer = 2 >> 2;
        printBinary(integer);
        integer = 2 >> 3;
        printBinary(integer);
        System.out.println("====================");
        integer = 2 << 1;
        printBinary(integer);
        integer = 2 << 2;
        printBinary(integer);
        integer = 2 << 3;
        printBinary(integer);
        System.out.println("====================");
        integer = -2 << 1;
        printBinary(integer);
        System.out.println("====================");
        integer = -2 >> 1;
        printBinary(integer);
        System.out.println("====================");
        integer = 3 >> 1;
        printBinary(integer);
        System.out.println("====================");
        integer = -2;
        printBinary(integer);
        printBinary(integer>>>1);
        printBinary(-integer);
        printBinary(-integer>>>1);
        

	}
	
	
	
	private static void printBinary(Integer integer) {
        System.out.println("Integer.toBinaryString()="+Integer.toBinaryString(integer)+", integer="+integer);
    }

}
