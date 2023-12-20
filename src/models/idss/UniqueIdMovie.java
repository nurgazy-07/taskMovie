package models.idss;

public class UniqueIdMovie {
    private static long id = 1;
    public static long setId(){
        return id++;
    }
}
