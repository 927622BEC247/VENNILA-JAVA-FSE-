class Car {
    String make, model;
    int year;
    Car(String m, String mo, int y) {
        make = m; model = mo; year = y;
    }
    void displayDetails() {
        System.out.println(make + " " + model + " " + year);
    }
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Camry", 2021);
        c.displayDetails();
    }
}
