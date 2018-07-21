package webmvc.TimerTask;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskSchedule extends TimerTask{



    @Override
    public void run() {
        System.out.println("task starting");
    }
}
