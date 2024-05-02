package SecondClass;

public class Test2 {
    public static void main(String[] args) {
       CoffeeMachine coffeeMachine1 = new CoffeeMachine("Loro Piana", 1000, 250);
        CoffeeMachine coffeeMachine2 = new CoffeeMachine("LG", 800, 500);
        CoffeeMachine coffeeMachine3 = new CoffeeMachine("Samsung", 500, 300);
        CoffeeMachine coffeeMachine4 = new CoffeeMachine("Toyota", 400, 150);


       coffeeMachine4.turnOn();
       coffeeMachine1.addWater(300);
       coffeeMachine1.turnOn();
       coffeeMachine1.makeAmericano();
    }
}
 class CoffeeMachine {

    private String model; // Модель
    private int waterLevel; // Уровень воды (в мл)
    private int coffeeBeansLevel; // Уровень кофейных зерен (в граммах)
    private boolean isOn; // Состояние кофемашины (включена/выключена)
    private int cupsMade; // Количество приготовленных чашек кофе

    public CoffeeMachine(String model, int waterLevel, int coffeeBeansLevel) {
        this.model = model;
        this.waterLevel = waterLevel;
        this.coffeeBeansLevel = coffeeBeansLevel;
        this.isOn = false;
        this.cupsMade = 0;
    }

    // Методы класса
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Кофемашина " + model + " включена.");
        } else {
            System.out.println("Кофемашина " + model + " уже включена.");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Кофемашина " + model + " выключена.");
        } else {
            System.out.println("Кофемашина " + model + " уже выключена.");
        }
    }

    public void addWater(int waterAmount) {
        if (waterAmount > 0) {
            this.waterLevel += waterAmount;
            System.out.println("В кофемашину " + model + " добавлено " + waterAmount + " мл воды.");
        } else {
            System.out.println("Ошибка: Невозможно добавить отрицательное количество воды.");
        }
    }

    public void addCoffeeBeans(int coffeeBeansAmount) {
        if (coffeeBeansAmount > 0) {
            this.coffeeBeansLevel += coffeeBeansAmount;
            System.out.println("В кофемашину " + model + " добавлено " + coffeeBeansAmount + " г кофейных зерен.");
        } else {
            System.out.println("Ошибка: Невозможно добавить отрицательное количество кофейных зерен.");
        }
    }

    public void makeEspresso() {
        if (isOn && waterLevel >= 50 && coffeeBeansLevel >= 10) {
            this.waterLevel -= 50;
            this.coffeeBeansLevel -= 10;
            this.cupsMade++;
            System.out.println("Приготовлен эспрессо на кофемашине " + model + ".");
        } else {
            if (!isOn) {
                System.out.println("Ошибка: Кофемашина " + model + " выключена.");
            } else if (waterLevel < 50) {
                System.out.println("Ошибка: Недостаточно воды для приготовления эспрессо.");
            } else if (coffeeBeansLevel < 10) {
                System.out.println("Ошибка: Недостаточно кофейных зерен для приготовления эспрессо.");
            }
        }
    }

    public void makeAmericano() {
        if (isOn && waterLevel >= 100 && coffeeBeansLevel >= 10) {
            this.waterLevel -= 100;
            this.coffeeBeansLevel -= 10;
            this.cupsMade++;
            System.out.println("Приготовлен американо на кофемашине " + model + ".");
        } else {
            if (!isOn) {
                System.out.println("Ошибка: Кофемашина " + model + " выключена.");
            } else if (waterLevel < 100) {
                System.out.println("Ошибка: Недостаточно воды для приготовления американо.");
            } else if (coffeeBeansLevel < 10) {
                System.out.println("Ошибка: Недостаточно кофейных зерен для приготовления американо");

            }
        }
    }
 }