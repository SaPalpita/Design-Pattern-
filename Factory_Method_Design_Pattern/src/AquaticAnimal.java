public class AquaticAnimal extends Animal{
    @Override
    protected void createAnimal() {
        features.add(new TailDecoration());
        features.add(new ColorDecoration());
        features.add(new SizeDecoration());
        features.add(new FinsDecoration());
    }
}
