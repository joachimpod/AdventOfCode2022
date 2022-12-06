package Days;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import Utils.priorityItemsDay3;
import Utils.scannerDay3;

public class day3 {
	
	public void priorityItemsElfsRucksacks() {
		String rucksack;
		String firstCompartment;
		String secondCompartment;
		scannerDay3 scannerDay3 = new scannerDay3();
		List<String> elfsRucksacks = scannerDay3.returnInputDay3();
	    Iterator<String> iterator = elfsRucksacks.iterator();
	    int rucksackLength = 0;
	    String item;
	    int priorityItem = 0;
	    priorityItemsDay3 priorityItemsDay3 = new priorityItemsDay3();
		List<String> repeatedItems = new LinkedList<String>();
		
		while(iterator.hasNext()){
			rucksack = iterator.next();
		    rucksackLength = rucksack.length()/2;
			firstCompartment = rucksack.substring(0, rucksackLength);
			secondCompartment = rucksack.substring(rucksackLength);
			for(int i = 0; i<firstCompartment.length(); i++) {
				item = firstCompartment.substring(i, (i+1));
				if(secondCompartment.contains(item) && !repeatedItems.contains(item)) {
					priorityItem += priorityItemsDay3.giveProrityItems(item);
					repeatedItems.add(item);
				}
			}
			repeatedItems.removeAll(repeatedItems);
		}
		System.out.println("Priority items total: "+priorityItem);
		
	}
	
	public void priorityItemsElfsRucksacksGroupThree() {
		String rucksack;
		scannerDay3 scannerDay3 = new scannerDay3();
		List<String> elfsRucksacks = scannerDay3.returnInputDay3GroupOfThree();
	    Iterator<String> iterator = elfsRucksacks.iterator();
	    String item;
	    int priorityItem = 0;
	    priorityItemsDay3 priorityItemsDay3 = new priorityItemsDay3();
		List<String> repeatedItems = new LinkedList<String>();
		List<String> itemsGroupElfs = new LinkedList<String>();

		while(iterator.hasNext()){
			rucksack = iterator.next();
			if(!rucksack.equals(scannerDay3.getSplit())) {
				itemsGroupElfs.add(rucksack);				
			}
			else {
				for(int j = 0; j<itemsGroupElfs.get(0).length(); j++) {
					item = itemsGroupElfs.get(0).substring(j, (j+1));
					if(itemsGroupElfs.get(1).contains(item) &&  itemsGroupElfs.get(2).contains(item)  && !repeatedItems.contains(item)) {
						priorityItem += priorityItemsDay3.giveProrityItems(item);
						repeatedItems.add(item);
					}
				}
				repeatedItems = new LinkedList<String>();
				itemsGroupElfs = new LinkedList<String>();
			}		
		}
		System.out.println("Priority items total: "+priorityItem);
		
	}
	
}

