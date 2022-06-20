class Mobile {

    private String brand;
    private String model;
    private int ram;
    private double price;
    private int storage;
    private double display_size;
    private boolean NFC;
    private int camera;

    public Mobile(Builder b) {
        this.brand = b.brand;
        this.model = b.model;
        this.ram = b.ram;
        this.price = b.price;
        this.storage = b.storage;
        this.display_size = b.display_size;
        this.NFC = b.NFC;
        this.camera = b.camera;
    }



    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public double getPrice() {
        return price;
    }

    public int getStorage() {
        return storage;
    }

    public double getDisplay_size() {
        return display_size;
    }

    public boolean isNFC() {
        return NFC;
    }

    public int getCamera() {
        return camera;
    }

    @Override
    public String toString() {
        String output="Brand- "+getBrand()+ " Model- "+getModel()+" RAM- "+getRam()+" Price- "+getPrice()+ " Storage- "+getStorage()+" Display Size- "+getDisplay_size()+" NFC- "+isNFC()+" Camera- "+getCamera();
        return output;
    }



    static class Builder {

        private String brand;
        private String model;
        private int ram;
        private double price;
        private int storage;
        private double display_size;
        private boolean NFC;
        private int camera;

        public Mobile build(){
            Mobile m=new Mobile(this);
            return m;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setDisplay_size(double display_size) {
            this.display_size = display_size;
            return this;
        }

        public Builder setNFC(boolean NFC) {
            this.NFC = NFC;
            return this;
        }

        public Builder setCamera(int camera) {
            this.camera = camera;
            return this;
        }


    }
}
