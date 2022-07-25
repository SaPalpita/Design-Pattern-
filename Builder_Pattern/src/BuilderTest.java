public class BuilderTest {
    public static void main(String[] args) {
        LapTopTelescopic1 lapTopTelescopic1=new LapTopTelescopic1("Windows");
        System.out.println(lapTopTelescopic1);

        LapTopTelescopic2 lapTopTelescopic2=new LapTopTelescopic2("Windows");
        System.out.println(lapTopTelescopic2);

        LapTopBuilder.Builder builder=new LapTopBuilder.Builder("Windows");

        LapTopBuilder lapTopBuilder=builder.ram(8).brand("MSI").build();
        System.out.println(lapTopBuilder);
    }

}
