/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.singleton.LazySimpleSingleton;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020/1/5
 */
public class ExectorThread implements Runnable {

/*    @Override
    public void run() {
        LazySimpleSingleton lazy = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazy);
    }*/

    /*    @Override
        public void run() {
            LazyDoubleCheckSingleton lazy = LazyDoubleCheckSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ":" + lazy);
        }*/
    @Override
    public void run() {
        LazyInnerClassSingleton lazy = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazy);

    }
}