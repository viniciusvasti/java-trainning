package vas.book.effectivejava.creatingobjects.builder;

/**
 *
 * @author vinicius
 */
// Advantages of Builder Pattern
// (usable when constructor has too many optional parameters)
// 1. More readable for the programmers than constructor
// 2. No mistakes about parameters order in constructor
// 3. No need for several constructors for all the possible conbinations
//   with the optional parameters
// 4. JavaBeans (setting optianl parameters by set's methods)
//   requires mutability and allows inconsistency until the set's are called
//   (if they're called)
public class NutritionFacts {

    private final int servingSize; // required
    private final int servings; // required
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {

        private final int servingSize;
        private final int servings;
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }

    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    @Override
    public String toString() {
        return "Serving Size: "+servingSize
                +" | Servings: "+servings
                +" | Calories: "+calories
                +" | Fat: "+fat
                +" | Sodium: "+sodium
                +" | Carbohydrate: "+carbohydrate;
    }

}
