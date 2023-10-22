import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

class Alarm
{
    private AlarmState state;
    private Timer timer;
    public Alarm()
    {
        state = new AlarmOff();
        timer = new Timer();
    }
    public void setState(AlarmState state)
    {
        this.state = state;
    }
    public void on()
    {
        state.on(this);
    }
    public void off()
    {
        state.off(this);
    }
    public void ring()
    {
        state.ring(this);
    }
    public void scheduleRing(int hours, int minutes)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, hours);
        calendar.set(Calendar.MINUTE, minutes);
        calendar.set(Calendar.SECOND, 0);

        TimerTask ringTask = new TimerTask()
        {
            @Override
            public void run()
            {
                ring();
            }
        };

        timer.schedule(ringTask, calendar.getTime());
        System.out.println("Ring scheduled for " + hours + ":" + minutes);
    }
    public static void main(String[] args)
    {
        Alarm alarm = new Alarm();
        alarm.scheduleRing(6, 30);
        alarm.on();
    }
}