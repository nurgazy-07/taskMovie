package models.idss;

public class UniqueIdProducer {
    private static long id = 1;
    public static long setId(){
        return id++;
    }

}
