package roman.part11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AsListInterface {

    public static void main(String[] args) {
        List<Snow> snowList1 = Arrays.asList(new Crusty(), new Slush(), new Powder());

//      Не компилируется, ошибка
//      List<Snow> snowList = Arrays.asList(new Light(), new Heavy());

        List<Snow> snowList2 = new ArrayList<Snow>();
        Collections.addAll(snowList2, new Light(), new Heavy());

        List<Snow> snowList4 = Arrays.<Snow>asList(new Light(), new Heavy());
    }
}

class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}