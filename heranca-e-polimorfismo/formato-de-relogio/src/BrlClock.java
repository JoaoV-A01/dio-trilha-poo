public non-sealed class BrlClock extends Clock {

    @Override
    public Clock convert(final Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();

        switch (clock) {
            case UsClock usClock -> {
                this.hour = (usClock.getPeriodIndicator().equals("PM")) ?
                        usClock.getHour() + 12 :
                        usClock.getHour();
            }
            case BrlClock brlClock -> this.hour = brlClock.getHour();
        }
        return this;
    }
}