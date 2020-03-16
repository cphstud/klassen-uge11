import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ImportFromFile {

    public ArrayList<DogCompound> importDogs(String filename) throws IOException {
        ArrayList<DogCompound> dogCompounds = new ArrayList<>();
        //Reference 0,Colour_Description 1,Breed_Description 2,Animal_Name 3,Gender 4,Suburb 5
        //20990,Red,Dobermann,AMY,Desexed Female,WATERLOO CORNER
        // String name, String gender, String breed, String colour, String suburb, int reference

        int numLinesRead = 0;
        String line = "";
        String name = "Dogs_"+numLinesRead;
        int compountCounter=0;
        DogCompound tmpDogCompound = new DogCompound(name);
        File fh = new File(filename);
        if (fh.exists()) {
            // go on read from file
            try {
                Scanner ms = new Scanner(fh);
                // TODO: fang den første linje i try-catch
                //ms.nextLine();
                while(ms.hasNextLine()) {
                    numLinesRead++;
                    if(numLinesRead%20==0) {
                        dogCompounds.add(tmpDogCompound);
                        name = "Dogs_"+numLinesRead;
                        tmpDogCompound = new DogCompound(name);
                    }
                    line = ms.nextLine();
                    String[] lineArr = line.split(",");
                    //Dog tmpDog = new Dog(lineArr[0],lineArr[1])
                    try {
                        Dog tmpDog = new Dog(lineArr[3], lineArr[4], lineArr[2], lineArr[1], lineArr[5], Integer.parseInt(lineArr[0]));
                        boolean retVal = tmpDogCompound.addDogToCompound(tmpDog);
                        if (!retVal)  {
                            System.out.println("Dog was already in file " + tmpDog.getName());
                        } else {
                            tmpDog.setDogGarageId(tmpDogCompound.getCompoundId());
                        }
                    }catch (Exception e) {
                        System.out.println("Ex at " + e.getMessage());
                    }
                }
                ms.close();
            } catch (IOException ex ) {
                System.out.println("Error:  " + ex);
            } catch (Exception e) {
                System.out.println("Error " + e.toString());
            }
        } else {
            throw new IOException();
        }
        return dogCompounds;
    }
}
