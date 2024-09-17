package org.example;
import java.util.Scanner;

public class Main {
    //Candle
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

        public void main(String[] args) {

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
    //Scented Candles
    public class ScentedCandle extends Candle {

        private String scent;

        // Getter method for scent
        public String getScent() {
            return scent;
        }

        // Setter method for scent
        public void setScent(String scent) {
            this.scent = scent;
        }

        // Override the setHeight method to set the price at $3 a inch
        @Override
        public void setHeight(int height) {
            // Set height using parent method
            super.setHeight(height);
            // Set price at $3 per inch for scented candles
            super.setHeight(height);
        }
    }
    //DemoCandles
    public class DemoCandles {
        public void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Create and input details for a regular candle
            Candle regularCandle = new Candle();
            System.out.print("Enter color for the regular candle: ");
            regularCandle.setColor(input.nextLine());

            System.out.print("Enter height (in inches) for the regular candle: ");
            regularCandle.setHeight(input.nextInt());
            input.nextLine();

            // Create and input details for a scented candle
            ScentedCandle scentedCandle = new ScentedCandle();
            System.out.print("\nEnter color for the scented candle: ");
            scentedCandle.setColor(input.nextLine());

            System.out.print("Enter height (in inches) for the scented candle: ");
            scentedCandle.setHeight(input.nextInt());
            input.nextLine();

            System.out.println("Enter scent (e.g., Lavender, Gardenia, Rose, Vanilla): ");
            scentedCandle.setScent(input.nextLine());

            // Display details for both candles
            System.out.println("\nRegular Candle:");
            System.out.println("Color: " + regularCandle.getColor());
            System.out.println("Height: " + regularCandle.getHeight() + " inches");
            System.out.println("Price: R" + regularCandle.getPrice());

            System.out.println("\nScented Candle:");
            System.out.println("Color: " + scentedCandle.getColor());
            System.out.println("Height: " + scentedCandle.getHeight() + " inches");
            System.out.println("Scent: " + scentedCandle.getScent());
            System.out.println("Price: R" + scentedCandle.getPrice());

            input.close();
        }
    }



}





