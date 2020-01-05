/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.singleton.LazySimpleSingleton;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020/1/5
 */
public class LazyDoubleCheckSingleton {

    private LazyDoubleCheckSingleton() {
    }

    //静态块，公共内存区域
    //volatile:指令重排序
    private volatile static LazyDoubleCheckSingleton lazy = null;

    //双重检查锁
    public static LazyDoubleCheckSingleton getInstance() {
        if (lazy == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }

}
