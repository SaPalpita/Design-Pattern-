public class ReptileAnimal extends Animal{
    @Override
    protected void createAnimal() {
        features.add(new ColorDecoration());
        features.add(new SizeDecoration());

    }
}
