import java.util.ArrayList;

public class DogCompound {
    static int counter=1;
    String compName;
    int compoundId;
    ArrayList<Dog> dogs;

    public DogCompound(String name) {
        this.compName = name;
        this.compoundId=counter;
        dogs = new ArrayList<>();
        counter++;
    }

    public boolean addDogToCompound(Dog dog) {
        if (dogs.contains(dog)) {
            return false;
        } else {
            dogs.add(dog);
            return true;
        }
    }
    public ArrayList<Dog> getDogs() {
        return this.dogs;
    }

    public String getCompName() {
        return this.compName;
    }

    public int getCompoundId() {
        return this.compoundId;
    }

    @Override
    public String toString() {
        String msg = "";
        msg = msg + "DogCompound{" +
                "compName='" + compName + '\'' +
                ", dogs=" + dogs +
                '}';

        return msg;
    }
}
