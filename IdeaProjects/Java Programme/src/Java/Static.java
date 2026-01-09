package Java;

class Stat {
    String Brand;
    String Model;
    double price;
    static String name;

    public Stat(String brand, double price, String model) {
        Brand = brand;
        this.price = price;
        Model = model;
    }

    static {
        name = "Smart Phone";
    }

    void displayInfo() {
        System.out.println(
                "Category: " + name +
                        " | Brand: " + Brand +
                        " | Model: " + Model +
                        " | Price: " + price
        );
    }

}

public class Static {
    public static void main(String[] args) {
        Stat s1 = new Stat("Samsung", 50000, "S23");
        Stat s2 = new Stat("Apple", 90000, "iPhone 15");
        Stat s3 = new Stat("OnePlus", 45000, "11R");

        s1.displayInfo();
        Stat.name = "Folding Phone"; //If changes anywhere, it will be changed for all the next callings
        s2.displayInfo();
        s3.displayInfo();
    }
}
