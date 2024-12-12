import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        // Створення об’єктів класу Dish
        Dish soup = new Dish("Суп", 50.0, "Закуска");
        Dish pizza = new Dish("Піца", 120.0, "Основна страва");
        Dish iceCream = new Dish("Морозиво", 40.0, "Десерт");

        // Додавання страв до ресторану
        Restaurant.addDish(soup);
        Restaurant.addDish(pizza);
        Restaurant.addDish(iceCream);

        // Виведення інформації про всі страви
        System.out.println("Меню ресторану:");
        Restaurant.displayMenu();

        // Виведення загальної кількості страв у меню
        System.out.println("Загальна кількість страв у меню: " + Restaurant.getTotalDishes());

        System.out.println("\n--- Інформація про автомобілі ---");
        Car tesla = new Car("Tesla Model S", 2022, "Tesla");
        Car mustang = new Car("Ford Mustang", 2021, "Ford");
        Car camry = new Car("Toyota Camry", 2023, "Toyota");

        tesla.displayInfo();
        mustang.displayInfo();
        camry.displayInfo();

        System.out.println("Загальна кількість випущених автомобілів: " + Car.getTotalCarsProduced());
    }



    }
