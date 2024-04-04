package DP;

public class Decorator {
    public static void main(String[] args) {

    }

}
interface Car{
    public void drive();
}
class BasicCar implements Car{
    String color="";

    public void drive(){
        System.out.println("drive");
    }

}
class CarDecorator1 implements Car {
        protected Car car;
    CarDecorator1(Car c)
    {
        this.car=c;
    }

    @Override
    public void drive() {
        car.drive();
        System.out.println("Adding decorator");
    }
}
class CarDecoratorLuxury extends CarDecorator1 {

    CarDecoratorLuxury(Car c)
    {
        super(c);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Luxury also now");
    }
}


