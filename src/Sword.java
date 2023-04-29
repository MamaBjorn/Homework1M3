
public class Sword<T extends Metal> {

    private final T metal;

    public Sword(T metal) {
        this.metal = metal;
    }

    public boolean checkEndurance() {
        return metal.Weight() > 19;


    }

}

