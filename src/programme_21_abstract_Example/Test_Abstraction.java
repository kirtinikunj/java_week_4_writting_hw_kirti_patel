package programme_21_abstract_Example;

/**
 * 4. Create the fourth class name TestAbstraction1 and inside create the main method as below.
 * In real scenario, method is called by programmer or user
 */
public class Test_Abstraction {

    public static void main(String[] args) {
        //In a real scenario, object is provided through method, e.g., getShape() method
        Shape s = new Circle();
        s.draw();
    }
}
