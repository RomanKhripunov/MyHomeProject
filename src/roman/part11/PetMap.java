package roman.part11;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.Map;

public class PetMap {

    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<>();
        petMap.put("My cat", new Cat("Molly"));
        petMap.put("My dog", new Dog("Ginger"));
        petMap.put("My hamster", new Hamster("Bosco"));
        System.out.println(petMap);

        Pet dog = petMap.get("My dog");
        System.out.println(dog);

        System.out.println(petMap.containsKey("My dog"));
        System.out.println(petMap.containsValue(dog));
    }
}
