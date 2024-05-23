package lesson16.Normal;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Participant {
    String name;
    int age;
    String email;


    void displayParticipants() {
        try {
            FileReader fileReader = new FileReader("participants.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Unable to read participants.txt.");
//            System.err.println("Error: Unable to read participants.txt.");
        }
//        catch (IOException e) {
//            System.err.println("Error: Unable to read participants.txt.");
//        }
    }

}
