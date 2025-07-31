package singleton;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = Dog.getInstance();
        dog1.bark();

        Dog dog2 = Dog.getInstance();
        dog2.bark();
    }
}
