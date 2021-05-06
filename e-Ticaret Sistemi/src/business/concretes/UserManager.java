package business.concretes;

import java.util.List;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager  implements UserService{
    
	private final UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao=userDao;
	}
	
	
	
	
	@Override
	public void save(User user) {
		userDao.save(user);
		
	}

	@Override
	public void login(String email, String password) {
		List<User> userList = getAllUsers();
		for(User user : userList) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
			System.out.println(user.getFirstName()+" "+user.getLastName() +" succesfully login");
			return;
		   }
		}
		System.out.println("E-mail and password incorrect");
		
	}

	@Override
	public List<User> getAllUsers() {
		
		return userDao.getallUsers();
	}

}
