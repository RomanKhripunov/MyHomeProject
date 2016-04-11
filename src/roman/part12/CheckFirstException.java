package roman.part12;

public class CheckFirstException {

    public static void main(String[] args) {
        String t = null;
        if (t == null) {
            throw new NullPointerException("t == null");
        }
    }
}
