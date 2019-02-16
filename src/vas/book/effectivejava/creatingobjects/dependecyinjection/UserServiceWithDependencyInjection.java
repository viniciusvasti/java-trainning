package vas.book.effectivejava.creatingobjects.dependecyinjection;

/**
 *
 * @author vinicius
 */
public class UserServiceWithDependencyInjection {
    
    private final UserRepository repository;

    // Advantages of Dependency Injection
    // 1 - Testability
    // 2 - Flexibility
    public UserServiceWithDependencyInjection(UserRepository repository) {
        this.repository = repository;
    }

    public User saveUser(User user) {
        return repository.insertUser(user);
    }
    
}
