package com.tz.processdemo;


public class Lock_Wait_Demo {
    //可重入锁是指,这个线程的锁的方法可以调用另一个相同的锁方法，

    //Object类提供两个线程通信方法
//    wait: //执行该方法的线程对象，会释放同步锁,jvm把该线程存放到等待池中，等待其他线程唤醒
//      notify: //执行该方法的线程，唤醒等待池中的任意一个线程
//    notifyAll:唤醒所有线程

    //上面的方法"只能由持有对像锁的线程来调用"说明wait方法与notify方法必须在同步块内执行，它只能用在同步化程序段或者同步化方法内，否则，会抛出异常IllegalMonitorStateException.
    //重点: 这些方法只能被同步监听锁对象调用。

//因为这一对方法阻塞时要释放占用的锁，而锁是任何对象都具有的，调用任意对象的 wait() 方法导致线程阻塞，并且该对象上的锁被释放


    //关于生产者，消费者的疑问
   /*
   一个生产者消费者模型的任务队列，一个生产者一次可能放入多个任务，然后用notifyAll通知消费者，但是并非所有被唤醒的消费者都能取到一个任务，那么队列被读空了之后的消费者肯定得继续await。如果你用if来判断，假如这个if的代码段里wait（），那么这个消费者第二次被notify的时候就不会再次判断!(ok to proceed)这个条件了，如果这个时候这个消费者又一次没抢到任务，但是代码还是往下执行了，轻则空指针异常，重了干出什么事情来都说不定了。
   * */

   //wait必须放在同步代码块中,wait是释放锁,释放锁的前提是有锁。

    //wait和sleep
//    wait:会释放锁
//    sleep:不会释放锁



}
