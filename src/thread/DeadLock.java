package thread;

class A {
    public synchronized void foo(B b) {
        System.out.println("当前线程名：" + Thread.currentThread().getName()
        + " 进入A实例的foo()方法");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程名：" + Thread.currentThread().getName()
                + " 企图调用B实例的last()方法");
        b.last();
    }

    public synchronized void last() {
        System.out.println("进入A实例的last()方法内部");
    }
}

class B {
    public synchronized void bar(A a) {
        System.out.println("当前线程名：" + Thread.currentThread().getName()
                + " 进入B实例的bar()方法");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当前线程名：" + Thread.currentThread().getName()
                + " 进入A实例的last()方法");
        a.last();
    }

    public synchronized void last() {
        System.out.println("进入B实例的last()方法内部");
    }
}

public class DeadLock implements Runnable{

    A a = new A();
    B b = new B();

    public void init() {
        Thread.currentThread().setName("主线程");
        // 调用a对象的foo()方法
        a.foo(b);
        System.out.println("进入了主线程之后");
    }

    @Override
    public void run() {
        Thread.currentThread().setName("副线程");
        // 调用b对象的bar()方法
        b.bar(a);
        System.out.println("进入了副线程之后");
    }

    public static void main(String[] args) {
        DeadLock dl = new DeadLock();
        // 以dl为target启动新线程
        new Thread(dl).start();
        // 调用init()方法
        dl.init();
    }
}
