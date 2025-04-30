public class Main {
    public static void main(String[] args) throws Exception {
        Clock brlClock = new BrlClock();

        brlClock.setSecond(0);
        brlClock.setMinute(0);
        brlClock.setHour(13);
        System.out.println("Formato Brasileiro -> " + brlClock.getTime());

        System.out.println("Formato Americano  -> " + new UsClock().convert(brlClock).getTime());

    }
}
