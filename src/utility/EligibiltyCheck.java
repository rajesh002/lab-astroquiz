package utility;

import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface{

	@Override
	public boolean checkUser(User user) {
		return basicEligibilityCheck(user);
		
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		int point=Integer.parseInt(points);
		if(point>80)
			return true;
		else
		return false;
	}

	
	boolean basicEligibilityCheck(User user) {
		if (18 <= user.getAge() && user.getAge()<= 35 && 155 <= user.getHeight() && user.getHeight()<=170 && 55<=user.getWeight() &&user.getWeight()<= 90 && user.getCountry().equals("ProGrad")) 
			return true;
		else
			return false;
	}


	
}



