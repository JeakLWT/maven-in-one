package webmvc.thread;


public class ThreadMain {

    public static void main(String[] args) {
/*
        *//*Resource resource=new Resource();*//*

        for (int i=10;i>0;i--){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(resource.getValue());

                }
            }).start();

        }*/

       ThreadA threadA= new ThreadA();

        Thread thread0=new Thread(threadA);
        Thread thread1=new Thread(threadA);
        Thread thread2=new Thread(threadA);
        Thread thread3=new Thread(threadA);
        Thread thread4=new Thread(threadA);
        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


    }
}
