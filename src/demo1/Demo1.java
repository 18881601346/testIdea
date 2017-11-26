package demo1;


public class Demo1 {
        private static boolean flag = true;
        public static void main(String[] args){
            final Object obj = new Object();
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        synchronized (obj) {
                            if (!flag) {
                                try {
                                    System.out.println(Thread.currentThread().getName() + "执行1");
                                    wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            } else {
                                notify();
                            }
                        }
                    }
                }
            });

            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        synchronized (obj){
                            if(flag){
                                try {
                                    System.out.println(Thread.currentThread().getName()+"执行2");
                                    wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            } else {
                                notify();
                            }
                        }
                    }
                }
            });

            thread1.start();
            thread2.start();
        }
}
