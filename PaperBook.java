// paper book class extends from the abstract Book class with additional stock
public class PaperBook  extends Book {
    private int stock;

    public PaperBook(String isbn, String title, String year, double price, int stock) {
        super(isbn, title, year, price);
        this.stock = stock;
    }

    public double buy(int quantity, String email, String address) {
        // Check if the requested quantity is available in stock
        if (stock < quantity) {
            throw new RuntimeException("Insufficient stock for " + getTitle());
        }
        stock -= quantity;
        ShippingService.send(address, getTitle());
        return getPrice() * quantity;// return paid amount
    }
}

