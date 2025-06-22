package ObserverPattern;

public class ObserverPatternTest {
	 public static void main(String[] args) 
	 {
	        StockMarket stockMarket = new StockMarket();

	        Observer mobile = new MobileApp("M-001");
	        Observer web = new WebApp("W-001");

	        stockMarket.registerObserver(mobile);
	        stockMarket.registerObserver(web);

	        stockMarket.setStockPrice(150.75);
	        System.out.println("\n---\n");
	        stockMarket.setStockPrice(158.40);
	 }
}
