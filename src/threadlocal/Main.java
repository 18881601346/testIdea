package threadlocal;

public class Main {
    public static void main(String[] args){
        SubThread t1 = new SubThread(10);
//        SubThread t2 = new SubThread(20);
//        SubThread t3 = new SubThread(30);
        new Thread(t1).start();
        new Thread(t1).start();
        new Thread(t1).start();
        System.out.println(Thread.currentThread().getName()+"=="+t1.getAccount().getInt());
    }
}
