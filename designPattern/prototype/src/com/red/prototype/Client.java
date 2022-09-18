package com.red.prototype;

/**
 * 访问类
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建一个原型类对象
        Realizetype realizetype = new Realizetype();

        //调用原型类中的clone方法进行对象的克隆
        Realizetype clone = realizetype.clone();

        System.out.println("原型对象和克隆出来的是否是同一个对象" + (realizetype == clone));//false
    }
}
