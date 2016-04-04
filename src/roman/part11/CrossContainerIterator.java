package roman.part11;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

public class CrossContainerIterator {

    public static void display(Iterator<Pet> iterator){
        while (iterator.hasNext()){
            Pet pet = iterator.next();
            System.out.print(pet.id() + ": " + pet + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Pet> petArrayList = Pets.arrayList(10);
        LinkedList<Pet> petLinkedList = new LinkedList<>(petArrayList);
        HashSet<Pet> petHashSet = new HashSet<>(petArrayList);
        TreeSet<Pet> petTreeSet = new TreeSet<>(petArrayList);
        display(petArrayList.iterator());
        display(petLinkedList.iterator());
        display(petHashSet.iterator());
        display(petTreeSet.iterator());
    }
}
