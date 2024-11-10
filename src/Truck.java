public class Truck implements Vehicle {
    private String type;
    private int week;

    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
        displayDetails();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }


    @Override
    public double calculateRentalCoast() {
        return week * 500;
    }

    @Override
    public void displayDetails() {
        System.out.println("=====================================");
        System.out.println("Rental Details: ");
        System.out.println("Truck Type: " + type);
        System.out.println("Weekly Rental Rate: $500");
        System.out.println("Rental Cost: $" + calculateRentalCoast());

    }
}
