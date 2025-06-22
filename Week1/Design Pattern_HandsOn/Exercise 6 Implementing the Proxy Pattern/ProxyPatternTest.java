package ImplementingProxyPattern;

public class ProxyPatternTest {
	 public static void main(String[] args) {
	        Image image1 = new ProxyImage("nature.jpg");
	        image1.display();
	        System.out.println("\n---\n");
	        image1.display();
	  }
}
