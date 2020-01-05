/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.singleton.register;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020/1/5
 */
public enum EnumSingleton {
    INSTANCE;

    /*
     * 枚举式单例,也是注册时单例中的一中
     * 枚举式单例在静态代码块中就给INSTANCE 进行了赋值，是饿汉式单例的实现
     * 枚举类型其实通过类名和Class 对象类找到一个唯一的枚举对象。因此，枚举对
     * 象不可能被类加载器加载多次,因此序列化破坏不了单例
     * Constructor 的 newInstance()方法中做了强制性的判断，如果修饰符是Modifier.ENUM 枚举类型，
     * 直接抛出异常,因此反射破坏不了单例
     *
     * */
    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

}
