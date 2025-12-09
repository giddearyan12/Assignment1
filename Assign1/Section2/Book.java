package Java.Section2;

public class Book {
    String title;
    String author;



    

    public Book(String title, String author){
        this.title=title;
        this.author=author;
    }

    public void displayInfo(){
        System.out.println(title);
        System.out.println(author);
    }
    public static void main(String[] args) {
        Book b = new Book("Hey", "Hello");
        b.displayInfo();
    }
}
