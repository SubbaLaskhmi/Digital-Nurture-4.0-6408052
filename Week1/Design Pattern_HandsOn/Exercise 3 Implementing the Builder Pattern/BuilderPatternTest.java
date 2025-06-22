package ImplementingBuilderPattern;

public class BuilderPatternTest {

	public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
            .setCpu("Intel i9")
            .setRam("32GB")
            .setStorage("1TB SSD")
            .setGpu("NVIDIA RTX 4080")
            .setBluetooth(true)
            .setWifi(true)
            .build();

        System.out.println("Gaming PC: " + gamingPC.getSpecs());
    }	 
}

