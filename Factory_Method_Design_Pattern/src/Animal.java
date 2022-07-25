import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

    protected List<FeaturesDecoration> features=new ArrayList<>();

    public Animal(){
        createAnimal();
    }

    protected abstract void createAnimal();

    @Override
    public String toString() {
        return "Animal{" +
                "features=" + features +
                '}';
    }
}
