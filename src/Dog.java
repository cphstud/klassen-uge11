public class Dog {
    String name;
    String gender;
    String breed;
    String colour;
    String suburb;
    static int id=0;
    int dogId;
    int dogGarageId;
    int reference;

    //Reference,Colour_Description,Breed_Description,Animal_Name,Gender,Suburb
    //20990,Red,Dobermann,AMY,Desexed Female,WATERLOO CORNER


    public Dog(String name, String gender, String breed, String colour, String suburb, int reference) {
        // id++;
        IdFactory myIdfactory = IdFactory.getInstance();
        this.name = name;
        this.gender = gender;
        this.breed = breed;
        this.colour = colour;
        this.suburb = suburb;
        this.dogId = id;
        this.reference = reference;
        this.id = myIdfactory.getDogId();
    }

    public boolean equals(Dog o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return reference == dog.reference;
    }

    @Override
    public int hashCode() {
        return reference;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", breed='" + breed + '\'' +
                ", colour='" + colour + '\'' +
                ", suburb='" + suburb + '\'' +
                ", dogId=" + dogId +
                ", reference=" + reference +
                "} \n";
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBreed() {
        return breed;
    }

    public String getColour() {
        return colour;
    }

    public String getSuburb() {
        return suburb;
    }

    public static int getId() {
        return id;
    }

    public int getDogId() {
        return dogId;
    }

    public int getReference() {
        return reference;
    }

    public int getDogGarageId() {
        return this.dogGarageId;
    }

    public void setDogGarageId(int id) {
        this.dogGarageId = id;
    }
}
