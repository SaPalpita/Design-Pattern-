public class MammalAnimal extends Animal{
    @Override
    protected void createAnimal() {
        features.add(new ColorDecoration());
        features.add(new SizeDecoration());
        features.add(new TailDecoration());
        features.add(new LegDecoration());
    }
}
