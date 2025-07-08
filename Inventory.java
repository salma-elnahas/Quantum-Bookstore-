import java.util.HashMap;

public class Inventory {
    // initialize a HashMap to store books with ISBN as the key
    private HashMap<String, Book> books;

    public Inventory() {
        books = new HashMap<>();
    }
   // add a book to the inventory using ISBN
   public void addBook(Book book) {
       books.put(book.getISBN(), book);
   }
  // remove a book from the inventory using ISBN
  public void remove(int current, int maxNum) {
    // lambda expression to remove outdated books based on the current year and maxNum
       books.values().removeIf(book -> {
           int bookYear = Integer.parseInt(book.getYear());
           // check if the book is outdated 
           boolean bookRemoved = (current - bookYear) > maxNum;
           if(bookRemoved) {
               System.err.println("Removing outdated book: " + book.getTitle() + " from inventory.");
           }
           return bookRemoved;
       });
    }
   // buy a book from the inventory using ISBN, quantity, email, and address
   public void buyBook(String isbn, int quantity, String email, String address) {
    // get the book from the inventory using ISBN
       Book book = books.get(isbn);
       if (book != null) {
           // call the buy method of the book depending on its type
           double amount = book.buy(quantity, email, address);
           System.out.println("Total price :" + amount + " for " + quantity + " copies of " + book.getTitle());
       } else {
        throw new RuntimeException("Book with ISBN " + isbn + " not found in inventory.");
        }
   }

    
}
