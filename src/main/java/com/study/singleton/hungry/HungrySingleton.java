/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.singleton.hungry;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020-01-05 10:13:45
 */
public class HungrySingleton {
    /*
     * 饿汉式单例
     * 它在类加载的时候就立即初始化,并且创建单例对象
     * 优点:没有加任何的锁,执行效率比较高,用户体验上来说比懒汉式更好
     * 缺点:类加载的时候就初始化,不管用或者不用,都占着空间,浪费了内存
     *
     * 绝对线程安全,在线程还没有出现之前就实例化了,不可能存在访问安全问题
     * 饿汉式适用在单例对象较少的情况
     * */
    private static final HungrySingleton hungetSingleton = new HungrySingleton();

    //私有的无参构造
    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungetSingleton;
    }

}




