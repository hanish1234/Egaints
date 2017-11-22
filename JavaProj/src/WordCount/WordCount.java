package WordCount;

public class WordCount {
 
	public static void main(String[] args) {
	
	 String s1=new String("Hello! How are you?");
	 int c=0;
	 for(int i=0;i<s1.length();i++) {
	 if(s1.charAt(i) == ' ')
		 c++;
	 }
	 System.out.println("Number of words in the given string: ");
	 System.out.println(c+1);
	}

}
