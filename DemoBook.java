// demo books extending book class which are not for sale
public class DemoBook extends Book {
    public DemoBook(String isbn, String title, String year, double price) {
        super(isbn, title, year, price);
    }

    public double buy(int quantity , String email , String address) {
        // DemoBook does not support buying
        throw new RuntimeException("DemoBooks cannot be purchased.");
     }
}
