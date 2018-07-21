package webmvc.thread;

import webmvc.entity.Count;
import webmvc.service.CommentService;

public class CommentThread implements Runnable {
    private Count count;

    private CommentService commentService;

    public CommentThread(Count count, CommentService commentService) {
        this.count = count;
        this.commentService = commentService;
    }

    @Override
    public void run() {
       /* int num = 0;
        synchronized (this) {
            num = count.getCount();
            count.setCount(num + 100);
            System.out.println(Thread.currentThread().getName()+"====="+num);
        }
        System.out.println("====="+num);*/
        try {
            commentService.updateComment();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
