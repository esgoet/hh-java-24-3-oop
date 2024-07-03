import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();

        Car yourCar = new Car();
        yourCar.start();
        yourCar.accelerate();
        System.out.println(yourCar.speed);

        Person myPerson = new Person("Eva", 27, "female");
        myPerson.introduce();

        Car[] myCars = {myCar, yourCar};
        System.out.println(Arrays.toString(myCars));
        String objectString ="";
        for (Car car : myCars) {
            objectString += car.toString();
        }
        System.out.println(objectString);

    }
}
