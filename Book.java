
public class Book {

	
	// Declaring attributes
	private double price;
	private String title;
	private String author;
	private long isbn;
	private int bookNo;
	private static int count;
	
	
	
	// Upon the creation of a book object, the object must immediately be initialized with valid values; that is title, author, ISBN and price.
	// So, we must use a constructor to create a reference to the object and then initialize them to a valid value. 
	
	// Needs to be done with valid values hence, instead of the code below:
	/* public Book() {
		price = 0.0;
		title = "";
		author = "";
		isbn = (long) 0.0;
		
	}
	*/
	
	// We will pretend a default book is Romeo and Juliet
	
	public Book() {
		price = 10.0;
		title = "Romeo & Juliet";
		author = "Shakespeare";
		isbn = 1023048; // A random number
		bookNo = count;
		// Then, the count is going to be incremented by one each time that the object is created. 
		count++;
	}
	
	// The design should also allow the user to obtain the value of any of the attributes. 
	//  This involves using getters, hence I will create a getter for all of the attributes. 
	
	// Getters 
	
	public double getPrice() {
		return price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	public long getIsbn() {
		return isbn;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	
	// These will return values and thus allow the user to obtain the value of any of the attributes. 
	
	
	// Then, there are setters, which will allow us to set the attributes to a specific value, through the use of parameters. 
	
	public void setPrice(double inPrice) {
		price = inPrice;
		
	}
	
	public void setTitle(String inTitle) {
		title = inTitle;
		
	}
	
	public void setAuthor(String inAuthor) {
		author = inAuthor;
		
	}
	
	public void setIsbn(long inIsbn) {
		isbn = inIsbn;
		
	}
	
	public void setBookNo(int inBookNo) {
		bookNo = inBookNo;
	}
	
	// Parameterized constructor 
	public Book (String inTitle, String inAuthor, long inIsbn, double inPrice) {
		title = inTitle;
		author = inAuthor;
		isbn = inIsbn;
		price = inPrice;
		bookNo = count;
		count++;
		
	}
	
	
	
	// It is required to know how many Book objects have been created. For that, you need to
	// add a method, called findNumberOfCreatedBooks(), to the class. This method must
	// return the number of created Book objects prior to the time this method is called. The
	// method would simply return 0 if no books has been created by the time the method is
	// called.
	
	// Creating the method:
	public static int findNumberOfCreatedBooks() {
		
		return count;
	}
	
	
	// Then, I need to write an equals to method, to compare the equality of two books. 
	// Two books are considered equal if they have the same ISBN and price. 
	
	// Writing an equals method:
	public boolean equals(Book anotherBook) {
		
		if (price==anotherBook.price && isbn==anotherBook.isbn) {
			return true;
		}
		
		else {
			return false;
		}
		
		
	}
	
	
	
	// Creating a Copy Constructor 
	public Book(Book objBook) {
		this.author = objBook.author;
		this.isbn = objBook.isbn;
		this.price = objBook.price;
		this.title = objBook.title;
	}
	
	
	
	// ToString() method to show the information about the books. 
	public String toString() {
		
		s
		
		return ("Book # "+bookNo+"\nAuthor: "+author+"\nTitle: "+title+"\nISBN: #"+"\nPrice: $");
	}
		
}
