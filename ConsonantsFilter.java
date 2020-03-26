import java.util.Arrays;
/**Dorron Green
 * Assignment #2
 	CSC 2331 Data Structures
 */
 

public class ConsonantsFilter {
	
	public static void main (String[] args) {
		
		 BagInterface<String> letters = new ArrayBag<String>();
		 BagInterface<String> vowels = new ArrayBag<String>();
		 BagInterface<String> consonants = new ArrayBag<String>();
		 
		 String[] bletters = {"A", "B", "C", "E", "O", "A","V","I"};
		 String[] bvowels = {"A", "E", "I", "O", "U"};
	
		 for(int i =0;i<bletters.length;i++)//for loop to add letters to bag: letter
			 letters.add(bletters[i]);
		 
		 
		 System.out.println("Before loop:"+ "");
		 System.out.println("There are "+letters.getCurrentSize()+" letters in the bag of letters.");
		 
		 
		 
		 
		
		 for(int j =0;j<bvowels.length;j++)//for loop to add letters to bag: vowels
			 vowels.add(bvowels[j]);
		
		 //
		 System.out.println("There are "+vowels.getCurrentSize()+" letters in the bag of vowels.");
		 System.out.println("There are "+consonants.getCurrentSize()+" letters in the bag of consonants.");
		 System.out.println();
		 
		 
		 
		 
		 while(!letters.isEmpty()) {//while loop to check if letters are in bag of vowels	 
			String oneletter = letters.remove();	
			if(!vowels.contains(oneletter)) {
				consonants.add(oneletter);
			}
			 
			 
			
		 }
		System.out.println("After loop:"+ "");
		System.out.println("There are "+letters.getCurrentSize()+" letters in the bag of letters.");
		System.out.println("There are "+vowels.getCurrentSize()+" letters in the bag of vowels.");
		System.out.println("There are "+consonants.getCurrentSize()+" letters in the bag of consonants.");
	
	}

}
