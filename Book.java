
// abstract book class for the bookstore system
public abstract class Book{
    private String ISBN;
    private String title;
    private String year;
    private double price;

    public Book(String isbn , String title , String year ,double price )
    {
        this.ISBN = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
    }
   // Getters
    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
    // abstract method to buy a book with a specified quantity
    // polymorphic behavior for different book types
    public abstract double buy(int quantity , String email , String address);
}
