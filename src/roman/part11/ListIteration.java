package roman.part11;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.List;
import java.util.ListIterator;

public class ListIteration {

    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        ListIterator<Pet> listIterator = pets.listIterator();

        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + ", " + listIterator.nextIndex() + ", " + listIterator.previousIndex() + "; ");
        }
        System.out.println();

        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous().id() + " ");
        }
        System.out.println();

        System.out.println(pets);
        listIterator = pets.listIterator(3);

        while (listIterator.hasNext()){
            listIterator.next();
            listIterator.set(Pets.randomPet());
        }
        System.out.println(pets);
    }
}
