package vas.book.effectivejava.creatingobjects.dependecyinjection;

/**
 *
 * @author vinicius
 */
public class UserMySQLRepository implements UserRepository {

    @Override
    public User insertUser(User user) {
        System.out.println("Inserting user in MySQL database");
        return user;
    }

}
