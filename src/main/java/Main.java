public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();

        Car yourCar = new Car();
        yourCar.start();
        yourCar.accelerate();
        System.out.println(yourCar.speed);
    }
}
