package vas.book.effectivejava.creatingobjects;

/**
 *
 * @author vinicius
 */
// Advantages of Static Factory Methods over constructors:
// 1. They have names. You may give a better description about
//   the object being created.
// 2. They're not required to create a new object instance
//   every time.
// 3. They can return any subtype of they return type. So it's
//   possible to the API return instances of private classes.
// 4. It can vary the returning class depending on a parameter.
// 5. It's possible to return classes that don't exist yet.
// 
// Limitations:
// 1. 
// 2. 
public class StaticFactoryOverConstructor {

    public static void main(String[] args) {
        // Demonstrating how boolean static factory works

        // Creating a Boolean via constructor
        Boolean a = new Boolean("true");
        Boolean a2 = new Boolean("true");
        System.out.println("Same instances? " + (a != a2)); // false

        // Creating a Boolean via its Static Factory
        Boolean b = Boolean.valueOf("true");
        Boolean b2 = Boolean.valueOf("true");
        System.out.println("Same instances? " + (b != b2)); // true

    }

    // Advantage 3: returning an instance of a private subclass
    public StaticFactoryOverConstructor instanceOfPrivateClass() {
        return new SubClass();
    }

    // Advantage 4
    public StaticFactoryOverConstructor instanceOf(int number) {
        return number > 100 ? new SubClass() : new StaticFactoryOverConstructor();
    }

    private class SubClass extends StaticFactoryOverConstructor {

        public SubClass() {
        }

    }

}
