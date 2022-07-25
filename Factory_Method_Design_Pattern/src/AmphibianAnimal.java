public class AmphibianAnimal extends Animal{
    @Override
    protected void createAnimal() {
        features.add(new SizeDecoration());
        features.add(new ColorDecoration());
        features.add(new LegDecoration());
        features.add(new TailDecoration());

    }
}
