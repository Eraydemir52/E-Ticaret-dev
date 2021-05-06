package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	void save(User user);
	List<User> getallUsers();
	

}
