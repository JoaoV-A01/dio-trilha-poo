public non-sealed class UsClock extends Clock {

    private String periodIndicator;

    public java.lang.String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterMidDay() {
        this.periodIndicator = "PM";
    }

    public void setBeforeMidDay() {
        this.periodIndicator = "AM";
    }

    @Override
    public void setHour(int hour) {
        setBeforeMidDay();

        if ((hour > 12) && (hour <= 23)) {

            setAfterMidDay();
            this.hour = hour - 12;

        } else if (hour >= 24) {

            this.hour = 0;

        } else {
            this.hour = hour;
        }

    }

    @Override
    Clock convert(final Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();

        switch (clock) {
            case UsClock usClock -> {
                this.hour = usClock.getHour();
                this.periodIndicator = usClock.getPeriodIndicator();
            }
            case BrlClock brlClock -> this.setHour(brlClock.getHour());
        }
        return this;
    }

    @Override
    public String getTime() {
        return super.getTime() + " " + this.periodIndicator;
    }
}