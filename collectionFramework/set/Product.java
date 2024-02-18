package collectionFramework.set;

import java.util.HashSet;
import java.util.Set;

public class Product {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return name;
    }
}
