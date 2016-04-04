package roman.other.hripunov;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class MyFileReader {
    public static void main(String[] args) throws IOException {
        MyFileCreator fileCreator = new MyFileCreator();
        // Создание файла для записи текста
        fileCreator.myFileCreate();
        // Запись текста в файл
        fileCreator.myFileWrite();

        // Чтение всего текста из файла
        String str = "";
        try(Scanner scanner = new Scanner(new File(fileCreator.getPathFile()))) {
            while (scanner.hasNext()) {
                str += scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Перезаписываем в пробел все знаки в строке кроме букв
//        str = str.replaceAll("[,.!?<>\"!@#$%^&*()№;:_/=\\+]","");
        str = str.replaceAll("[^а-яА-Я\\s+\\w+]","");
        String[] newStr = str.split(" ");
        Map<String, Integer> hm = new HashMap<>();
        for (String elemOfStr : newStr) {
            Integer count = hm.get(elemOfStr);
            if (count == null){
                hm.put(elemOfStr, 1);
            } else {
                hm.put(elemOfStr, ++count);
            }
        }
        System.out.println("");
        for (Map.Entry<String,Integer> finStr : hm.entrySet()){
            System.out.println(finStr.getKey() + " = " + finStr.getValue());
        }
    }
}
