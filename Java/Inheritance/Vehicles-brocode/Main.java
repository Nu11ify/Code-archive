public class Main {
    public static void main(String[] args) {
        //Inheritance= The process where one class acquires the attributes and methods of another.


        //"This vehicle is moving", inheritance from vehicle class via car.
        Car car = new Car();
        car.go();

        //"This vehicle is stopped", inheritance from vehicle class via bicycle
        Bicycle bike = new Bicycle();
        bike.stop();

        System.out.println(car.speed);
        System.out.println(bike.speed);

        System.out.println(car.doors);
        System.out.println(bike.pedals);
        
        
    }
}