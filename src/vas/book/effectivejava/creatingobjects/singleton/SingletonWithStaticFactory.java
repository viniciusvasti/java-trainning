package vas.book.effectivejava.creatingobjects.singleton;

import java.io.Serializable;

/**
 *
 * @author vinicius
 */
// Advantages of Singleton Patterns
// - 1. Ensures that two or more instances of an object won't exist
// Disadvantages
// - 1. Difficult to test the clients
public class SingletonWithStaticFactory implements Serializable {

    private static final SingletonWithStaticFactory INSTANCE = new SingletonWithStaticFactory();

    // It's not possible to instanciate this class out of itself
    private SingletonWithStaticFactory() {
    }

    // Static Factory
    public static SingletonWithStaticFactory getInstance() {
        return INSTANCE;
    }

    // prevents from creating a new instance when it is going to be deserialized
    private Object readResolve() {
        return INSTANCE;
    }

}
