package roman.part11;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.Iterator;
import java.util.List;

public class SimpleIterator {

    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);
        Iterator<Pet> petIterator = pets.iterator();

        while (petIterator.hasNext()){
            Pet pet = petIterator.next();
            System.out.println(pet.id() + " " + pet + " ");
        }

        System.out.println();
        for (Pet p : pets){
            System.out.println(p.id() + " " + p + " ");
        }

        System.out.println();
        petIterator = pets.iterator();
        for (int i = 0; i < 6; i++) {
            petIterator.next();
            petIterator.remove();
        }
        System.out.println(pets);
    }
}
