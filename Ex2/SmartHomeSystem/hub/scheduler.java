package hub;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author DELL
 */
public class Scheduler {
    private final Map<LocalTime, Runnable> schedule = new HashMap<>();
    private final Timer timer = new Timer(true);

    public void scheduleTask(LocalTime time, Runnable task) {
        schedule.put(time, task);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                task.run();
            }
        }, java.sql.Time.valueOf(time));
    }

    public Map<LocalTime, Runnable> getSchedule() {
        return schedule;
    }
}
