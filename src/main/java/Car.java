public class Car {
    String brand;
    String model;
    String color;
    int yearManufactured;
    int speed;

    public Car(){

    }

    public void start(){
        System.out.println("Vroom Vroom");
    }

    public void accelerate(){
        this.speed += 5;
    }
}
