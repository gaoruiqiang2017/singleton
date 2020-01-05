/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.singleton.LazySimpleSingleton;

import com.sun.org.apache.xpath.internal.operations.Variable;

import java.lang.reflect.Constructor;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020/1/5
 */
public class LazySingletonTest {


/*    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExectorThread());
        Thread thread2 = new Thread(new ExectorThread());
        thread1.start();
        thread2.start();
        System.out.println("End");

    }*/

    public static void main(String[] args) throws NoSuchMethodException {
        LazyInnerClassSingleton l1 = LazyInnerClassSingleton.getInstance();
        try {
            //反射
            Class<?> clazz = LazyInnerClassSingleton.class;
            //通过反射拿私有构造方法
            Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(null);
            //强吻
            declaredConstructor.setAccessible(true);
            Object o = declaredConstructor.newInstance();

            //如果不在构造方法中加判断,结果为false,说明已经不是单例了
            System.out.println(l1 == o);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("End");

    }


}
