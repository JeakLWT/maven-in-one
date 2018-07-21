package webmvc.entity;

public class Count {
    private int count;

    public Count(int count) {
        this.count = count;
    }

    public synchronized int getCount() {

       /* System.out.println("get中"+count);*/
        return count;
    }

    public synchronized void setCount(int count) {

        this.count = count;

   /*     System.out.println("set中"+count);*/
    }

}
