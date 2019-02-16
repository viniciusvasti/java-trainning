package vas.book.effectivejava.creatingobjects.preventunnecessarycreations;

import java.util.regex.Pattern;

/**
 *
 * @author vinicius
 */
// Some objects could be reused instead of being created repeatdely
public class BadObjectCreationsExamples {

    // Strings are immutable objects.
    // So, Strings create simply by this way 's = "text"' are being reused
    // if you call 's2 = "text"', then s and s2 will be pointing to the same
    // instance. But if call the 'new' operator, a new instance is created
    // unnecessarily.
    // NEVER DO THIS
    String s = new String("text");

    // every time this method is called, a new instance of Pattern is created
    public static boolean isRomanNumeralBad(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    private static final Pattern ROMAN_NUMBER
            = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    // every time this method is called, it uses the same Pattern instance
    public static boolean isRomanNumeralGood(String s) {
        return ROMAN_NUMBER.matcher(s).matches();
    }

    // Prefer primitives to boxed primitives, specially inside loops
    private static long sumBad() {
        // since sum is a boxed long, this code creates a new Long instance
        // every time i is added cause of autoboxing. It took about 10 secs to run on my computer
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }
    private static long sumGood() {
        // no more autoboxing. It took less than a sec to finish
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }
}
