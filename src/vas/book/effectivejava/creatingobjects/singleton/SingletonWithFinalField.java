package vas.book.effectivejava.creatingobjects.singleton;

/**
 *
 * @author vinicius
 */
// Advantages of Singleton Patterns
// - 1. Ensures that two or more instances of an object won't exist
// Disadvantages
// - 1. Difficult to test the clients
public class SingletonWithFinalField {

    public static final SingletonWithFinalField INSTANCE = new SingletonWithFinalField();

    // It's not possible to instanciate this class out of itself
    private SingletonWithFinalField() {
    }

}
