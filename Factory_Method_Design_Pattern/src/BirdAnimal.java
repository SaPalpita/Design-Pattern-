public class BirdAnimal extends Animal{
    @Override
    protected void createAnimal() {
        features.add(new ColorDecoration());
        features.add(new SizeDecoration());
        features.add(new WingDecoration());
        features.add(new LegDecoration());
        features.add(new BeakDecoration());
    }
}
