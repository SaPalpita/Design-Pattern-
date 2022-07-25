public class LapTopTelescopic2{
    String os;
    int ram;
    String processer;
    String brand;

    public LapTopTelescopic2(String os, int ram, String processer,String brand){
        this.os=os;
        this.ram=ram;
        this.processer=processer;
        this.brand=brand;
    }

    public LapTopTelescopic2(String os, int ram, String processer){
        this(os,ram,processer,null);
    }

    public LapTopTelescopic2(String os, int ram){
        this(os,ram,null);
    }

    public LapTopTelescopic2(String os){
        this(os,0);

    }

    @Override
    public String toString() {
        return "LapTopTelescopic2{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", processer='" + processer + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
