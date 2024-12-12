class Car {
    private String model;
    private int year;
    private String manufacturer;
    private static int totalCarsProduced = 0;

    // Конструктор
    public Car(String model, int year, String manufacturer) {
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        totalCarsProduced++;
    }

    // Метод для виведення інформації про автомобіль
    public void displayInfo() {
        System.out.println("Модель: " + model + ", Рік: " + year + ", Виробник: " + manufacturer);
    }

    // Статичний метод для отримання загальної кількості випущених автомобілів
    public static int getTotalCarsProduced() {
        return totalCarsProduced;
    }
}