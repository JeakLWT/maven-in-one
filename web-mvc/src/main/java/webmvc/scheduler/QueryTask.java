package webmvc.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class QueryTask {

    @Scheduled(cron = "*/5 * * * * ?")
    public void testQuraz(){
        System.out.println("定时任务");
    }

}
