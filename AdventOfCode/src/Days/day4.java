package Days;

import java.util.Iterator;
import java.util.List;

import Utils.scannerDay4;

public class day4 {
	
	public void containsSectionElfs() {
		String sections;
		String[] assignedSections =  new String[2];
		String[] firstElf = new String[2];
		String[] secondElf = new String[2];
		int pairs = 0;
		scannerDay4 scannerDay4 = new scannerDay4();
		List<String> assignedSectionsOfElfs = scannerDay4.returnInputDay4();
		Iterator<String> iterator = assignedSectionsOfElfs.iterator();

		while(iterator.hasNext()){
			sections = iterator.next();
			assignedSections = sections.split(",");
			firstElf = assignedSections[0].split("-");
			secondElf = assignedSections[1].split("-");
			if(((Integer.parseInt(firstElf[0])>=Integer.parseInt(secondElf[0])) && (Integer.parseInt(firstElf[1])<=Integer.parseInt(secondElf[1])))
						|| ((Integer.parseInt(firstElf[0])<=Integer.parseInt(secondElf[0])) && (Integer.parseInt(firstElf[1])>=Integer.parseInt(secondElf[1])))) {
				
				pairs++;
			}
		}
		System.out.println("Assignment pairs does one range fully contain the other: "+pairs);
	}

	public void containsSomeSectionElfs() {
		String sections;
		String[] assignedSections =  new String[2];
		String[] firstElf = new String[2];
		String[] secondElf = new String[2];
		int pairs = 0;
		scannerDay4 scannerDay4 = new scannerDay4();
		List<String> assignedSectionsOfElfs = scannerDay4.returnInputDay4();
		Iterator<String> iterator = assignedSectionsOfElfs.iterator();

		while(iterator.hasNext()){
			sections = iterator.next();
			assignedSections = sections.split(",");
			firstElf = assignedSections[0].split("-");
			secondElf = assignedSections[1].split("-");
			if(((Integer.parseInt(firstElf[1])>=Integer.parseInt(secondElf[0]))&& (Integer.parseInt(firstElf[1])<=Integer.parseInt(secondElf[1]))) ||
					((Integer.parseInt(secondElf[1])>=Integer.parseInt(firstElf[0]))&& (Integer.parseInt(secondElf[1])<=Integer.parseInt(firstElf[1])))){
				pairs++;
			}
			
		}	
		System.out.println("Assignment pairs do the ranges overlap: "+pairs);
	}

}
