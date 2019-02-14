package vas.book.effectivejava.creatingobjects.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author vinicius
 */
public abstract class AbstractPizza {

    public enum Topping {
        HAM, MUSHROOM, ONION, PEPPER, SAUSAGE
    }
    final Set<Topping> toppings;

    // Recursive type bounds allows subclasses to use their own type
    abstract static class Builder<T extends Builder<T>> {

        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract AbstractPizza build();

        // need to be overriden to return "this"
        protected abstract T self();

    }
    AbstractPizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
    
}
