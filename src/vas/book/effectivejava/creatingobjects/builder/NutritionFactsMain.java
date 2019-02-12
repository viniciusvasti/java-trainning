/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vas.book.effectivejava.creatingobjects.builder;

/**
 *
 * @author vinicius
 */
public class NutritionFactsMain {

    public static void main(String[] args) {
        NutritionFacts apple = new NutritionFacts.Builder(1, 1).calories(60).carbohydrate(45).build();
        System.out.println(apple.toString());
    }

}
