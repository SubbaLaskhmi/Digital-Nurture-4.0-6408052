package ImplementingBuilderPattern;

public class Computer {
    private String cpu, ram, storage, gpu;
    private boolean hasBluetooth, hasWifi;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.hasBluetooth = builder.hasBluetooth;
        this.hasWifi = builder.hasWifi;
    }

    public String getSpecs() {
        return "CPU: " + cpu + "\nRAM: " + ram + "\nStorage: " + storage +
               "\nGPU: " + gpu + "\nBluetooth: " + hasBluetooth + "\nWiFi: " + hasWifi;
    }

    public static class Builder {
        private String cpu, ram, storage, gpu;
        private boolean hasBluetooth, hasWifi;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Builder setWifi(boolean hasWifi) {
            this.hasWifi = hasWifi;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
