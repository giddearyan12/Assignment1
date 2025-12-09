package Java.Section2;

class InnerEncapsulation {
    private String title;
    private String author;

    public void setter(String title, String author){
        this.title=title;
        this.author=author;
    }
    public void getter(){
        System.out.println(title);
        System.out.println(author);
    }
   
}

class Encapsulation {
public static void main(String[] args) {
    InnerEncapsulation en = new InnerEncapsulation();
    en.setter("hey", "hello");
    en.getter();
}
    
}
