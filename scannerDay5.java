package Utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;


public class scannerDay5 {
	List<String> listOfSort = new LinkedList<String>() ;
	
   public List<List<String>> returnInputDay5(){
	   File file = new File("AdventOfCode\\InputsDays\\Day5Input.txt");
	   List<String> listStackOfCreates = new LinkedList<String>() ;
	   boolean ordering = false;
	   String nextLine = ".";
	   int maxStack = 0;
	   try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8))
	    {
	        while (sc.hasNextLine()) {
	        	if(!ordering) {
	        		nextLine = sc.nextLine();
	        		if(nextLine.contains("1")) {
	        			maxStack = Integer.parseInt(nextLine.substring(nextLine.length()-2,nextLine.length()-1));
	        		}
	        		else {
		        		if(!nextLine.equals("")) {
		        			listStackOfCreates.add(nextLine);
		        		}
		        		else {
		        			ordering = true;
		        		}
	        		}
	        	}
	        	else {
	        		listOfSort.add(sc.nextLine());
	        	}
	        }
	    }
	    catch (IOException e) {
	        e.printStackTrace();
	    }
	   return createStacksOfCrates(listStackOfCreates,maxStack);
   }
   public List<String> returnListOfSort(){
	   return listOfSort;
   }
   
   public List<List<String>> createStacksOfCrates(List<String> listStackOfCreates, Integer maxStack){
	   	List<List<String>> stackOfCreates = initializateStackOfCreates(maxStack);
	    Iterator<String> iterator = listStackOfCreates.iterator();
	    String creates = "";
	    String[] splitCreates = new String[stackOfCreates.size()];
	   	int i = 0;
	    while(iterator.hasNext()) {
	    	creates = iterator.next();
		   	for(int k = 0 ; k<=creates.length() ; k += 4) {
		   		if(k+4 == creates.length()+1) {
			    	splitCreates[i] = creates.substring(k,creates.length()).trim();
		   		
		   		}
		   		else {
		   			splitCreates[i] = creates.substring(k,(k+4)).trim();
		   		}
		    	i++;
		   	}
		   	for(int j = 0 ; j<splitCreates.length ; j++) {
		   		if(!splitCreates[j].equals("")) {
		   			stackOfCreates.get(j).add(0,splitCreates[j]);
		   		}
		   	}
	    	i = 0;
	    }  	
	   	return stackOfCreates;
   }
   
   private List<List<String>> initializateStackOfCreates(Integer maxStack){
	   	List<List<String>> stackOfCreates = new LinkedList <List<String>> ();
	   	for(int i = 0 ; i<maxStack ; i++) {
	   		stackOfCreates.add(new LinkedList <String>());
	   	}
	   	return stackOfCreates;
	   
   }
}

