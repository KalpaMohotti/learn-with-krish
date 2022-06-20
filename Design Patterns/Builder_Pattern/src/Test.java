public class Test {
    public static void main(String[] args) {
        Mobile.Builder b=new Mobile.Builder();
        b.setBrand("Samsung").setModel("M12").setPrice(35000).setStorage(64).setNFC(true).setDisplay_size(6.5).setCamera(5).setRam(4);
        Mobile m=b.build();
        System.out.println(m);
    }
}
