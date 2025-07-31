package singleton;

public class Dog {

    // 'volatile' ensures that changes to 'dog' are immediately visible to all threads
    // and prevents problems caused by the object being created in multiple steps

    private static volatile Dog dog;

    private Dog() {
    }

    public void bark() {
        System.out.println("wof wof...");
    }

    public static Dog getInstance() {

        // Check if instance is null before locking to avoid unnecessary synchronization.
        // If null, lock and check again to ensure only one thread creates the instance.
        // This approach improves performance by limiting synchronization to the first call.

        if (Dog.dog == null) {
            synchronized (Dog.class) {
                if (dog == null) {
                    Dog.dog = new Dog();
                }
            }
        }

        return Dog.dog;
    }
}
