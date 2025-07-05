package ObserverPattern;

public class MobileApp  implements Observer {
    private String appId;
    public MobileApp(String appId) 
    {
        this.appId = appId;
    }
    public void update(double stockPrice) 
    {
        System.out.println("MobileApp " + appId + " - Stock Price Updated: " + stockPrice);
    }
}