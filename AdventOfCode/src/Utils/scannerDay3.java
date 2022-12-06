package Utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;


public class scannerDay3 {
	String split = "-";
	
	public String getSplit() {
		return split;
	}
	
   public List<String> returnInputDay3(){
	   File file = new File("InputsDays\\Day3Input.txt");
	   List<String> list = new LinkedList<String>() ;
	   try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8))
	    {
	        while (sc.hasNextLine()) {
	        		list.add(sc.nextLine().trim());
	        }
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	    }
	   return list;
   }
   
   public List<String> returnInputDay3GroupOfThree(){
	   File file = new File("InputsDays\\Day3Input.txt");
	   List<String> list = new LinkedList<String>() ;
	   int groupElfs = 0;
	   try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8))
	    {
	        while (sc.hasNextLine()) {
	        	if(groupElfs < 3) {
	        		list.add(sc.nextLine().trim());
	        	}
	        	else {
	        		list.add("-");
	        		list.add(sc.nextLine().trim());
		        	groupElfs = 0;
	        	}
	        	groupElfs++;
	        }
    		list.add("-");
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	    }
	   return list;
   }
}

