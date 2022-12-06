package Days;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import Utils.scannerDay5;

public class day5 {
	
	public void rearrangementStackCreate() {
		scannerDay5 scannerDay5 = new scannerDay5();
		String sort;
		String[] orders = new String[4];
		List<List<String>> listOfCreates = scannerDay5.returnInputDay5();
		List<String> listOfSortedOrdering = scannerDay5.returnListOfSort();
	    Iterator<String> iterator = listOfSortedOrdering.iterator();
	    int move = 0;
	    int from = 0;
	    int to = 0;
	    int remove = 0;
		
		while(iterator.hasNext()){
			sort = iterator.next();
			orders = sort.split("[movefromto]+");
			move = Integer.parseInt(orders[1].trim());
			from = Integer.parseInt(orders[2].trim())-1;
			to = Integer.parseInt(orders[3].trim())-1;
			for(int i = 0; i < move ;i++) {
				remove = listOfCreates.get(from).size()-1;
				listOfCreates.get(to).add(
						(listOfCreates.get(from).
								remove(remove)));
			}
		}
		System.out.print("What crate ends up on top of each stack?: ");
		for(int j = 0; j <listOfCreates.size(); j++) {
			System.out.print(listOfCreates.get(j).get(listOfCreates.get(j).size()-1));
		}
		
	}
	
	public void multiRearrangementStackCreate() {
		scannerDay5 scannerDay5 = new scannerDay5();
		String sort;
		String[] orders = new String[4];
		List<List<String>> listOfCreates = scannerDay5.returnInputDay5();
		List<String> listOfSortedOrdering = scannerDay5.returnListOfSort();
	    Iterator<String> iterator = listOfSortedOrdering.iterator();
	    int move = 0;
	    int from = 0;
	    int to = 0;
	    int remove = 0;
		
		while(iterator.hasNext()){
			sort = iterator.next();
			orders = sort.split("[movefromto]+");
			move = Integer.parseInt(orders[1].trim());
			from = Integer.parseInt(orders[2].trim())-1;
			to = Integer.parseInt(orders[3].trim())-1;
			remove = listOfCreates.get(from).size()-1;
			for(int i = 0; i < move ;i++) {
				listOfCreates.get(to).add(
						(listOfCreates.get(from).
								remove((remove)-(move-1))));
			}
		}
		System.out.print("What crate ends up on top of each stack?: ");
		for(int j = 0; j <listOfCreates.size(); j++) {
			System.out.print(listOfCreates.get(j).get(listOfCreates.get(j).size()-1));
		}
		
	}
	
}
