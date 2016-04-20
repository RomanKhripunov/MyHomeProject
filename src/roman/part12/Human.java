package roman.part12;

class Annoyance extends Exception {
}

class Sneeze extends Annoyance {
}

public class Human {

    public static void main(String[] args) {
        try {
            throw new Sneeze();
        } catch (Sneeze e) {
            System.out.println("Перехвачено Sneeze");
        } catch (Annoyance e) {
            System.out.println("Перехвачено Annoyance");
        }

        try {
            throw new Sneeze();
        } catch (Annoyance e) {
            System.out.println("Перехвачено Annoyance");
        }
    }
}
