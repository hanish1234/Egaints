package duplicate;

public class Duplicate {
	public static void main(String[] args) {
		String s1=new String("Hello! How are you? How about meeting tomorrow ?");
		String[] words=s1.split(" ");
		int c=0;
		for(int i=0;i<words.length;i++) {
			for(int j=i+1;j<words.length;j++) {
				 if(words[i].toLowerCase().equals(words[j].toLowerCase())) {
					c++;
				}
			}
		}
		System.out.println("Number of words duplicated are : " +c);
	}
}
