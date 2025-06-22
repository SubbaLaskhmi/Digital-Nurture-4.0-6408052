package ImplementingProxyPattern;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) 
    {
        this.fileName = fileName;
    }
    public void display() {
        if (realImage == null) 
        {
            realImage = new RealImage(fileName); // Lazy load
        } 
        else 
        {
            System.out.println("Image already loaded: " + fileName);
        }
        realImage.display();
    }
}