package vas.book.effectivejava.creatingobjects.dependecyinjection;

/**
 *
 * @author vinicius
 */
public class UserOracleDBRepository implements UserRepository {

    @Override
    public User insertUser(User user) {
        System.out.println("Inserting user in Oracle database");
        return user;
    }

}
