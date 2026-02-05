package Lab3;

public class Time {

    private int hour;
    private int minute;
    private int second;

    // no-arg constructor (current GMT time)
    public Time() {
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        this.second = (int) (totalSeconds % 60);

        long totalMinutes = totalSeconds / 60;
        this.minute = (int) (totalMinutes % 60);

        long totalHours = totalMinutes / 60;
        this.hour = (int) (totalHours % 24);
    }

    // getters
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // toString method (hour:minute:second)
    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
