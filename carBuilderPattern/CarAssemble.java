public class CarAssemble {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .color("red")
                .tranmission("automatic")
                .brand("Toyota")
                .engineType("gasoline")
                .passengerCapacity(5)
                .build();

        System.out.println(car);
    }
}