/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.study.singleton.LazySimpleSingleton;

/**
 * @Author gaoruiqiang
 * @Description
 * @create:2020/1/5
 */
public class LazyInnerClassSingleton {


    private LazyInnerClassSingleton() {
        //反射可以破坏单例,需要在无参构造中加判断
        if (LazyHolder.lazy != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    //static是为了使单例的空间共享,保证这个方法不会被重写,重载
    public static final LazyInnerClassSingleton getInstance() {
        //返回结果之前,一定会先加载内部类
        return LazyHolder.lazy;
    }

    ///默认使用LazyInnerClassGeneral 的时候，会先初始化内部类
    //如果没使用的话，内部类是不加载的
    private static class LazyHolder {
        private static final LazyInnerClassSingleton lazy = new LazyInnerClassSingleton();
    }

    //反序列化时会破坏单例
    //反序列化将已经持久化的字节码内容，转换为IO流
    //通过IO流的读取，进而将读取的内容转换为Java对象
    //在转换过程中会重新创建对象new
    //重写 readResolve() 方法可以解决这个问题,但是只不过是覆盖了反序列化出来的对象
    //还是创建了俩次,发生在JVM层面,比较安全,但是内存依旧会有开销
    //之前反序列化出来的对象会被GC回收
    private Object readResolve() {
        return LazyHolder.lazy;
    }

}
