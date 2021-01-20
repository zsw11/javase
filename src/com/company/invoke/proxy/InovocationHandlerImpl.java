package com.company.invoke.proxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zsw
 * @date 2021/1/11 15:50
 * @description : 委托类实现
 */
public class InovocationHandlerImpl implements java.lang.reflect.InvocationHandler {
    /**
     * 中间类持有委托类对象的引用
     */
    private Object proxy;

    public InovocationHandlerImpl(Object proxy) {
        this.proxy = proxy;
    }

    /**
     * 动态生成代理类对象,Proxy.newProxyInstance
     *
     * @return 返回代理类的实例
     */
    public Object newProxyInstance() {
        return Proxy.newProxyInstance(
                // 指定代理对象的类加载器
                proxy.getClass().getClassLoader(),
                //代理对象需要实现的接口，可以同时指定多个接口
                proxy.getClass().getInterfaces(),
                //方法调用的实际处理者，代理对象的方法调用都会转发到这里
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("处理之前添加业务逻辑：哈哈哈");
        Object invoke = method.invoke(proxy, args);
        System.out.println("处理之后添加业务逻辑");
        return invoke;
    }

    public static void main(String[] args) {
        // 实现接口的委托类，使用jdk的动态代理
        InovocationHandlerImpl inovocationHandler = new InovocationHandlerImpl(new IhelloServiceImpl());
        IhelloService ihelloService = (IhelloService) inovocationHandler.newProxyInstance();
        ihelloService.say("zsw");
    }
}
