# BM-System
This project is a Java Console Application which allows the user to keep tracks of books within a bookstore. Essentially, it is a Book Management System.

## Introduction
I built this project in the end of my Object-Oriented Programming I course, in order to better understand the basics of programming (classes, arrays, and etc.) This system takes Book objects, each characterized by a unique title, author, ISBN and price, and creates a mechanism which will allow the user to track and store books. This management system allows the user to create new books, store them, find all books by a specific author and even find all books below a certain price. Essentially, it is intended to be a management system within a bookstore, intended for use by the owner. 

## Functionalities
The program begins by welcoming the user, and then asking for the maximum number of books that their store can contain. Then, a menu with five options is displayed to the user:

### 1. Entering a New Book
To ensure that only the intended user (owner) has access to this software within the store, there is a password which they must enter before they can make any modifications to the existening database of books. The bookstore owner has a maximum of three attempts to enter the correct password, after this, the program returns to the menu. Here, they are granted the opportunity to try again, however, when the total number of failed attempts exceeds twleve (whereby they have been returned to the menu four times), the program exits. 

When the correct password is entered, the program asks the user for how many books they wish to enter. The program then verifies whether there is enough space available in the bookstore, if not, a message is disaplyed to the user. If so, then the owner is prompted for information regarding the books, and then they are added. They are then told the number of remaining spaces in the store. 

### 2. Modifying Book Information
The user is asked to validate their identity using the password. They have three attempts before the program returns them to menu. Then, the owner is asked for an index within the book inventory, which is the index of the book they wish to modify. If there is no book at the index, the program returns a message, if there is, then the user is asked which attribute of the book they wish to modify. This is then modified. The user is then prompted for additional changes until they press "5" to quit and return to the main menu. 

### 3. Displaying Books By a Certain Author
The user enters an author name, and then the program displays all books by that author. 

### 4. Displaying All Books Under a Certain Price
The user enters a price and the program will display all books below that price. 

### 5. Quit






