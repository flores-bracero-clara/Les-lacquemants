public interface AlarmState
{
    void on(Alarm alarm);
    void off(Alarm alarm);
    void ring(Alarm alarm);
}