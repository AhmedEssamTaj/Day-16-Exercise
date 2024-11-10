public class Car implements Vehicle {

    private String model;
    private int days;

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
        displayDetails();
    }
    public String getModel() {
        return model;
    }
    public int getDays() {
        return days;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public double calculateRentalCoast() {
        return days * 50;
    }

    @Override
    public void displayDetails() {
        System.out.println("=====================================");
        System.out.println("Rental Details: ");
        System.out.println("Car Model: " + this.model);
        System.out.println("Car Rental Rate: $50");
        System.out.println("Rental Coast: $" + calculateRentalCoast());

    }
}
