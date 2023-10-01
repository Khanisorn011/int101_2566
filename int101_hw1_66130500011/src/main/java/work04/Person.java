package work04;

public class Person {
    private static int id;
    public Person(int id){
    }
    public static int getId() {
        return id;
    }
    public static void setId(int id) {
        Person.id = id;
    }

    @Override
    public String toString() {
        return "Person{" + "id = " + "}";
    }
}
