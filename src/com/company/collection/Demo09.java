package com.company.collection;

/**
 * @author zsw
 * @date 2020/12/31 14:32
 */
public class Demo09 {
    public static void main(String[] args) {
//        int sun = MySun(5);
//        System.out.println(sun);
//        SingletonLinked singletonLinked = new SingletonLinked(0);
//        boolean empty = singletonLinked.isEmpty();
//        singletonLinked.addHead("sese");
//        singletonLinked.addHead("sese2");
//        singletonLinked.addHead("sese3");AdvertisementDailyUnionTotalService
//        singletonLinked.addHead("sese");
//        singletonLinked.display(); // 遍历链表
        Student zsw = new Student("zsw", 23);
        Student.id =1;
        zsw.card="idCard";
        String name = zsw.getName();
        zsw.setName("ztyj");
        String name1 = zsw.getName();
        System.out.println("name:"+name+",name："+name1);
    }

    /**
     * 计算n的阶层
     *
     * @param i
     * @return
     */
    private static int MySun(int i) {
        if (i == 1) {
            return 1;
        }
        return i + MySun(i - 1);/*5+4+3+2+1*/
    }
}
