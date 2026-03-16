class Car {

    class Engine {
        int power;

        Engine(int power) {
            this.power = power;
        }

        void show() {
            System.out.println("Engine power: " + power + " HP");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine engine = car.new Engine(200);
        engine.show();
    }
}
