package roman.other;

import java.io.*;

public class GenerateText {

    public static void main(String[] args) {
        try {
            File file = new File("d:\\newfile.txt");

            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d:\\newfile.txt"), "utf-8"))) {
            for (int i = 0; i < 20; i++) {
                if (i >= 10 && i < 100){
                    writer.write("\n<IdReply>\n" +
                            "\t<serialNum>" + i + "</serialNum>\n" +
                            "\t<fileSinceDt>2007-05-11+04:00</fileSinceDt>\n" +
                            "\t<idNum>1001" + i + "</idNum>\n" +
                            "\t<idType>21</idType>\n" +
                            "\t<idTypeText>Паспорт гражданина РФ</idTypeText>\n" +
                            "\t<seriesNumber>1042</seriesNumber>\n" +
                            "\t<issueCountry>МАГАДАН</issueCountry>\n" +
                            "\t<issueDate>2006-03-18+03:00</issueDate>\n" +
                            "\t<issueAuthority>14 ОМ ОВД Р-НА ТВЕРСКОЙ УВД ЦАО Г.МОСКВЫ 773014</issueAuthority>\n" +
                            "\t<lastUpdatedDt>2008-12-23+03:00</lastUpdatedDt>\n" +
                            "\t<freezeFlag>0</freezeFlag>\n" +
                            "\t<suppressFlag>0</suppressFlag>\n" +
                            "\t<disputedStatus></disputedStatus>\n" +
                            "\t<disputedRemarks></disputedRemarks>\n" +
                            "</IdReply>");
                } else if (i >= 100 && i < 200){
                    writer.write("\n<IdReply>\n" +
                            "\t<serialNum>" + i + "</serialNum>\n" +
                            "\t<fileSinceDt>2007-05-11+04:00</fileSinceDt>\n" +
                            "\t<idNum>100" + i + "</idNum>\n" +
                            "\t<idType>21</idType>\n" +
                            "\t<idTypeText>Паспорт гражданина РФ</idTypeText>\n" +
                            "\t<seriesNumber>1042</seriesNumber>\n" +
                            "\t<issueCountry>МАГАДАН</issueCountry>\n" +
                            "\t<issueDate>2006-03-18+03:00</issueDate>\n" +
                            "\t<issueAuthority>14 ОМ ОВД Р-НА ТВЕРСКОЙ УВД ЦАО Г.МОСКВЫ 773014</issueAuthority>\n" +
                            "\t<lastUpdatedDt>2008-12-23+03:00</lastUpdatedDt>\n" +
                            "\t<freezeFlag>0</freezeFlag>\n" +
                            "\t<suppressFlag>0</suppressFlag>\n" +
                            "\t<disputedStatus></disputedStatus>\n" +
                            "\t<disputedRemarks></disputedRemarks>\n" +
                            "</IdReply>");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
