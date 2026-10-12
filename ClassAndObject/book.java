package ClassAndObject;

public class book {
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;
    boolean IsBorrowed;
    static{
        totalNoOfBooks=0;
    }
    {
        totalNoOfBooks++;
    }

     // here Book () constructor cannot be created as name of class and constructor must be same!!!!!!


    book(String title , String author , String isbn){ 
        this.isbn=isbn;
        this.author=author;
        this.title=title;
    }
    book(String isbn)
    {
        this(isbn,"Unknown","unknown");
    }
    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }
    void borrowBook(){
        if(IsBorrowed){
            System.out.println("Book is already borrowed");
        }

        else
        {
            this.IsBorrowed=true;
            System.out.println("enjoy the book!!");
        }
    }
    void returnBook(){
        if(IsBorrowed){
            this.IsBorrowed=false;
            System.out.println("Hope you enjoyed the book !!");
        }
        else{
            System.out.println("Book is already in the library ");
        }
    }
    public static void main(String[] args) {
        book designOfThings = new book("1d","design","Author");
        book myBook = new book("2");
        System.out.println(book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
        myBook.borrowBook();

    }
}


