package problem5;

public class Time implements Comparable<Time> {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hour must be between 0-23");
        }
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Minute must be between 0-59");
        }
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Second must be between 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        String period;
        int displayHour;

        if (hour == 0) {
            displayHour = 12;
            period = "AM";
        } else if (hour == 12) {
            displayHour = 12;
            period = "PM";
        } else if (hour < 12) {
            displayHour = hour;
            period = "AM";
        } else {
            displayHour = hour - 12;
            period = "PM";
        }
        return String.format("%02d:%02d:%02d %s", displayHour, minute, second, period);
    }

    public int compareTo(Time o) {
        if (this.hour != o.hour) {
            return Integer.compare(this.hour, o.hour);
        }
        if (this.minute != o.minute) {
            return Integer.compare(this.minute, o.minute);
        }
        return Integer.compare(this.second, o.second);
    }
}