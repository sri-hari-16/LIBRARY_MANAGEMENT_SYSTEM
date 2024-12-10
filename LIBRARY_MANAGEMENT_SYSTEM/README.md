# Library Management System

## Overview

The **Library Management System** is a console-based application developed using **Core Java** that simplifies the process of managing books in a library. The system offers essential library operations such as adding, removing, issuing, and returning books, checking the issue status, and searching and sorting the collection. It is built with object-oriented principles, such as encapsulation, inheritance, and polymorphism, and uses Java’s **ArrayList** for storing the books.

This project serves as a practical demonstration of implementing real-world applications using Java and understanding the key concepts of object-oriented programming. It is designed to be simple, user-friendly, and efficient in managing the library's operations.

---

## Features

1. **Add Books**  
   The system allows users to add books to the library by specifying the title, author, and ISBN. Each book is uniquely identified by its ISBN, ensuring no duplicates.

2. **Remove Books**  
   Users can remove a book from the library by providing the ISBN. The system ensures that only books that exist in the library can be removed.

3. **Display All Books**  
   This feature shows a list of all books currently stored in the library, with details such as the title, author, ISBN, and issue status.

4. **Issue Books**  
   Users can issue a book by providing its ISBN. If the book is available (i.e., not already issued), the system will mark it as issued. If it’s already issued, an appropriate message will be shown.

5. **Return Books**  
   A user can return a book by providing its ISBN. If the book is currently issued, it will be marked as available again. If the book was not issued, an error message will be displayed.

6. **Check Issue Status**  
   Users can check whether a specific book is available or issued by providing the book’s ISBN. The system will display the current status of the book.

7. **Search Books**  
   This functionality enables users to search for books by title, author, or ISBN. The search is case-insensitive, and the system will display any matching books.

8. **Sort Books**  
   The system allows users to sort the books based on different criteria: title, author, or ISBN. This helps in organizing the books in a structured manner for easy access.

---

## Project Structure

The project consists of two main classes:

- **`Book.java`**  
  The `Book` class defines the properties of a book, including its title, author, ISBN, and issued status. It includes methods for getting and setting these properties, as well as checking the issue status.

- **`Library.java`**  
  The `Library` class handles the operations of the library, such as adding, removing, issuing, returning, and searching books. It stores the books in an `ArrayList` and provides a user-friendly menu-driven interface for interacting with the library.

---

## Detailed Explanation of Features

1. **Add Books**  
   Books are added to the library through the `addBook()` method, which checks if the book already exists by comparing the ISBN. If a book with the same ISBN exists, it displays an error message.

2. **Remove Books**  
   The `removeBook()` method removes a book from the library by its ISBN. If the book is not found, an error message is displayed.

3. **Display All Books**  
   The `displayBook()` method prints a list of all the books currently stored in the library, showing each book's details.

4. **Issue Books**  
   The `issueBook()` method allows a user to issue a book by providing its ISBN. It checks if the book is already issued and returns an appropriate message if the book is not available.

5. **Return Books**  
   The `returnBook()` method returns a book by its ISBN, making it available for others to issue. It ensures that only books that have been issued can be returned.

6. **Check Issue Status**  
   The `checkIssueStatus()` method checks if a specific book is issued or not. It displays the current issue status of the book based on its ISBN.

7. **Search Books**  
   The `searchBook()` method allows the user to search for books by title, author, or ISBN. The search is case-insensitive and can find partial matches, making it easy to locate a book in the library.

8. **Sort Books**  
   The system includes methods to sort the books by title, author, or ISBN. Sorting is done using Java’s `Collections.sort()` method and custom comparators.

---

## Conclusion

The **Library Management System** is a comprehensive project that demonstrates a variety of Java concepts, such as object-oriented programming, collections, and data manipulation. This project is suitable for beginners to understand core Java features and apply them in a practical scenario. It can also be enhanced further by adding features like user authentication, multiple users, or database integration.

---

Now you can copy this markdown and use it as your README file.
