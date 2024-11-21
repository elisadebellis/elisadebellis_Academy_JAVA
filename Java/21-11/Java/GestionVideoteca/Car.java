class Vehicle {
    String brand = "Ford";
    public void honk(){
        System.out.println("Tutuu");
    }

    void run(){
        System.out.println("Il veicolo marcia");
    }

}

class Car extends Vehicle{
    private String modelName = "Fiat";
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.honk(); //ereditato dalla classe padre
    }

}

class Bike extends Vehicle {

    void run(){
        System.out.println("La bici sta correndo");
    }
}