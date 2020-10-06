package com.zsw_2020.data_2_21;

/**
 * 实例抽取4张牌
 */
public class DeckCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits= {"黑桃","红桃","方块","梅方"};
        String[] ranks={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        //初始化每一张牌
        for(int i=0;i<deck.length;i++){
            deck[i]=i;
        }
        //打乱牌序
        for(int i=0;i<deck.length;i++){
            int index = (int) (Math.random()*deck.length);
            int temp = deck[i];
            deck[i] = deck[index]; //将当前元素与产生的元素交换
            deck[index] = temp;
        }
//        for(int i:deck){
//            System.out.println(deck[i]);
//        }
        System.out.println("所抽取的4张牌为：");
        //显示前4个数
        for(int i=0;i<4;i++){
            String suit = suits[deck[i]/13];//确定花色
            String rank = ranks[deck[i]%13];//确定次序
            System.out.println(suit+rank);
        }

    }
}
