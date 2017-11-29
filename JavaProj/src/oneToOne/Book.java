package oneToOne;

public class Book {

	private String bookTitle;
	private String contents;
	
	public Book() {
	}

	public Book(String bookTitle, String contents) {
		this.bookTitle = bookTitle;
		this.contents = contents;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
	
}
