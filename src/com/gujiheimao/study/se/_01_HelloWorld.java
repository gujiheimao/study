package com.gujiheimao.study.se;

/**
 * 这里创建了一个名为_01_HelloWorld的类，它是public修饰的，所以它可以被其他类访问
 * 此外这个里的class 是一个关键字，表示这是一个类，而不是一个变量
 * _01_HelloWorld是类的名字，也被成为类的标识符
 */
public class _01_HelloWorld {
    /**
     * 这里是一个方法，它是public修饰的，所以它可以被其他类访问
     * 又因为它是static修饰的，所以它可以直接通过类名来访问，而不是需要创建对象，然后通过对象来访问
     * void表示这个方法没有返回值
     * main是方法的名字，也被称为方法的标识符
     *
     * args中的内容来自java -jar xxx.jar xxx xxx xxx中的xxx xxx xxx部分内容，一般是用来传递参数的
     * @param args 这里是一个参数，它是一个数组，数组的元素是String类型
     */
    public static void main(String[] args) {
        /**
         * 这里是一个语句，它是一个方法调用语句，它调用了System类中的out属性，out属性是一个PrintStream类型的对象
         * 而这个对象中有一个println方法，这个方法可以打印出字符串，并且会自动换行
         * 这里的功能是在控制台打印出Hello World!这个字符串
         */
        System.out.println("Hello World!");
    }
    //ps: 这里的{}是一个代码块，它是用来限定作用域的，比如这里的main方法的作用域就是在{}中
    //类的作用域也是在类的标识符后的{}中

}
