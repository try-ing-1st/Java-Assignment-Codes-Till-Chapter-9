import java.util.Date;

public class Stock {
 private String name;
 private String symbol;
 private double previousClosingPrice;
 private double currentPrice;
 private Date dateCreated = new Date();
 
// Constructor
 public Stock(String inputSymbol, String inputName) {
   name = inputName;
   symbol = inputSymbol;
  }
// Accessor and Getter
  public void setPreviousClosingPrice(double lastPrice) {
   previousClosingPrice = lastPrice;
  }
  public double getPreviousClosingPrice() {
   return previousClosingPrice;
  }
  public void setCurrentPrice(double newPrice) {
   currentPrice = newPrice;
  }
  public double getCurrentPrice() {
   return currentPrice;
  }
  public double getChangePercent() {
  return (((currentPrice - previousClosingPrice) / previousClosingPrice) * 100);
 }
}
