package roman.part13;

import java.util.HashMap;

public class PetCount {

    static class PetCounter extends HashMap<String, Integer> {

        public void count(String type) {
            Integer quantity = get(type);
            if (quantity == null) {
                put(type, 1);
            } else {
                put(type, quantity + 1);
            }
        }
    }

    public static void countPets(PetCreator creator) {
        PetCounter petCounter = new PetCounter();
        for (Pet pet : creator.createArray(20)) {
            System.out.print(pet.getClass().getSimpleName() + " ");

            if (pet instanceof Pet) {
                petCounter.count("Pet");
            } else if (pet instanceof Dog) {
                petCounter.count("Dog");
            } else if (pet instanceof Mutt) {
                petCounter.count("Mutt");
            } else if (pet instanceof Pug) {
                petCounter.count("Pug");
            }

            System.out.println();
            System.out.println(petCounter);
        }
    }

    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }
}
