package Chapter6.Challenges.SecondsToHHMMSS;

public class SecondsToHHMMSS {
    /**
     * convert seconds to HHMMSS format. eg, 1432 = 00:23:52
     * @param seconds an int representation of seconds.
     * @return seconds in HHMMSS format.
     */
    public String convert(int seconds){
        System.out.println(seconds);
        int time;
        int minutes;
        int hours;

        time = seconds;
        seconds = seconds % 60;
        time -= seconds;
        minutes = time / 60;
        time = minutes;
        minutes = time % 60;
        time -= minutes;
        hours = time / 60;


        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%02d", hours));
        sb.append(":");
        sb.append(String.format("%02d", minutes));
        sb.append(":");
        sb.append(String.format("%02d", seconds));

        String timeString = sb.toString();
        System.out.println(timeString);

        return timeString;
    }
}
