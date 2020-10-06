package com.zsw_2020.data_2_17;

import java.util.Scanner;
/**
 * 循环结构
 */
public class WhileDemo {
    public static void main(String[] args) {
//        seriesSum();
//        GuessNumber();
//        DoWhileDemo();
//        nineTable();
//        breakDemo();
//        continueDemo();
        primeNumber();
    }

    /**
     * 计算1/3+3/5+5/7+....+97/99
     */
    static void seriesSum(){
        int n= 1;
        double sum = 0;
        while(n<=97){
            sum =  sum + (double) n / (n + 2);
            n=n+2;
        }
        System.out.println("sum="+sum);
    }

    /**
     * 猜数 while
     */
    static void GuessNumber(){
        int magic = (int) (Math.random()*101+100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数：");
        System.out.println("生产的书是："+magic);
        int guess = scanner.nextInt();
        while(magic!=guess){
            if(magic>guess)
                System.out.println("你猜小了");
            else
                System.out.println("你猜大了");
                guess = scanner.nextInt();
        }
            System.out.println("你猜对了!\n该数是"+guess);

    }

    /**
     * 计算输入数的平均值和总数do while
     */
    static void DoWhileDemo(){
        double sum =  0;
        double avg = 0;
        int n=0;
        double number;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("请输入一个数：");
            number = input.nextDouble();
            if(number!=0){
                sum = sum+number;
                n = n+1;
            }
        }while (number!=0);
        avg = sum/n;
        System.out.println("sum="+sum+",arg="+avg);
    }
    /**
     * 乘法表,for循环
     */
    static void nineTable(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.print("\n");
        }
    }
    /**
     * break 跳出当前的循环体
     * continue 跳出终止执行当前的迭代，导致控制权从下一次迭代开始
     */
    static void breakDemo(){
        start:
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==2){
                    System.out.println("start结束了");
                    break start;
                }
                System.out.println(i+";"+j);
            }
        }
    }
      static void continueDemo(){
        start:
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==1){
                    System.out.println("i=1被continue了");
                    continue start;
                }
                System.out.println(i+";"+j);
            }
        }
    }
    /**
     * 输出前50位素数
     */
    static void primeNumber(){
        int count = 0;
        int number = 2;
        boolean isPrime;
        System.out.println("The first 50 primes are：\n");
        while (count<50){
            isPrime = true;
            for(int a=2;a*a<=number;a++){
                if(number%a==0){/*自己和自己的1/2对比相除*/
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                count++;
                if(count%10==0){
                    System.out.println(number);
                }else{
                    System.out.print(number+" ");
                }
            }
            number++;
        }

    }


}
