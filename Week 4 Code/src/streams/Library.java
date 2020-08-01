package streams;

import java.util.ArrayList;


public class Library {

    public static void main(String[] args) {
        
        ArrayList<Book> books = populateLibrary();
        //This will filter the array list to find all authors that begin with J
        //These authors will be added to the stream and then the stream will be printed.
        //Streams support lambdas do lambda notation can be used.
		/*
		 * books.stream().filter(book -> { //this is a lazy filter because return
		 * book.getAuthor().startsWith("J"); //it only adds authors beginning with J
		 * }).forEach(System.out::println);
		 */
        //regular stream
        books.stream().filter(book -> {
            return book.getAuthor().startsWith("J");
        }).filter(book -> {
            return book.getTitle().startsWith("E"); //more eager than the previous example
        }).forEach(System.out::println);  //because it also checks titles beginning with e      
    
      //parallel stream - uses more cores and improves performance
        books.parallelStream().filter(book -> {
            return book.getAuthor().startsWith("J");
        }).filter(book -> {
            return book.getTitle().startsWith("E"); //more eager than the previous example
        }).forEach(System.out::println);  //because it also checks titles beginning with e      
    
    }

    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList();
        books.add(new Book("Alice Walker", "The Color Purple"));
        books.add(new Book("Alice Walker", "Meridian"));
        books.add(new Book("Toni Morrison", "Beloved"));
        books.add(new Book("Toni Morrison", "Jazz"));
        books.add(new Book("Toni Morrison", "Paradise"));
        books.add(new Book("John Steinbeck", "The Grapes of Wrath"));
        books.add(new Book("John Steinbeck", "East of Eden"));
        books.add(new Book("Kazuo Ishiguro", "The Remains of the Day"));
        books.add(new Book("Kazuo Ishiguro", "Never Let Me Go"));
        books.add(new Book("Kazuo Ishiguro", "The Buried Giant"));
        books.add(new Book("Jane Austen", "Pride and Prejudice"));
        books.add(new Book("Jane Austen", "Emma"));
        books.add(new Book("Jane Austen", "Persuasion"));
        books.add(new Book("Jane Austen", "Mansfield Park"));
        books.add(new Book("Chinua Achebe", "Things Fall Apart"));
        books.add(new Book("Chinua Achebe", "No Longer at Ease"));
        books.add(new Book("Chinua Achebe", "Home and Exile"));
        return books;
    }

}
