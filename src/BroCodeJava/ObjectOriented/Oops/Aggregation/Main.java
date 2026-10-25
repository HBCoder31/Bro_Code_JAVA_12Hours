package BroCodeJava.ObjectOriented.Oops.Aggregation;

public class Main {
    static void main(String[] args) {

        // Aggregation = Represents a "has-a" relationship between objects.
//               One object contains another object as part of its structure,
//               but the contained object/s can exist independently.
        // Basically an object can contain another object but those objects
        // can exist independently

        Book book1 = new Book("The Fellow of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return Of The King", 416);

        Book[] books = {book1, book2, book3};

     //   System.out.println(book3.displayInfo());

     //   for(Book book : books){
       //     System.out.println(book.displayInfo());
       // }

        // NOW USE OF AGGREGATION

        Library library = new Library("Rajasthan Public Library", 1954, books);

        library.displayInfo();

    }
}
