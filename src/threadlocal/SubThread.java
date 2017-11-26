package threadlocal;

public class SubThread implements Runnable {
    private Account account = null;

    SubThread(Integer value){
        account = new Account(value);
    }

    public Account getAccount(){
        return account;
    }

    @Override
    public void run() {
        account.setInt(20);
        System.out.println(Thread.currentThread().getName()+"=="+account.getInt());
    }
}
