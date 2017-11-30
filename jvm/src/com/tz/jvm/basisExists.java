package com.tz.jvm;

/**
 * Created by Administrator on 2017/3/12.
 */
public class basisExists {

    //寄存器:
    //  -指定下一条执行的命令
//        -执行本地方法时,PC寄存器的值为undefined

    //方法区:
//        -保存类装载的类信息
//            >类型的常量
//            >字段,方法的信息
//            >方法字节码
//    jdk6时,String等常量信息置于方法区
//    jdk7时,已经移动到了堆
    //java jdk1.7中的常量池确实是移到了堆中，同时在jdk1.8中移除整个永久代，取而代之的是一个叫元空间（Metaspace）的区域


    //堆
//        -所有线程共享java堆


    //栈
//        -线程私有的
//        -栈由一些列帧组成(帧:保存一个方法的局部变量,操作数栈,常量池指针)

    //局部变量表(参数,局部变量表)
    // -->局部变量表的一槽位是32位 ,只有long占2个槽位
    //所有参数的传递都是使用操作数栈
    //heap只保存实例,类的信息保存在方法区里


    //static方法  调用和普通方法第一个步骤不一样 静态是直接初始化,普通是引用this


    //可见性:一个线程一旦修改了变量其他线程马上得知
    //保证可见性的方法
//        -volatile
//        -synchronized
//        -final

    //--------------------------------------------
    //不影响语义结果的情况下:指令是会重排的这是jvm的优化

    public void writer(){

//        a = 1;      这里可能会指令重排  可能先执行flag,或者先执行a=1;
                        //这样就破坏了有序性
//        flag =true;

    }
}
