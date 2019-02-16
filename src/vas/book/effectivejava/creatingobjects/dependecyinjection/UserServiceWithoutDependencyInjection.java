package vas.book.effectivejava.creatingobjects.dependecyinjection;

/**
 *
 * @author vinicius
 */
public class UserServiceWithoutDependencyInjection {

    // Disadvantages of dependecy of UserRepository
    // 1 - You can't test that class using a mock instance of repository
    // 2 - Coupling - the class becomes unflexible, if UseRepository
    //      connects with a MySql database, you can't change your database
    //      simply implementing a UserOracleRepository. You also need
    //      a new UserService like class which gonna be a copy-paste from this
    //      class changing only the repository attribute
    private final UserMySQLRepository repository = new UserMySQLRepository();

    public UserServiceWithoutDependencyInjection() {
    }

    public User saveUser(User user) {
        return repository.insertUser(user);
    }

}
