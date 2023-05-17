package ns.mkx.demo.music;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    @Override
    public void playMusic() {
        System.out.println("Playing Classical Music");
    }
}
