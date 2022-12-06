package Days;

import Utils.scannerDay6;

public class day6 {
	
	public void rearrangementStackCreate(int distinctCharacters) {
		scannerDay6 scannerDay6 = new scannerDay6();
		String marker = "";
		char letter;
		String datastream = scannerDay6.returnInputDay6();
		int requiredCharacters = 0;
		
		for(int i = 0; i < datastream.length() && !(marker.length() == distinctCharacters) ; i++) {
			letter = datastream.charAt(i);
			marker = marker.concat(letter+"");
			for(int j = i+1; j < datastream.length() && !(marker == "") && !(marker.length() == distinctCharacters) ; j++) {
				letter = datastream.charAt(j);
				if(!marker.contains(letter+"")) {
					marker = marker.concat(letter+"");
					requiredCharacters = distinctCharacters+i;
				}
				else {
					marker = "";
				}
			}
		}
		System.out.print("How many characters need to be processed before the first start-of-packet marker is detected?: "+ requiredCharacters);
		
	}
}
