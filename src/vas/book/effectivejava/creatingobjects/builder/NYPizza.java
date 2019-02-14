package vas.book.effectivejava.creatingobjects.builder;

import java.util.Objects;

/**
 *
 * @author vinicius
 */
public class NYPizza extends AbstractPizza {

    public enum Size {
        SMALL, MEDIUM, LARGE
    }
    private final Size size;

    public static class Builder extends AbstractPizza.Builder<Builder> {

        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NYPizza build() {
            return new NYPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }

    }

    public NYPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

}
