package com.cn.learn.generic;

/**
 * 泛型接口
 * https://www.cnblogs.com/zhengbin/p/5343126.html
 *
 */
public class Test1 {

	public static void main(String[] args) {
        FruitGenerator generator = new FruitGenerator();
        
        System.out.println(generator.next());
        System.out.println(generator.next());
        System.out.println(generator.next());
        System.out.println(generator.next());
    }
    
}
