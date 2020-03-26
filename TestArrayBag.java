
public class TestArrayBag {

	public static void main(String[] args) {
		
		ArrayBag <String> testBag4 = new ArrayBag<String>();
		
		String[] b4 = {"A", "C", "D", "A", "Z", "A","D","D"};
	    testBag4.clear();
		for(int i=0; i<b4.length; i++)
			testBag4.add(b4[i]);
		
		System.out.println("Bag before removeAllDuplicates() method:");
		System.out.println(testBag4.toString());
		
		System.out.println();
		
		testBag4.removeAllDuplicates();
		
		
		System.out.println("Bag after removeAllDuplicates() method:");
		System.out.println(testBag4.toString());
		
		
		
		
	}
	
	
}
