package roman.part13;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {

    private static List<Class<? extends Pet>> types = new ArrayList<>();

    private static String[] typeNames = {
            "roman.part13.Mut",
            "roman.part13.Pug",
            "roman.part13.EgyptianMau",
            "roman.part13.Manx",
            "roman.part13.Cymric",
            "roman.part13.Rat",
            "roman.part13.Mouse",
            "roman.part13.Hamster",
    };

    @SuppressWarnings("unckecked")
    private static void loader() {
        try {
            for (String name : typeNames) {
                types.add((Class<? extends Pet>) Class.forName(name));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }
}
