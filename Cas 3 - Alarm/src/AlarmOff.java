class AlarmOff implements AlarmState
{
    @Override
    public void on(Alarm alarm)
    {
        System.out.println("Alarm on.");
        alarm.setState(new AlarmOn());
    }
    @Override
    public void off(Alarm alarm)
    {
        System.out.println("The alarm is already off.");
    }
    @Override
    public void ring(Alarm alarm)
    {
        System.out.println("The alarm is off. To make it ring, activate it first.");
    }
}
