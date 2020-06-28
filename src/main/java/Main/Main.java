package Main;

import java.io.BufferedWriter;
import java.io.FileWriter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

	public static void main(String[] args) {
		
		SpringApplication.run(Main.class, args);
	}

	public void run(String... args) throws Exception {
		
		String reporte = "";
		
		for (int i = 0; i < 10; i++) {
			
			reporte = reporte+"Line"+i+ "\n";
		}
		
  	    FileWriter fileWriter = new FileWriter("file.txt", true);
  	    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
  	    bufferedWriter.write(reporte + "\n");
  	    bufferedWriter.flush();
  	    bufferedWriter.close();
  	    fileWriter.close();
		
	}

}
