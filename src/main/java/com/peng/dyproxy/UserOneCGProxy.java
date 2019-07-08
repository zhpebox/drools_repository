package com.peng.dyproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Auther: zhangpeng
 * @Date: 2019/7/8
 */
public class UserOneCGProxy {
    public static UserOne getUser(){

        Enhancer en = new Enhancer();
        en.setSuperclass(UserOne.class);
        en.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("开始");
                Object result = methodProxy.invokeSuper(o,objects);
                System.out.println("结束");
                return result;
            }
        });


        return (UserOne) en.create();
    }
}
