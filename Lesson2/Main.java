package Lesson2;

public class Main {
    public static void main(String[] args) {
        DBase dateBase = new DBase();
        dateBase.getConnectionToDB(DBase.dbUrl,
                DBase.user,
                DBase.password, "log1");
    }
}
