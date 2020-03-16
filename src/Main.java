import com.sun.jdi.connect.Connector;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String fileName = "Data/test2.csv";
        fileName = "Data/playforddogs.csv";
        String fileNameOut = "Data/testOut2.txt";
        DogCompound dogCompound = new DogCompound("First");
        ArrayList<DogCompound> dogCompounds = new ArrayList<>();
        ImportFromFile importFromFile = new ImportFromFile();
        DogHandler dogHandler = new DogHandler();
        /*
        try {
            importFromFile.importDogs(fileName,dogCompound);
        } catch (IOException e) {
            e.printStackTrace();
        }
         */
        try {
            dogCompounds = importFromFile.importDogs(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (DogCompound dc : dogCompounds) {
            System.out.println("DOG Compound " + dc.getCompName());
            System.out.println(dc);
        }
//        System.out.println(dogCompound);
        WriteToFile writeToFile = new WriteToFile();
        writeToFile.writeFilteredToFile("WATERLOO",fileNameOut,dogCompound);
        System.out.println(dogHandler.getDogLocationByReference(32485,dogCompounds));

	// write your code here
    }
}
