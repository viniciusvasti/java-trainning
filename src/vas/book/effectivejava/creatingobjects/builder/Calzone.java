package vas.book.effectivejava.creatingobjects.builder;

/**
 *
 * @author vinicius
 */
public class Calzone extends AbstractPizza {

    private final boolean sauceInside;

    public static class Builder extends AbstractPizza.Builder<Builder> {

        private boolean sauceInside;
        
        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }

    }

    public Calzone(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

}
