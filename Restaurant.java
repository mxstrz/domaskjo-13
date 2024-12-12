import java.util.ArrayList;

class Restaurant {
    // Статичний список для зберігання всіх страв
    private static ArrayList<Dish> menu = new ArrayList<>();

    // Метод для додавання страви до меню
    public static void addDish(Dish dish) {
        menu.add(dish);
    }

    // Статичний метод для отримання загальної кількості страв
    public static int getTotalDishes() {
        return menu.size();
    }

    // Метод для виведення всіх страв
    public static void displayMenu() {
        for (Dish dish : menu) {
            dish.displayInfo();
        }
    }
}