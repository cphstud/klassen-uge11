public class IdFactory {
    private static IdFactory idFactory = null;
    public int dogId ;

    private IdFactory() {
        dogId=0;
    }

    public static IdFactory getInstance() {
        if (idFactory==null) {
            idFactory = new IdFactory();
        }
        return idFactory;

    }
    public int getDogId() {
        dogId++;
        return dogId;
    }
}
