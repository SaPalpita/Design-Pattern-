public class LapTopBuilder {
    private  final String os;
    private final int ram;
    private final String processer;
    private final String brand;

    public LapTopBuilder(Builder builder){
        this.os=builder.os;
        this.processer=builder.processer;
        this.ram=builder.ram;
        this.brand=builder.brand;

    }

    static class Builder{
        private String os;
        private int ram;
        private String processer;
        private String brand;


        public LapTopBuilder build(){
            return new LapTopBuilder(this);
        }

        public Builder(String os){
            this.os=os;


        }
        public Builder ram(int ram){
            this.ram=ram;
            return this;
        }

        public Builder processer(String processer){
            this.processer=processer;
            return this;
        }

        public Builder brand(String brand){
            this.brand=brand;
            return this;
        }
    }

    @Override
    public String toString() {
        return "LapTopBuilder{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", processer='" + processer + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
