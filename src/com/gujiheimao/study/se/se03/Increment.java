package com.gujiheimao.study.se.se03;

public class Increment {
    public static void main(String[] args) {
        MoveLeft();
        System.out.println((byte)(-1>>>2));
    }

    public static void demo() {
        //自增运算符
        int num = 1;
        num++;//num自增1
        System.out.println(num);//结果为2
        //也可以在变量前面进行自增
        int num2 = 1;
        ++num2;//num2自增1
        System.out.println(num2);//结果为2
        //这里需要知道一下i++和++i的区别
        int i = 1;
        System.out.println(i++);//结果为1
        System.out.println(i);//结果为2
        System.out.println(++i);//结果为3
        //因为第一个输出，是i++,先执行输出，再执行自增，所以输出为1
        //第三个输出，是++i，先执行自增，再执行输出，所以输出为3

        //也可以在运算中混合使用，但是不推荐，容易出现问题
        int res = 1 + i++;//结果为4
        res = ++i + 1;
        System.out.println(res);//结果为5
        //i=4
    }


    public static void XOR() {
        int i = 6,j=5;
        System.out.println(i^j);

    }
    public static void  MoveLeft() {
        int i = 6;
        System.out.println((byte)(i<<6));
    }

}