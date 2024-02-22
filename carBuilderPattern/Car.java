public class Car {

    protected final String brand, engineType, tranmission, color;
    protected final int passengerCapacity;

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", engineType=" + engineType +
                ", tranmission=" + tranmission + ", color="
                + color + ", passengerCapacity=" + passengerCapacity + "]";
    }

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.engineType = builder.engineType;
        this.tranmission = builder.tranmission;
        this.color = builder.color;
        this.passengerCapacity = builder.passengerCapacity;
    }

    protected static class CarBuilder {
        private String brand, engineType, tranmission, color;
        private int passengerCapacity;

        public CarBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder engineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public CarBuilder tranmission(String tranmission) {
            this.tranmission = tranmission;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder passengerCapacity(int passengerCapacity) {
            this.passengerCapacity = passengerCapacity;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getTranmission() {
        return tranmission;
    }

    public String getColor() {
        return color;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }
}