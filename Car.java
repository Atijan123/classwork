public class Car extends Vehicle{
    @override
    public void StartEngine(){
        super.StartEngine();
        System.out.print("Car engine starts");
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.StartEngine();
    }
}