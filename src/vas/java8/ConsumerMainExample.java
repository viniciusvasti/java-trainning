/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vas.java8;

import java.util.function.Consumer;

/**
 *
 * @author vinicius
 */
public class ConsumerMainExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Consumer<String> c1 = (a) -> { System.out.println("first: "+ a); };
        Consumer<String> c2 = (a) -> { System.out.println("second: "+ a); };
        Consumer<String> c3 = (a) -> { System.out.println("third: "+ a); };
        
        c1.andThen(c2).andThen(c3).accept("run");
    }
    
}
