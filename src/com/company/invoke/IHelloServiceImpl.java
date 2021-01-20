package com.company.invoke;

/**
 * @author zsw
 * @date 2021/1/11 15:10
 * @description :接口实现类
 */
public class IHelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String userName) {
        return "helloService:" + userName;
    }

    /**
     * 代理类
     */
    public static class StaticProxyHello implements IHelloService {
        private IHelloService iHelloService = new IHelloServiceImpl();
        @Override
        public String sayHello(String userName) {
            System.out.println("代理对象包装礼盒...");
            return iHelloService.sayHello(userName);
        }
    }

    public static void main(String[] args) {
        StaticProxyHello staticProxyHello = new StaticProxyHello();
        String isole = staticProxyHello.sayHello("isole");
        System.out.println(isole);
    }
}
