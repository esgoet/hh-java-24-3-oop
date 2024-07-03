public class Car {
    String brand;
    String model;
    String color;
    int yearManufactured;
    boolean hasStarted;
    int speed;

    public Car(){

    }

    public void start(){
        System.out.println("Vroom Vroom");
        hasStarted = true;
    }

    public void accelerate(){
        if (hasStarted){
            this.speed += 5;
        } else {
            System.out.println("Please start your car first.");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearManufactured=" + yearManufactured +
                ", hasStarted=" + hasStarted +
                ", speed=" + speed +
                '}';
    }
}
