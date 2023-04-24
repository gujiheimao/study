package com.gujiheimao.study.se.se03;

import java.nio.ByteBuffer;

/**
 * 这里主要是添加java学习的几倍类型
 */
public class _03_BaseType {
    /**
     * 如果要学习java，那么绕不过去的就是基本类型，所有的数据都是基于基本类型来进行的扩展的
     * java的基本数据类型不多，只有8种，分别是：
     * 1.整数类型：byte,short,int,long
     * 2.浮点类型：float,double
     * 3.字符类型：char
     * 4.布尔类型：boolean
     * ps：之前接触过的String 不是基本数据类型，而是一个类
     * <p>
     * # 首先我们来看一下整数类型
     * 整数类型有4种，分别是byte,short,int,long，它们的区别在于占用的字节数不同，因此他们所能表示的数值范围也不同
     * java中所有的整形类型都是有符号的，也就是说它们都可以表示正数和负数，由此他们自然会用一个字节来表示正负
     * 也就是说，java中的整数类型都是以补码的形式来存储的
     * 1. byte类型占用1个字节，也就是8个bit，它的取值范围是-128~127
     * 2. short类型占用2个字节，也就是16个bit，它的取值范围是-32768~32767
     * 3. int类型占用4个字节，也就是32个bit，它的取值范围是-2147483648~2147483647
     * 4. long类型占用8个字节，也就是64个bit，它的取值范围是-9223372036854775808~9223372036854775807
     * <p>
     * 由于java中的整数类型都是有符号的，所以它们都是以补码的形式来存储的
     * 例如以byte来举例子
     * 0b 0000 0000 这个表示数字0，在这个数据上+1，就变成了0b 0000 0001，这个就是1
     * 再+1，就会有二进制的进位，变成了0b 0000 0010，这个就是2
     * 如果要用这个二进制的数来表示-1，那么就需要将0的全部的字节的位数反转，变成了0b 1111 1111，这个就是-1
     * 如果要+1，就会有二进制的进位，变成了0b 0000 0000，这个就是0，如果要表示-2，就需要将0的全部的字节的位数反转，变成了0b 1111 1110，这个就是-2
     * 相当于0b1111 1111 - 1 = 0b1111 1110
     * <p>
     * # 再来看一下浮点类型
     * 浮点类型有2种，分别是float,double，它们的区别在于占用的字节数不同，因此他们所能表示的数值范围也不同
     * 1. float类型占用4个字节，也就是32个bit，它的取值范围是-3.4028235E38~3.4028235E38
     * 2. double类型占用8个字节，也就是64个bit，它的取值范围是-1.7976931348623157E308~1.7976931348623157E308
     * <p>
     * float的定义方式是在数字后面加上F，例如3.14F，double的定义方式是在数字后面加上D，例如3.14D
     * float变量的定义方式是`float f = 3.14F`，double变量的定义方式是`double d = 3.14D`
     * 如果类型是double，那么可以省略D，例如`double d = 3.14`，因为java默认的浮点类型是double
     * 如果类型是float，那么必须加上F，例如`float f = 3.14F`
     * <p>
     * 他们的区别在于，float类型的精度只有double类型的一半，因此在精度要求不高的情况下，可以使用float类型来代替double类型
     * 他们的字节表示方式是一样的，都是以科学计数法的形式来表示的，例如3.14E2，这个就是3.14*10^2，也就是314
     * 以float举例，首先是一如既往的，使用一个比特来表示正负，然后是8个比特来表示指数，最后是23个比特来表示尾数
     * 例如3.14E2，这个就是3.14*10^2，也就是314，他的字节表示方式是0 1000 0010 0101 1000 0000 0000 0000 0000
     * 字节码解析 第一个0 是表示整个数字的正负
     * 1000 0010 表示指数,这个指数是以127为基数的，也就是说，这个指数是129-127=2
     * 0101 1000 0000 0000 0000 0000 表示尾数，这个尾数是以1为基数的，也就是说，这个尾数是1.0101 1000 0000 0000 0000 0000
     * 也就是说，这个数字的表示方式是1.0101 1000 0000 0000 0000 0000*2^2=1.0101 1000 0000 0000 0000 0000*4=5.41
     * 大致了解就好。
     * <p>
     * # 再来看一下字符类型
     * 字符类型是char，它占用2个字节，也就是16个bit，它的取值范围是0~65535(字符没有负的) 也就是0~2^16-1
     * 字符类型的定义方式是`char c = 'a'`，其中的a是一个字符，而不是字符串（字符串的原理其实是数组）
     * 此外还可以使用Unicode来表示字符，例如`char c = '\u0061'`，这个就是a
     * 或者使用数字来表示字符，例如`char c = 97`，这个也是a，因为97对应的是a
     * 还有一种表示方式是使用转义字符，例如`char c = '\141'`，这个也是a，因为\141对应的是a，不过不常用，不建议使用
     * 然后介绍一下转义字符，转义字符是以\开头的，例如`\n`，这个就是换行符，`\t`，这个就是制表符，`\b`，这个就是退格符
     * 还有一些比较常用的转义字符，例如`\r`，这个就是回车符，`\f`，这个就是换页符，`\\u`，这个就是Unicode编码
     * <p>
     * # 再来看一下布尔类型
     * 布尔类型是boolean，它占用1个字节，也就是8个bit，它的取值范围是true和false
     * 布尔类型的定义方式是`boolean b = true`，其中的true和false是关键字，不是字符串
     */
    public  static void  baseType(){

    }

