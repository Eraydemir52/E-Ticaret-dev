package dataAccess.concretes;



import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao  implements UserDao{

	List<User> userlist = new ArrayList<>();
	@Override
	public void save(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+"saved to database");
		userlist.add(user);
		
	}

	@Override
	public List<User> getallUsers() {
		
		return userlist;
	}

	
}
