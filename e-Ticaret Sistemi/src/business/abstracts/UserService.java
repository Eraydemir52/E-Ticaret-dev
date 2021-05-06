package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
	void save(User user);
	void login(String email,String password);
	List<User> getAllUsers();
	

}
