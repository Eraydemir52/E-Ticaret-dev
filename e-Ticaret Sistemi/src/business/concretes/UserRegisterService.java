package business.concretes;



import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import entities.concretes.User;

public class UserRegisterService extends RegisterBaseClass {
	
	 public UserRegisterService(UserManager userManager) {
	        super(userManager);
	    }
	 
	 public boolean checkRegister(User user) {
		 if(user.getEmail() !=null && user.getFirstName()!=null &&
				 user.getLastName()!=null && user.getPassword()!=null) {
			 
			  String regex = "^(.+)@(.+)$";
	            boolean eMailHasUsed = false;
	            Pattern pattern = Pattern.compile(regex);//Pattern düzen
	            //email validation control
	            Matcher matcher = pattern.matcher(user.getEmail());//Matcher eþleþtirici

	            List<User> list = userManager.getAllUsers();
	            for (User user1 : list){
	                if (user1.getEmail().equals(user.getEmail())) {
	                    eMailHasUsed = true;
	                    break;
	                }
	            }
	            if (user.getPassword().length() >= 6 && matcher.matches() &&
	                    !eMailHasUsed && user.getFirstName().length() >=2 && user.getLastName().length()>=2) {

	                return true;
	            }
	            return false;
	        }
	        return false;
	        }

	}

