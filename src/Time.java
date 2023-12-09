/**
 * Time class represents the time in military hours
 * Format = HH:MM:SS
 */
public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    /**
     * Constructor for Time class
     * @param h represents the number of hours
     * @param m represents the number of minutes
     * @param s represents the number of seconds
     */
    public Time(int h, int m, int s){
        hours = h;
        minutes = m;
        seconds = s;
    }

    /**
     * Method to increment the time by 1 second
     * Changes seconds to 0 and increments minutes by 1 if seconds reach 60
     * Changes minutes to 0 and increments hours by 1 if minutes reach 60
     * Changes hours to 0 if hours reach 24
     */
    public void tick(){
        seconds++;
        if (seconds >= 60) {
            minutes++;
            seconds = 0;
        }
        if (minutes >= 60) {
            minutes = 0;
            hours++;
        }
        if (hours >= 24) {
            hours = 0;
        }
    }

    /**
     * Adds a given of time to the time stored in this instance
     * Substrings the toString() of the given time to add
     * Changes the seconds, minutes and hours based on if they went over the limit
     * @param t represents the given time that will be added
     */
    public void add(Object t) {
        String timeAdded = t.toString();
        int addedHours = Integer.parseInt(timeAdded.substring(0, timeAdded.indexOf(":")));
        timeAdded = timeAdded.substring(timeAdded.indexOf(":") + 1);
        int addedMinutes = Integer.parseInt(timeAdded.substring(0, timeAdded.indexOf(":")));
        timeAdded = timeAdded.substring(timeAdded.indexOf(":") + 1);
        int addedSeconds = Integer.parseInt(timeAdded);
        seconds += addedSeconds;
        if (seconds >= 60) {
            minutes++;
            seconds = seconds - 60;
        }
        minutes += addedMinutes;
        if (minutes >= 60) {
            hours++;
            minutes = minutes - 60;
        }
        hours += addedHours;
        if (hours >= 24) {
            hours = hours - 24;
        }
    }

    /**
     * @return the time formatted as a string
     */
    @Override
    public String toString(){
        String time = "";
        if (hours < 10) {
            time += "0" + hours + ":";
        } else {
            time += hours + ":";
        }
        if (minutes < 10) {
            time += "0" + minutes + ":";
        } else {
            time += minutes + ":";
        }
        if (seconds < 10) {
            time += "0" + seconds;
        } else {
            time += seconds;
        }
        return time;
    }
}
