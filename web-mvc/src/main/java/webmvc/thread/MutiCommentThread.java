package webmvc.thread;

import webmvc.entity.Count;
import webmvc.service.CommentService;

public class MutiCommentThread {
   static CommentThread commentThread = new CommentThread(new Count(0), new CommentService(new Count(0)));

    public static void get() throws InterruptedException {

        for (int i = 0; i <10 ; i++) {
            new Thread(commentThread).start();
        }

      /*  Thread.sleep(2000);*/

        /*System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");*/
    }


    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <10 ; i++) {
            get();
        }
    }


}
