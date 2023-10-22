class AlarmRinging implements AlarmState
{
    @Override
    public void on(Alarm alarm)
    {
        System.out.println("The alarm is already on.");
    }
    @Override
    public void off(Alarm alarm)
    {
        System.out.println("Alarm ringing stopped.");
        alarm.setState(new AlarmOn());
    }
    @Override
    public void ring(Alarm alarm)
    {
        System.out.println("The alarm is already ringing.");
    }
}
