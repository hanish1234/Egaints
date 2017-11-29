package oneToOne;

public class OneToOne {

	public static void main(String[] args) {
		
		Book book = new Book("Two States", "123");
		Author author = new Author("Chetan Bhagath");
		
		System.out.println("Book Name: "+book.getBookTitle()+"\nAuthor: "+author.getAuthorName());
		
	}
}
