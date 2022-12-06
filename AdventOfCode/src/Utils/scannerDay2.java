package Utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;


public class scannerDay2 {
	
   public List<String> returnInputDay2(){
	   File file = new File("AdventOfCode\\InputsDays\\Day2Input.txt");
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
}

