package vas.book.effectivejava.methodscommonallobjects.equals;

/**
 *
 * @author vinicius
 */
public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Jack", "Sparrow");
        Address a1 = new Address("St Teste 1", "San Diego", "California", "1111111", "USA");
        p1.setAddress(a1);
        p1.getPhoneNumbers().add(new PhoneNumber(
                Short.valueOf("001"),
                Short.valueOf("111"),
                Short.valueOf("11111")
        ));
        Person p2 = new Person("Jack", "Sparrow");
        Address a2 = new Address("St Teste 1", "San Diego", "California", "1111111", "USA");
        p2.setAddress(a2);
        p2.getPhoneNumbers().add(new PhoneNumber(
                Short.valueOf("001"),
                Short.valueOf("111"),
                Short.valueOf("11111")
        ));
        Person p3 = new Person("Jack", "Sparrow");
        Address a3 = new Address("St Teste 1", "San Diego", "California", "1111111", "USA");
        p3.setAddress(a3);
        p3.getPhoneNumbers().add(new PhoneNumber(
                Short.valueOf("001"),
                Short.valueOf("111"),
                Short.valueOf("11111")
        ));
        p3.getPhoneNumbers().add(new PhoneNumber(
                Short.valueOf("003"),
                Short.valueOf("333"),
                Short.valueOf("3333")
        ));

        System.out.println("p1 equals p2? "+p1.equals(p2));
        System.out.println("p1 equals p3? "+p1.equals(p3));
    }

}
