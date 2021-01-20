package com.company.invoke.proxy;

/**
 * @author zsw
 * @date 2021/1/11 15:52
 * @description :
 */
public interface IhelloService {
    void say(String name);
}

class IhelloServiceImpl implements  IhelloService{

    @Override
    public void say(String name) {
      System.out.println("Servie say :"+name);
    }
}