    public static void main(String[] args) {
        //定义一个byte类型的变量
        byte b = 1;
        System.out.println("byte :" + b);
        //定义一个short类型的变量
        short s = 1;
        System.out.println("short :" + s);
        //定义一个int类型的变量
        int i = 1;
        System.out.println("int :" + i);
        //定义一个long类型的变量
        //这里可以不加L或l，但是默认的数字类型是int，如果数字超出int的上限，就会报错
        long l = 1111111111L;
        System.out.println("long :" + l);
        //定义一个float类型的变量
        //这里一定要加F或f，否则会报错，因为浮点型数值默认是double类型的
        float f = 3.14f;
        System.out.println("float :" + f);
        //定义一个double类型的变量
        double d = 3.14;
        System.out.println("double :" + d);
        //定义一个char类型的变量
        char c = 'a';
        System.out.println("char :" + c);
        //定义一个boolean类型的变量
        boolean bb = true;
        System.out.println("boolean :" + bb);
    }

}
class Test{
    public static void main(String[] args) {
        //将二进制转为float
        System.out.println(Float.intBitsToFloat(0b0_10000001_00000000000000000000000));
        //将float转为二进制字符串
        System.out.println(toBinaryString(Float.floatToIntBits(0f)));
        System.out.println(toBinaryString(Float.floatToIntBits(1.1f)));
        System.out.println(toBinaryString(Float.floatToIntBits(1.2f)));
        System.out.println(toBinaryString(Float.floatToIntBits(1.3f)));
        System.out.println(toBinaryString(Float.floatToIntBits(1.4f)));
        System.out.println(toBinaryString(Float.floatToIntBits(1.5f)));
        short s = (short) 0b10000000000000010000000000000001;
        System.out.println(s);
        System.out.println(Integer.toBinaryString(129));
    }

    /**
     * 将数字补足到32位
     * 并在第一个二进制数字后，以及第9个二进制数字后，加上下划线
     * @param i
     * @return
     */
    public static String toBinaryString(int i){
        String s = Integer.toBinaryString(i);
        int len = s.length();
        if(len < 32){
            for(int j = 0; j < 32 - len; j++){
                s = "0" + s;
            }
        }
        s = s.substring(0, 1) + "_" + s.substring(1, 9) + "_" + s.substring(9);
        return s;
    }
}
