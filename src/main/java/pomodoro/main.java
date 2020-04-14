package pomodoro;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class main {
    public static void main(String[] args) {

        int minute = 60000;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String timeStart = LocalTime.now().format(formatter);

        System.out.println("Start: " + timeStart);

        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        String timeFinish = LocalTime.now().format(formatter);
                        System.out.println("Minelo 25 minut. Godzina: " + timeFinish);

                        FileInputStream fis = null;
                        try {
                            fis = new FileInputStream("C:\\Users\\Piotrek\\projekciki\\src\\main\\java\\pomodoro\\music.mp3");
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                        AdvancedPlayer player = null;
                        try {
                            player = new AdvancedPlayer(fis);
                        } catch (JavaLayerException e) {
                            e.printStackTrace();
                        }
                        try {
                            player.play();
                        } catch (JavaLayerException e) {
                            e.printStackTrace();
                        }

                    }
                },
                minute*25
        );



    }

}
