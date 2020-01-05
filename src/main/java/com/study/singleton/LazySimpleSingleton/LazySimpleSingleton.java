/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.singleton.LazySimpleSingleton;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020/1/5
 */
public class LazySimpleSingleton {
    /*
     * 懒汉式单例
     * 在外部需要使用的时候才进行实例化
     * */
    private LazySimpleSingleton() {
    }

    //静态块，公共内存区域
    private static LazySimpleSingleton lazy = null;

    /*
     * 用synchronized 加锁，在线程数量比较多情况下，如果CPU 分配压力上升，会导致大批
     * 量线程出现阻塞，从而导致程序运行性能大幅下降。
     * */
    public synchronized static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

}
