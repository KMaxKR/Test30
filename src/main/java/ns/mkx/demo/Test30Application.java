package ns.mkx.demo;


import ns.mkx.demo.music.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test30Application implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(Test30Application.class, args);
	}

	@Autowired
	private ClassicalMusic classic;

	@Autowired
	private KPOPMusic kpop;

	@Override
	public void run(String... args) throws Exception {
		classic.playMusic();
		kpop.playMusic();
	}
}
