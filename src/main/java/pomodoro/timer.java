package pomodoro;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalTime;

public class timer {
    public void timer(){
        main format = new main();
        int minute = 60000;
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        String timeFinish = LocalTime.now().format(format.formatter);
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
                minute * 25
        );
    }
}
