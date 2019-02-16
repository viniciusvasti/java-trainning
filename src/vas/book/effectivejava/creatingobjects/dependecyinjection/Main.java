package vas.book.effectivejava.creatingobjects.dependecyinjection;

/**
 *
 * @author vinicius
 */
public class Main {

    public static void main(String[] args) {
        User user = new User();
        
        // The same implementation of a User service works for any kind of
        // repository that implements UserRepository interface
        UserServiceWithDependencyInjection serviceUsingMySQL
                = new UserServiceWithDependencyInjection(new UserMySQLRepository());
        UserServiceWithDependencyInjection serviceUsingOracle
                = new UserServiceWithDependencyInjection(new UserOracleDBRepository());
        System.out.println(serviceUsingMySQL.saveUser(user));
        System.out.println(serviceUsingOracle.saveUser(user));
    }

}
