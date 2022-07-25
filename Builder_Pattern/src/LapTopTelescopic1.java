public class LapTopTelescopic1 {
    String os;
    int ram;
    String processer;
    String brand;

    public LapTopTelescopic1(String os){
        this.os=os;
    }
    public LapTopTelescopic1(String os, int ram){
        this(os);
        this.ram=ram;
    }
    public LapTopTelescopic1(String os, int ram, String processer){
        this(os,ram);
        this.processer=processer;
    }
    public LapTopTelescopic1(String os, int ram, String processer,String brand){
        this(os,ram,processer);
        this.brand=brand;
    }

    @Override
    public String toString() {
        return "LapTopTelescopic1{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", processer='" + processer + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
