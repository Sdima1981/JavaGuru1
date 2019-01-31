package lv.javaguru.book;

public class BookTest  {
    public static void main(String[] args){
        Book myBook = new Book ();
        myBook.setAuthor ("Michael Bulgakov");
        myBook.setTitle ("Master & Margarita");
        myBook.setYear (1975);
        myBook.setPageCount (467);

        System.out.println ("Book title: " + myBook.title);
        System.out.println ("Book author: " + myBook.author);
        System.out.println ("Book year: " + myBook.year);
        System.out.println ("Book page count: " + myBook.pageCount + " pages");
    }
}
