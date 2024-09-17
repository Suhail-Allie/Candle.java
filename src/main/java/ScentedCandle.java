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




