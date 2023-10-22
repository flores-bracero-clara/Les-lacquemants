class AlarmOn implements AlarmState
{
    @Override
    public void on(Alarm alarm)
    {
        System.out.println("The alarm is already on.");
    }
    @Override
    public void off(Alarm alarm)
    {
        System.out.println("Alarm off.");
        alarm.setState(new AlarmOff());
    }
    @Override
    public void ring(Alarm alarm)
    {
        System.out.println("The alarm is ringing!");
        alarm.setState(new AlarmRinging());
    }
}
