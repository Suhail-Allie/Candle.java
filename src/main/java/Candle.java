public class Candle {

    // Data fields
    private String color;
    private int height;
    private double price;

    // Getter method for color
    public String getColor() {
        return color;
    }

    // Setter method for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter method for height
    public int getHeight() {
        return height;
    }

    // Setter method for height
    public void setHeight(int height) {
        this.height = height;
        this.price = height * 10.0;
    }

    // Getter method for price
    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {

        Candle myCandle = new Candle();

        // Setting color and height
        myCandle.setColor("Blue");
        myCandle.setHeight(5);

        // Displaying the candle's details
        System.out.println("Candle Color: " + myCandle.getColor());
        System.out.println("Candle Height: " + myCandle.getHeight() + " CM");
        System.out.println("Candle Price: R" + myCandle.getPrice());
    }
}
