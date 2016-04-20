package roman.part12;

class NeedsCleanup {

    private static int count = 1;
    private int id = count++;

    public void dispose() {
        System.out.println("NeedsCleanup " + id + " завершен");
    }
}

class CleanupException extends Exception {
}

class NeedsCleanup2 extends NeedsCleanup {

    public NeedsCleanup2() throws CleanupException {
    }
}

public class CleanupIdiom {

    public static void main(String[] args) {
//        Секция 1
        NeedsCleanup nc1 = new NeedsCleanup();
        try {
            //
        } finally {
            nc1.dispose();
        }

//        Секция 2
        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        try {
            //
        } finally {
            nc3.dispose();
            nc2.dispose();
        }

//        Секция 3
        try {
            NeedsCleanup2 nc4 = new NeedsCleanup2();
            try {
                NeedsCleanup2 nc5 = new NeedsCleanup2();
                try {
                    //
                } finally {
                    nc5.dispose();
                }
            } catch (CleanupException e) {
                System.out.println(e);
            } finally {
                nc4.dispose();
            }
        } catch (CleanupException e) {
            System.out.println(e);
        }
    }
}