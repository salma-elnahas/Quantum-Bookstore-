public class Main{
  public static void main(String[] args) {
    // main class to test booking system
    Inventory inventory = new Inventory();
    // create instances of different book types
    Book paperBook = new PaperBook("0111", "Java Programming", "2020", 29.99, 10);
    Book demoBook = new DemoBook("0112", "Java Setup", "2022", 0.0);
    Book ebook = new Ebook("0113", "Advanced Java", "2023", 19.99, ".pdf");
    
    inventory.addBook(paperBook);
    inventory.addBook(demoBook);
    inventory.addBook(ebook);

    inventory.buyBook("0111", 1, "example@gmail.com", "123 Main St");
    // Uncommenting the following line will throw an exception since DemoBook cannot be purchased
    // inventory.buyBook("0112", 1, "example@gmail.com", "123 Main St");


    inventory.remove(2023, 2); // it will remove paperbook cause it was published 3 years ago


}
}

  