package com.zsw_2020.data_2_21;

/**
 * 杨辉三角
 */
public class YangHui {
    public static void main(String[] args) {
        int i, j;
        int level = 10;
        int yanghui[][] = new int[level][];
        for(i=0;i<yanghui.length;i++){
            yanghui[i] = new int[i+1];//每一行个数
        }
        //为yanghui数组的每一个元素复值
        yanghui[0][0]=1;
        for(i=1;i<yanghui.length;i++){
            yanghui[i][0]=1;
            for(j=1;j<yanghui[i].length-1;j++){
                yanghui[i][j] = yanghui[i-1][j-1]+yanghui[i-1][j];
                yanghui[i][yanghui[i].length-1] =1;
            }
        }
        //打印输出yanghui数组的每一个元素
        for(i=0;i<yanghui.length;i++){
            for(j=0;j<yanghui[i].length;j++){
                System.out.print(yanghui[i][j]+" ");
            }
            System.out.println();
        }
    }
}
