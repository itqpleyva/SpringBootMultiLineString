# SpringBootMultiLineString
Spring Boot MultiLine string example

    @SpringBootApplication
    public class Main implements CommandLineRunner {

      public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
        System.out.println("I am in");

      }

      public void run(String... args) throws Exception {

        //Creating string reporte
        
        String reporte = "";
        for (int i = 0; i < 10; i++) {

          reporte = reporte +"Line"+i+ "\n";// Line1\nLine2\n.......
        }
            //Creating file.txt saving the string and defining as multiline
            
            FileWriter fileWriter = new FileWriter("file.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(reporte + "\n");
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();

      }
    }
