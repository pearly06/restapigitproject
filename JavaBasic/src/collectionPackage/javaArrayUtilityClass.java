package collectionPackage;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class javaArrayUtilityClass {

	public static void main(String[] args) {
		sortArrayOfPrimitives();
	       sortArrayOfString();
	       convertArrayToList();
	       binarySerachAlgorithm();
		
	}
private static void binarySerachAlgorithm() {
	final String key = "abc";
	String[] strArray = { "abc", "cdf", "pqr" };
	System.out.println(Arrays.binarySearch(strArray, key));
	int[] inrArrray = { 1, 2, 3, 4 };
	System.out.println(Arrays.binarySearch(inrArrray, 3));
	byte k = 1;
    byte[] byteArray = { 1, 2, 3, 4, 5 };
    System.out.println(Arrays.binarySearch(byteArray, k));

    char charKey = 'a';
    char[] charArray = { 'a', 'b', 'c' };
    System.out.println(Arrays.binarySearch(charArray, charKey));
    double[] doubleArray = { 0.1, 0.2, 0.3 };
    System.out.println(Arrays.binarySearch(doubleArray, 0.2));

    long[] longArray = { 1, 2, 3, 4, 5 };
    System.out.println(Arrays.binarySearch(longArray, 1));

    float[] floatArray = { 1, 2, 3, 4, 5 };
    System.out.println(Arrays.binarySearch(floatArray, 2));
}

//Convert array to list
private static void convertArrayToList() {
	List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
	for (String str : stooges) {
        System.out.println(" print list ----" + str);
    }
	
}
////Sort array of primitive elements

private static void sortArrayOfPrimitives() {
	int[] intArray = { 1, 2, 3, 4 };
	Arrays.sort(intArray);
	byte[] byteArray = { 1, 2, 3, 4, 5 };
	Arrays.sort(byteArray);
    char[] charArray = { 'a', 'b', 'c' };
   Arrays.sort(byteArray);

    double[] doubleArray = { 0.1, 0.2, 0.3 };
    Arrays.sort(doubleArray);

    long[] longArray = { 1, 2, 3, 4, 5 };
    Arrays.sort(longArray);

    float[] floatArray = { 1, 2, 3, 4, 5 };
    Arrays.sort(floatArray);
}
//Sort array of string elements
private static void sortArrayOfString() {
	// String internally implements Comparable interface.
	String[] strArray = { "abc", "cdf", "pqr" };
    Arrays.sort(strArray);
 // Date internally implements Comparable interface
  //  Date[] dates = { new Date("08-26-2016"), new Date("08-27-2016") };
  //  Arrays.sort(dates);
}
}
