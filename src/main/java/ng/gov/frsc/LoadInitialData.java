package ng.gov.frsc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import ng.gov.frsc.models.User;
import ng.gov.frsc.services.UserService;

@Component
public class LoadInitialData implements ApplicationRunner {
	
	@Autowired
    private UserService userService;

	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		// If Application ENV is DEV
		loadUsers();
		
	}
	
	private void loadUsers()
	{
		User user = new User();
		user.setFirstName("Motolola");
		user.setLastName("Akin");
		user.setEmail("motolola@icloud.com");
		user.setUserName("motolola");
		user.setPassword("Mioj0913");
		user.setRole("ROLE_ADMIN");
		
		userService.register(user);
		
		User user2 = new User();
		user2.setFirstName("Akin");
		user2.setLastName("Jide");
		user2.setEmail("motolola23@gmail.com");
		user2.setUserName("motolola23");
		user2.setPassword("Mioj0913");
		
		userService.register(user2);
	}

}
