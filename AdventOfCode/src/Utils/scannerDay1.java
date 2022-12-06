package Utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;


public class scannerDay1 {
	String split = "-";
	
	public String getSplit() {
		return split;
	}
	
   public List<String> returnInputDay1(){
	   File file = new File("AdventOfCode\\InputsDays\\Day1Input.txt");
	   List<String> list = new LinkedList<String>() ;
	   String next;
	   try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8))
	    {
	        while (sc.hasNextLine()) {
	        	next = sc.nextLine().trim();
	        	if( next.equals("")) {
	        		list.add(split);
	        	}
	        	else {
	        		list.add(next);
	        	}
	        }
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	    }
	   return list;
   }
}
