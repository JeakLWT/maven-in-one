package webmvc.service;

import webmvc.entity.Count;

public class CommentService {
    private Count count;

    public CommentService(Count count) {
        this.count = count;
    }

    public void updateComment() throws InterruptedException {
        int num=0;
        synchronized (this){
            num=count.getCount();
            System.out.println(Thread.currentThread().getName()+"========"+num);
            count.setCount(count.getCount()+100);
        }

        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+"********************"+num);

    }
}
