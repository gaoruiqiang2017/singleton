/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.singleton.hungry;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020/1/5
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSinglrton;

    //饿汉式静态块单例
    static {
        hungryStaticSinglrton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getHungryStaticSinglrton() {
        return hungryStaticSinglrton;
    }
}
