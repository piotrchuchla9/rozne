package pomodoro;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class main {

    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    public static void main(String[] args) {


        String timeStart = LocalTime.now().format(formatter);
        System.out.println("Start: " + timeStart);
        timer pomodoro = new timer();
        pomodoro.timer();

    }
}