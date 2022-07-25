public class Application {
    public static void main(String[] args) {
        Animal animal1=AnimalFactory.createAnimal(AnimalType.AMPHIBIAN);
        System.out.println(animal1);

        Animal animal2=AnimalFactory.createAnimal(AnimalType.AQUATIC);
        System.out.println(animal2);

        Animal animal3=AnimalFactory.createAnimal(AnimalType.ARTHROPOD);
        System.out.println(animal3);

        Animal animal4=AnimalFactory.createAnimal(AnimalType.BIRD);
        System.out.println(animal4);

        Animal animal5=AnimalFactory.createAnimal(AnimalType.MAMMALS);
        System.out.println(animal5);

        Animal animal6=AnimalFactory.createAnimal(AnimalType.REPTILE);
        System.out.println(animal6);
    }
}
