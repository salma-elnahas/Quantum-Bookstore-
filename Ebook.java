// ebook class extending the Book class
public class Ebook extends Book {
    private String Filetype; // e.g., PDF, EPUB, MOBI

    public Ebook(String isbn, String title, String year, double price, String Filetype) {
        super(isbn, title, year, price);
        this.Filetype = Filetype;
    }

    public String getFiletype() {
        return Filetype;
    }
    public double buy(int quantity , String email , String address) {
        // Ebooks are not added to stock instead sent to email
        MailService.send(email, getTitle());
        return getPrice() * quantity; // Return total price  
     }
    
}
