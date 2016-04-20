package roman.part12;

public class Cleanup {

    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("D:\\Java\\MyHomeProject\\src\\roman\\part12\\Cleanup.java");

            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) == null) {
                }
            } catch (Exception e) {
                System.out.println("Перехвачено exception в main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("Сбой при конструировании InputFile");
        }
    }
}
