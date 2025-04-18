import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {
    
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    public void run(ApplicationArguments args) throws InterruptedException {
        roleRepository.save(new RoleModel("BIDDER"));
        roleRepository.save(new RoleModel("APPROVER"));

        userRepository.save(new UserModel(1,"bidder1", "companyOne", "bidder123","bidder1email@gmail.com",new RoleModel(1)));
        userRepository.save(new UserModel(2,"bidder2", "companyTwo", "bidder789","bidder2email@gmail.com",new RoleModel(1)));
        userRepository.save(new UserModel(3,"approver", "defaultCompany", "approver123","approveremail@gmail.com",new RoleModel(2)));
    }
}
