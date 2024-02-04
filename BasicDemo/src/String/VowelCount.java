package String;

public class VowelCount {
	
	  static int getVowelCount(String name) {
		  int vowel=0;
		  int consonent = 0;
		  for(int i=0; i<name.length(); i++) {
			  
			  if(name.charAt(i)=='a' || name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'
				  ||name.charAt(i)=='u') {
				  vowel++;
			  }else {
				  consonent++;
			  }
		  }

		  
		  return vowel;
		  
	  }
	  public static void main(String[] args) {
	    System.out.println("Total vowel in Rajesh is " + getVowelCount("Rajesh"));
	    System.out.println("Total vowel in Yogita is " + getVowelCount("Yogita"));
	  }

}
