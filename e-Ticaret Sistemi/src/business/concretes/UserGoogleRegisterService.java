package business.concretes;

import entities.concretes.User;

public class UserGoogleRegisterService extends RegisterBaseClass {
	
	 public UserGoogleRegisterService(UserManager userManager) {
	        super(userManager);
	    }

	    @Override
	    public boolean checkRegister(User user) {
	        System.out.println(user.getFirstName() + " "+ user.getLastName()+" succesfully registered with google account.");
	        return true;
	    }

}
