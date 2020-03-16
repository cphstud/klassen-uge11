import java.util.ArrayList;

public class DogHandler {
    public Dog getDogLocationByReference(int reference, ArrayList<DogCompound> compounds) throws IllegalArgumentException {
        Dog retValDog = null;
        int retValCounter = 0;
        for (DogCompound dc: compounds) {
            for (Dog dog: dc.getDogs()) {
                if (dog.getReference() == reference) {
                    retValDog = dog;
                    retValCounter++;
                }
            }
        }
        if (retValCounter > 1) {
            System.out.println("We have an error");
            throw new IllegalArgumentException("More than one dog found");
        }
        return retValDog;
    }
}
