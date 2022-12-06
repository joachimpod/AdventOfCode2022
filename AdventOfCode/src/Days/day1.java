package Days;
import java.util.*;

import Utils.scannerDay1;

public class day1 {
	int cant_Elfs = 3;
	
	public List<String> howManyCaloriesIsTheElfCarrying() {
		scannerDay1 scannerDay1 = new scannerDay1();
		int elfCalories = 0;
		String calories;
		List<String> listOfCalories = scannerDay1.returnInputDay1();
		List<String> listOfCaloriesElf = new LinkedList<String>();
	    Iterator<String> iterator = listOfCalories.iterator();
		
		while(iterator.hasNext()){
			calories = iterator.next();
			if(calories != scannerDay1.getSplit()){
				elfCalories += Integer.parseInt(calories);
			}
			else{
				listOfCaloriesElf.add(elfCalories+"");
				elfCalories = 0;
			}
		}
		Collections.sort(listOfCaloriesElf, Collections.reverseOrder());  
		
		return listOfCaloriesElf;
	}
	  
	public void whichElfGotTheMostTotalCaloriesIsTheElfCarrying() {
		List<String> listOfCaloriesElf = howManyCaloriesIsTheElfCarrying();
		System.out.println("Calories in total: " +listOfCaloriesElf.get(0));
		
		
	}
	
	public void whichThreeElfsGotTheMostTotalCaloriesIsTheElfCarrying() {
		List<String> listOfCaloriesElf = howManyCaloriesIsTheElfCarrying();
		int CaloriesTotalsThreeElfs = 0;
		for(int i = 0 ; i<cant_Elfs; i++) {
			CaloriesTotalsThreeElfs += Integer.parseInt(listOfCaloriesElf.get(i));
		}
		System.out.println("Calories in total of top "+cant_Elfs+": "+CaloriesTotalsThreeElfs);
		
		
	}
	
}
