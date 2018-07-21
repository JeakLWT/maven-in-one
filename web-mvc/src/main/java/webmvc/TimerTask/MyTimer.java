package webmvc.TimerTask;

import java.util.Date;
import java.util.Timer;

public class MyTimer {

    private final String url="hkjahdlka";

    public static void main(String[] args) {


        Timer timer=new Timer();
        timer.schedule(new TimerTaskSchedule(),new Date(), 2000);
    }


}
