import java.util.ArrayList;

class Dish {
    private String name;
    private double price;
    private String category;

    // Конструктор
    public Dish(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Метод для виведення інформації про страву
    public void displayInfo() {
        System.out.println("Назва: " + name + ", Ціна: " + price + ", Категорія: " + category);
    }
}
