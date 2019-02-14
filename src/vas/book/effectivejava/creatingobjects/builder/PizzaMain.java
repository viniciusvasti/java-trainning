package vas.book.effectivejava.creatingobjects.builder;

/**
 *
 * @author vinicius
 */
public class PizzaMain {

    public static void main(String[] args) {
        NYPizza nyp = new NYPizza.Builder(NYPizza.Size.LARGE)
                .addTopping(AbstractPizza.Topping.SAUSAGE).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(AbstractPizza.Topping.ONION).build();
    }

}
