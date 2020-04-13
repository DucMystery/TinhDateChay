import java.time.LocalDateTime;
import java.util.Calendar;

public class StopWatch {

    private long startTime;
    private long endTime;

    public  StopWatch(){
    }


    public long star(long startTime){

        return this.startTime = startTime;
    }

    public long stop(){
        return this.endTime = LocalDateTime.now().getSecond();
    }

    public long getElapsedTime(){
       int count =0;
       for (long i=this.startTime;i<this.endTime;i++){
           count++;
       }
       return count;
    }
}
