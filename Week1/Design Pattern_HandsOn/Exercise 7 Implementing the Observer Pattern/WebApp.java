package ObserverPattern;

public class WebApp implements Observer {
    private String appName;
    public WebApp(String appName) 
    {
        this.appName = appName;
    }
    public void update(double stockPrice) 
    {
        System.out.println("WebApp " + appName + " - Stock Price Updated: " + stockPrice);
    }
}