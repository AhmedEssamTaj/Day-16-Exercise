public class Bike implements Vehicle {

    private String brand;
    private int hour;

    public Bike(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
        displayDetails();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    @Override
    public double calculateRentalCoast() {
        return hour * 10;
    }

    @Override
    public void displayDetails() {
        System.out.println("=====================================");
        System.out.println("Rental Details: ");
        System.out.println("Bike Brand: " + brand);
        System.out.println("Hourly Rental Rate: $10");
        System.out.println("Rental Coast: $" + calculateRentalCoast());

    }
}
