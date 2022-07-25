public class AnimalFactory {

    public static Animal createAnimal(AnimalType animalType){
        switch (animalType){
            case BIRD:
                return new BirdAnimal();
            case AMPHIBIAN:
                return new AmphibianAnimal();
            case AQUATIC:
                return new AquaticAnimal();
            case ARTHROPOD:
                return new ArthropodAnimal();
            case MAMMALS:
                return new MammalAnimal();
            case REPTILE:
                return new ReptileAnimal();
            default:
                return null;
        }
    }
}
