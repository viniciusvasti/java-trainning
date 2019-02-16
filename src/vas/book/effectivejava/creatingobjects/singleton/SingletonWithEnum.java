package vas.book.effectivejava.creatingobjects.singleton;

/**
 *
 * @author vinicius
 */
// Advantages of Singleton Patterns
// - 1. Ensures that two or more instances of an object won't exist
// Disadvantages
// - 1. Difficult to test the clients

// Enum is strongly safe against serialization and reflection
// Enum is often the best way to implement Singleton
public enum SingletonWithEnum {

    INSTANCE;
    
    public void doSomething() {
        System.out.println("doSomething");
    }

}
