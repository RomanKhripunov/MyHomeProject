package roman.part12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {

    private BufferedReader in;

    public InputFile(String fileName) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть " + fileName);
//            Файл не открывался, поэтому  не может быть закрыт
            throw e;
        } catch (Exception e) {
//            При других исключениях файл должен быть закрыт

            try {
                in.close();
            } catch (IOException e1) {
                System.out.println("in.close() исполнен неудачно");
            }
            throw e;
        } finally {
//            НЕ ЗАКРЫВАЕЙТЕ ЗДЕСЬ ФАЙЛ
        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("readLine() исполнен неудачно");
        }
        return s;
    }

    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() успешен");
        } catch (IOException e) {
            throw new RuntimeException("dispose() исполнен неудачно");
        }
    }
}
