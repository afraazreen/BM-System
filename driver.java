// Importing Scanner
import java.util.Scanner;

public class driver {
	
				

	public static void main(String[] args) {
		
		//Declaring Scanner object
		
		Scanner key = new Scanner(System.in);
		
		
		// Welcome Message:
		System.out.println("Welcome to Afra's Book-Keeping Software!");
		
		//Prompt the bookstore owner for the maximum number of books (maxBooks) his/her
		// bookstore can contain. Create an empty array, called inventory, that will have the potential
		// of keeping track of the created Book objects.
		
		System.out.println("Please enter the maximum number of books your bookstore can contain.");
		
		// Declaring a constant, which is the maximum number of books contained. 
		
		final int maxBooks = key.nextInt();
		
		// I will also take this opportunity to declare my constant which is a password. 
		
		final int pass = 249;
		
		//Creating an empty array which will have the potential to keep track of the book objects. 
		//It's capacity is defined by the constant defined by the user. 
		
		Book[] inventory = new Book[maxBooks];
		
		
		// Creating static methods 
		
		
		
		
		
		// Display a menu:
		
		System.out.println("What would you like to do?");
		System.out.println("1. Enter new books (password required)");
		System.out.println("2. Change the information of a book (password required)");
		System.out.println("3. Display all books by a specific author");
		System.out.println("4. Display all books under a certain price");
		System.out.println("5. Quit.");
		System.out.println("Please enter your choice.");
		
		// Variable to store the choice 
		
		int choice = key.nextInt();
		
		// Counter for number of tries:
		int nTries = 1;
		int tTries = 1;
		int userPass = 0;
		
		
		while (choice>=1&&choice<=5) {
			
			switch (choice) {
			case 1:

				while (nTries<4 && userPass!=pass) {
				System.out.println("Please enter your password.");
				userPass = key.nextInt();
				//Update number of tries counter 
				nTries++;
				tTries++;
				
				}
				
				
				if (nTries<=4 && tTries<=13) {
				// Display menu again, then ask for choice.
				System.out.println("What would you like to do?");
				System.out.println("1. Enter new books (password required)");
				System.out.println("2. Change the information of a book (password required)");
				System.out.println("3. Display all books by a specific author");
				System.out.println("4. Display all books under a certain price");
				System.out.println("5. Quit.");
				System.out.println("Please enter your choice.");
				
				
				//Change the value of choice 
				choice = key.nextInt();
				nTries = 1;
				}
				
				else if (userPass==pass) {
					
					System.out.println("How many books would you like to add?");
					int newBooks = key.nextInt();
					
					// Check if there is enough space in the array. 
					if(newBooks + Book.findNumberOfCreatedBooks() <= maxBooks) {
						for (int i=Book.findNumberOfCreatedBooks(); i<newBooks; i++) {
							System.out.println("Enter the title of the book, the author's name, ISBN and price.");
							String bName = key.nextLine();
							String authorName = key.nextLine();
							int bPrice = key.nextInt();
							long bIsbn = key.nextLong();
							inventory[i]= new Book(bName, authorName, bIsbn, bPrice); // Adding new books, using custom constructor. 
						}
						
						
						
						 
				}
					else {
						System.out.println("There is not enough space left to add these books.");
					}
					
				}
					
				
				else {
					System.out.println("“Program detected suspicous activities and will terminate immediately!");
					System.exit(0);
					
				
				}
				
				break;
				
				
			case 2: 
				
				System.out.println("Please enter your password.");
				int userPass1 = key.nextInt();
						
					
				while (nTries<4 && userPass1!=pass) {
					System.out.println("Please enter your password.");
					userPass = key.nextInt();
					//Update number of tries counter 
					nTries++;					}
					
				if (nTries>=4) {
					// Display menu again, then ask for choice.
					System.out.println("What would you like to do?");
					System.out.println("1. Enter new books (password required)");
					System.out.println("2. Change the information of a book (password required)");
					System.out.println("3. Display all books by a specific author");
					System.out.println("4. Display all books under a certain price");
					System.out.println("5. Quit.");
					System.out.println("Please enter your choice.");						
						
					//Change the value of choice
					choice = key.nextInt();
					nTries = 1;
				}	
				else {
					System.out.println("Which book number do you wish to update?");
					int bookNo = key.nextInt();
					
					// Check if there is an object at that point 
					if (inventory[bookNo]==null) {
						System.out.println("There is no book at this point of the inventory. Would you like to re-enter another book or quit this operation and go back to the main menu?");
						System.out.println("To re-enter the book number of a book, press 3. If not, press 0 to see the menu.");
						
						int tempChoice = key.nextInt();
						
						if (tempChoice==0) {
							System.out.println("What would you like to do?");
							System.out.println("1. Enter new books (password required)");
							System.out.println("2. Change the information of a book (password required)");
							System.out.println("3. Display all books by a specific author");
							System.out.println("4. Display all books under a certain price");
							System.out.println("5. Quit.");
							System.out.println("Please enter your choice.");						
								
							//Change the value of choice
							choice = key.nextInt();
							nTries = 1;
						}
						
						else {
							choice = tempChoice;
						}
	
					
					}
					else {
						if(bookNo<=maxBooks) {
							System.out.println(inventory[bookNo-1]); // Minus one because of the array index. 
							
							
							System.out.println("What information would you like to change?");
							System.out.println("1. Author");
							System.out.println("2. Title");
							System.out.println("3. ISBN");
							System.out.println("4. Price");
							System.out.println("5. Quit");
							System.out.println("Enter your choice.");
							String strChoice = key.next();
							String strChoice2 = "";
							
							while (strChoice.compareToIgnoreCase("1")!=0||strChoice.compareToIgnoreCase("2")!=0||strChoice.compareToIgnoreCase("3")!=0||strChoice.compareToIgnoreCase("4")!=0||strChoice.compareToIgnoreCase("5")!=0) {
								System.out.println("What information would you like to change?");
								System.out.println("1. Author");
								System.out.println("2. Title");
								System.out.println("3. ISBN");
								System.out.println("4. Price");
								System.out.println("5. Quit");
								System.out.println("Enter your choice.");
								String strChoice = key.next();
							}
							
						 
							
				
							int choice2 = Integer.parseInt(strChoice);
							
							
							while (choice2>=1&&choice2<=5)
							switch (choice2) {
							case 1:
								System.out.println("What would you like to change the author name to?");
								String newAuthName = key.nextLine();
								inventory[bookNo-1].setAuthor(newAuthName); 
								
								// Displaying updated info on book:
								System.out.println(inventory[bookNo-1]);
								
								
								// Prompting the user for any additional changes.
								System.out.println("Would you like to make any additional changes? If so, enter yes, if not, enter no.");
								String addChoice = key.next().toUpperCase();
								
								if (addChoice == "YES") {
									System.out.println("What information would you like to change?");
									System.out.println("1. Author");
									System.out.println("2. Title");
									System.out.println("3. ISBN");
									System.out.println("4. Price");
									System.out.println("5. Quit");
									System.out.println("Enter your choice.");
									
								
									choice2 = key.nextInt();
								}
								
								else {
									System.out.println("Thank you for using Afra's Book-Keeping Software, please enter 5 to quit.");
									choice2 = key.nextInt();
								}
								
								
								break;
								
							case 2:
								System.out.println("What would you like to change the title to?");
								String newTitle = key.nextLine();
								inventory[bookNo-1].setTitle(newTitle);
								
								// Displaying info on book
								System.out.println(inventory[bookNo-1]);
								
								// Prompting the user for any additional changes
								System.out.println("Would you like to make any additional changes? If so, enter yes, if not, enter no.");
								String addChoice1 = key.next().toUpperCase();
								
								if (addChoice1 == "YES") {
									System.out.println("What information would you like to change?");
									System.out.println("1. Author");
									System.out.println("2. Title");
									System.out.println("3. ISBN");
									System.out.println("4. Price");
									System.out.println("5. Quit");
									System.out.println("Enter your choice.");
									
								
									choice2 = key.nextInt();
								}
								
								else {
									System.out.println("Thank you for using Afra's Book-Keeping Software, please enter 5 to quit.");
									choice2 = key.nextInt();
								}
								
								
								break;
								
							case 3:
								System.out.println("What would you like to change the ISBN to?");
								long newIsbn = key.nextLong();
								inventory[bookNo-1].setIsbn(newIsbn);
								
								// Displaying info on book
								System.out.println(inventory[bookNo-1]);
								
								// Prompting the user for any additional changes
								System.out.println("Would you like to make any additional changes? If so, enter yes, if not, enter no.");
								String addChoice2 = key.next().toUpperCase();
								
								if (addChoice2 == "YES") {
									System.out.println("What information would you like to change?");
									System.out.println("1. Author");
									System.out.println("2. Title");
									System.out.println("3. ISBN");
									System.out.println("4. Price");
									System.out.println("5. Quit");
									System.out.println("Enter your choice.");
									
								
									choice2 = key.nextInt();
								}
								
								else {
									System.out.println("Thank you for using Afra's Book-Keeping Software, please enter 5 to quit.");
									choice2 = key.nextInt();
								}
								
								
								break;
								
							case 4:
								System.out.println("What would you like to change the price to?");
								double newPrice = key.nextDouble();
								inventory[bookNo-1].setPrice(newPrice);
								
								// Displaying info on book
								System.out.println(inventory[bookNo-1]);
								
								// Prompting the user for any additional changes
								System.out.println("Would you like to make any additional changes? If so, enter yes, if not, enter no.");
								String addChoice3 = key.next().toUpperCase();
								
								if (addChoice3 == "YES") {
									System.out.println("What information would you like to change?");
									System.out.println("1. Author");
									System.out.println("2. Title");
									System.out.println("3. ISBN");
									System.out.println("4. Price");
									System.out.println("5. Quit");
									System.out.println("Enter your choice.");
									
								
									choice2 = key.nextInt();
								}
								
								else {
									System.out.println("Thank you for using Afra's Book-Keeping Software, please enter 5 to quit.");
									choice = key.nextInt();
								}
								
								break;
								
							case 5:
								choice = 5;
								break;
								
								
							}
							
							
							
						}
						
						else {
							System.out.println("Error.");
					}
							
							
							
						
						
						
					}
				}
				
				break;
				
				
				case 3:
					System.out.println("Enter the name of the author");
					String authorName = key.nextLine();
					
					for (int i=0; i<inventory.length; i++) {
						
						if (inventory[i].getAuthor()!=null) {
							if(inventory[i].getAuthor().compareToIgnoreCase(authorName)==0) {
								System.out.println(inventory[i]);
							}
							
							
							else {
								System.out.println("There are no books which are by the author you have entered.");
							}
						}
					
					}
					
					break;
				
				case 4:
					
					System.out.println("Enter a price:");
					double userPrice = key.nextDouble();
					
					for (int i=0; i<inventory.length; i++) {
						if (inventory[i]!=null) {
							if(inventory[i].getPrice()<userPrice) {
								System.out.println(inventory[i]);
							}
							
							else {
								System.out.println("There are no books that are cheaper than your entered price.");
							}
						}
						
					}
					
					break;
					
				case 5:
					System.out.println("Thank you for using Afra's Book-Keeping Software. The program is now quitting.");
					System.exit(0);
					break;
					
					default:
						
						break;
	
				}
				
				
				
		  
				
			}

	}
			
}