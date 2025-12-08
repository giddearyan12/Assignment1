package Java.Section2;

interface Drivable{
    abstract void startEngine();
    abstract void stopEngine();
}

class Interfaces implements Drivable{

    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }

    public static void main(String[] args) {
        Interfaces i = new Interfaces();
        i.startEngine();
        i.stopEngine();
    }
    
}

