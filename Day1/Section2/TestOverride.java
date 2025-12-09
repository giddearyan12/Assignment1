package Java.Section2;

class Animal {

    public void makeSound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Dog bark");
    }
  
    
}
class TestOverride {
    public static void main(String[] args) {
        Animal obj = new Animal();   
        obj.makeSound();
    }
}
