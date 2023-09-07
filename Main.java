import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedWriter writer = new BufferedWriter(new FileWriter(pathOutput));

        try {
            writer.write("This is a line of animals...");
            for (int i=0; i<10; i++) {
                writer.write("\n i is: " + i);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            writer.close();

        }

    }


}