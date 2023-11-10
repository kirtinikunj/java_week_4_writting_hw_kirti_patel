package week_4_homework;

public class Programme_25_Constructor_OverLoading_Example {

    int id;
    String name;
    int age;

    //creating two arg constructor
    Programme_25_Constructor_OverLoading_Example(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    Programme_25_Constructor_OverLoading_Example(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Programme_25_Constructor_OverLoading_Example s1 = new Programme_25_Constructor_OverLoading_Example(111, "Karan");
        Programme_25_Constructor_OverLoading_Example s2 = new Programme_25_Constructor_OverLoading_Example(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}
