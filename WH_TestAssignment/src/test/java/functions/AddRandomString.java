package functions;

import java.util.Random;

public class AddRandomString {

	public static String randomStringValue(int length)
	{
		
	    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +" "+ "abcdefghijklmnopqrstuvwxyz";

	    StringBuilder sb = new StringBuilder();

	    // create an object of Random class
	    Random random = new Random();
	    for(int i = 0; i < length; i++) {
	        int index = random.nextInt(alphabet.length());

	        // get character specified by index
	        // from the string
	        char randomChar = alphabet.charAt(index);

	        // append the character to string builder
	        sb.append(randomChar);
	      }

	      String randomString = sb.toString();
	      System.out.println("Random String is: " + randomString);
	      return randomString;
	}
}
