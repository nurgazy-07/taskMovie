package models.idss;

public class UniqueIdActors {
    private static long id = 1;
    public static long setId(){
        return id++;
    }
}
