import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public int writeFilteredToFile(String filter, String fileName, DogCompound dogCompound) {
        int retVal = 0;
        File fh = new File(fileName);
        try {
            FileWriter fw = new FileWriter(fh,true);
            BufferedWriter bw = new BufferedWriter(fw);

            for(Dog dog: dogCompound.getDogs()) {
                if (dog.getSuburb().contains(filter)) {
                    bw.write("Dog: " + dog);
                    bw.newLine();
                    retVal++;
                }
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return retVal;
    }
}
