package FirstClass;

    class Car {

        private String model;
        private String color;
        private int year;
        private int mileage;
        private double fuelLevel;

        public Car(String model, String color, int year, int mileage, double fuelLevel) {
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            this.fuelLevel = fuelLevel;
        }

        // Методы класса
        public void startEngine() {
            System.out.println("Машина " + model + " завелась.");
        }

        public void stopEngine() {
            System.out.println("Машина " + model + " заглушена.");
        }

        public void refuel(double fuelAmount) {
            if (fuelAmount > 0) {
                this.fuelLevel += fuelAmount;
                System.out.println("В бак машины " + model + " залито " + fuelAmount + " литров топлива.");
            } else {
                System.out.println("Ошибка: Невозможно заправить машину отрицательным количеством топлива.");
            }
        }

        public void drive(double distance) {
            if (fuelLevel > 0) {
                double fuelConsumption = distance * 8 / 100; // Расход топлива (8 литров на 100 км)
                if (fuelConsumption <= fuelLevel) {
                    this.fuelLevel -= fuelConsumption;
                    System.out.println("Машина " + model + " проехала " + distance + " км.");
                } else {
                    System.out.println("Ошибка: Недостаточно топлива для поездки на " + distance + " км.");
                }
            } else {
                System.out.println("Ошибка: Невозможно проехать расстояние, пока бак пустой.");
            }
        }

        public void printInfo() {
            System.out.println("**Информация о машине:**");
            System.out.println("Модель: " + model);
            System.out.println("Цвет: " + color);
            System.out.println("Год выпуска: " + year);
            System.out.println("Пробег: " + mileage + " км");
            System.out.println("Уровень топлива: " + fuelLevel + " л");
        }

    }

    public class Test{
        public static void main(String[] args) {
            Car car1 = new Car("Lada Granta", "белый", 2021, 50000, 30.0);
            Car car2 = new Car("Toyota Camry 50", "серебристый", 2018, 80000, 20.0);
            Car car3 = new Car("Toyota Camry 60", "желтый", 2000, 80000, 20.0);
            Car car4 = new Car("Toyota Camry 70", "красный", 1999, 80000, 20.0);
            Car car5 = new Car("Toyota Camry 80", "серебристый", 2018, 80000, 20.0);
            Car car6 = new Car("Toyota Camry90", "серебристый", 2018, 80000, 20.0);
            Car car7 = new Car("Toyota Camry100", "серебристый", 2018, 80000, 20.0);
            Car car8 = new Car("Мерседес", "серебристый", 2018, 80000, 20.0);
            Car car9 = new Car("Роллс ройс", "серебристый", 2018, 80000, 20.0);
            Car car10 = new Car("Бмв", "серебристый", 2018, 80000, 20.0);

            car1.startEngine();
            car2.drive(100);
            car8.drive(20);
            car10.printInfo();
        }

    }

