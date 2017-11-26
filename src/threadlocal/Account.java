package threadlocal;

public class Account {
    private ThreadLocal<Integer> local = new ThreadLocal<Integer>();

    Account(Integer value){
        this.local.set(value);
    }

    public Integer getInt(){
        return  this.local.get();
    }

    public void  setInt(Integer value){
        this.local.set(value);
    }
}
