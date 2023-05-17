package ns.mkx.demo.music;

import org.springframework.stereotype.Component;

@Component
public class KPOPMusic implements Music{
    @Override
    public void playMusic() {
        System.out.println("Playing K-POP");
    }
}
