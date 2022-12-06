package Utils;

public class priorityItemsDay3 {
	
	public Integer giveProrityItems(String item){
		char letter = item.charAt(0);
		int priority =  letter;
		final int lowerCaseAscii = 97;
		final int upperCaseAscii = 65;

		if(Character.isUpperCase(letter)){
			priority = (priority - upperCaseAscii) + 27 ;
		}
		else {
			priority = (priority - lowerCaseAscii) + 1 ;
		}

		
		return priority;
	}
}
