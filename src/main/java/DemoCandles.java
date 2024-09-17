import java.util.Scanner;

public class DemoCandles {
        public static void main(String[] args) {
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


