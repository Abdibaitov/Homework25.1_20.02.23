public class CarInfo {
    private int yearOfRelease;
    private String model;
    private double price;
    private String color;

    public CarInfo(int yearOfRelease, String model, double price, String color) {
        this.yearOfRelease = yearOfRelease;
        this.model = model;
        this.price = price;
        this.color = color;
    }
    public CarInfo(){

    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "yearOfRelease=" + yearOfRelease +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
