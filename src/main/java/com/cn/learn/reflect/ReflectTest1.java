package com.cn.learn.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 反射
 * https://www.cnblogs.com/zhengbin/p/5346907.html
 *
 */
public class ReflectTest1 {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Demo d = null;
        /*    Class 在API中的解释：
         * 
         *  Class 类的实例表示正在运行的 Java 应用程序中的类和接口
         *  每个数组属于被映射为 Class 对象的一个类，所有具有相同元素类型和维数的数组都共享该 Class 对象
         *  基本的 Java 类型（boolean、byte、char、short、int、long、float 和 double）和关键字 void 也表示为 Class 对象
         *  Class 没有公共构造方法。Class 对象是在加载类时由 Java 虚拟机以及通过调用类加载器中的 defineClass 方法自动构造的
         *  
         */
        Class<?> c = Class.forName("com.cn.learn.java.reflect.Demo");
        System.out.println(c.getName());

        d = (Demo)c.newInstance();
        d.setUsername("zhengbin");
        d.setPassword("19950906");
        System.out.println(d);
        
        // 获得反射类的父类
        System.out.println(d.getClass().getSuperclass().getName());
        
        // 获得类中的全部构造函数
        Constructor<?> cons[] = c.getConstructors();
        for(int i = 0;i < cons.length;i++){
            System.out.println(cons[i]);
        }
        
        System.out.println("---------本类的所有属性----------");
        // 获得本类的所有属性
        Field[] field = c.getDeclaredFields();
        for (int i = 0; i < field.length; i++) {
            // 权限修饰符
            int mo = field[i].getModifiers();
            // 获得属性名
            String priv = Modifier.toString(mo);
            // 属性类型
            Class<?> type = field[i].getType();
            System.out.println(priv + " " + type.getName() + " "
                    + field[i].getName() + ";");
        }
        
        System.out.println("---------实现的接口或者父类的属性----------");
        // 取得实现的接口或者父类的属性
        Field[] filed1 = c.getFields();
        for (int j = 0; j < filed1.length; j++) {
            // 权限修饰符
            int mo = filed1[j].getModifiers();
            String priv = Modifier.toString(mo);
            // 属性类型
            Class<?> type = filed1[j].getType();
            System.out.println(priv + " " + type.getName() + " "
                    + filed1[j].getName() + ";");
        }
    }
    
}



interface TestInterface {

	public static String username = "zhengbin";
    public static String password = "19950906";
    
    
    public String add();
    
}


class Demo implements TestInterface{
    private String username;
    private String password;
    
    public Demo() {
        super();
    }

//    public Demo(String username, String password) {
//        super();
//        this.username = username;
//        this.password = password;
//    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String toString() {
        return "Demo [username=" + username + ", password=" + password + "]";
    }
    public String add(){
        return "add()";
    }
}
