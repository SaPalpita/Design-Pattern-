public class ArthropodAnimal extends Animal {

    @Override
    protected void createAnimal() {
        features.add(new SizeDecoration());
        features.add(new ColorDecoration());
    }
}
