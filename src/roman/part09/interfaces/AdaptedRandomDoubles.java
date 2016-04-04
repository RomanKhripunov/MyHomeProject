package roman.part09.interfaces;

import java.nio.CharBuffer;
import java.util.Locale;
import java.util.Scanner;

public class AdaptedRandomDoubles extends RandomDoubles
implements Readable {

    private int count;

    public AdaptedRandomDoubles(int count){
        this.count = count;
    }

    public int read(CharBuffer cb){
        if (count-- == 0){
            return -1;
        }
        String result = Double.toString(next()) + " ";
        cb.append(result);

        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomDoubles(7));
        System.out.println(s.locale());
        while (s.hasNextDouble()) {
            System.out.print(s.nextDouble() + " ");
        }
    }
}
