package Utils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class scannerDay6 {

	   public String returnInputDay6(){
		   File file = new File("AdventOfCode\\InputsDays\\Day6Input.txt");
		   String datastream = "" ;
		   try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8))
		    {
		        while (sc.hasNextLine()) {
		        	datastream = datastream.concat(sc.nextLine().trim());
		        }
		    }
		    catch (IOException e) {
		        e.printStackTrace();
		    }
		   return datastream;
	   }
}
