package com.zsw_2020.data_2_21;

/**
 * 可变参数，可以为其传递任意数量的指定类型的实际参数
 */
public class VarargsTest {
   public static double avg(double ... values){
       double sum =0;
       for(int i=0;i<values.length;i++){
           sum = sum+values[i];
       }
       double avg = sum/values.length;
       return avg;
   }

    public static void main(String[] args) {
        System.out.println(avg(90,89,89,33,45));
    }

}
