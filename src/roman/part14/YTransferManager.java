package roman.part14;

import GolovachCourses.Account;
import GolovachCourses.TransactionManager;
import GolovachCourses.TryAgainEx;
import GolovachCourses.ZedDeadEx;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class YTransferManager implements TransactionManager {

    @Override
    public boolean transfer(Account[] accounts, int[] money) {
//        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\TestTransactions.txt"), "utf-8"))) {
        try (FileWriter fw = new FileWriter("D:\\TestTransactions.txt", true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter file = new PrintWriter(bw)) {
            try {
                for (int i = 0; i < accounts.length; i++) {
                    while (true) {
                        try {
                            accounts[i].change(money[i]);
//                            file.print(accounts[i] + ":" + money[i] + "; ");
                            file.print(money[i] + " ");
                            break;
                        } catch (TryAgainEx e) {
                            // Nothing to do
                        }
                    }
                }
                file.println();
            } catch (ZedDeadEx e) {


                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
