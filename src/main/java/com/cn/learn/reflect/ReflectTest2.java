package com.cn.learn.reflect;


import java.lang.reflect.Method;


/**
 * 反射
 * https://www.cnblogs.com/zhengbin/p/5346907.html
 * 
 * 现在要求: 
 * 
 *　(1) 你不能使用 HelloWorld hw = new HelloWorld()，但是要构建一个HelloWorld的实例来
 * 
 *　(2) 调用 sayHello() 方法，但是不能直接用 HelloWorld实例的 hw.sayHello() 方法
 * 
 */
public class ReflectTest2 {
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
	@org.junit.Test
    public void test1(){
        try {
            Class c = Class.forName("com.cn.learn.java.reflect.Say");
            Object o = c.newInstance();
            
            Method m = c.getDeclaredMethod("sayHello");
            m.invoke(o);
            
            Method m1 = c.getDeclaredMethod("sayName", String.class);
            m1.invoke(o, "zhengbin");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}



class Say{
	
    public void sayHello(){
        System.out.println("Hello World");
    }
    
    public void sayName(String name){
        System.out.println("Hello "+name);
    }
    
}


