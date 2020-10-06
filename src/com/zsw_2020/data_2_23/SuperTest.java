package com.zsw_2020.data_2_23;

/**
 * 面向对象：继承封装多态
 * 类的继承：
 * 方法的覆盖，重载
 * Super关键字：用来引用当前对象的超类
 */
    class Super{
        int x,y;

        public Super() {
            System.out.println("Create Super");
            setXY(5,5);
        }

        private void setXY(int x, int y) {
            this.x= x;
            this.y=y;
        }
        public void display(){
            System.out.println("x="+x+",y="+y);
        }
    }
    class Sub extends Super{
        int x,z;//隐藏了超类Super中的变量x

        public Sub() {
            this(10,10);
        }

        public Sub(int x, int z) {
            super();//调用超类的默认构造方法
            this.x= x;
            this.z= z;
        }
        @Override
        public void display(){//覆盖了超类Super的display方法
            super.display();//访问超类的display方法
            System.out.println("x="+x+",y="+y+",z="+z); //父类的y
            System.out.println("super.x="+super.x+",super.y="+super.y);
        }
    }
public class SuperTest {
    public static void main(String[] args) {
        Sub b =new Sub();
        b.display();
    }
}
