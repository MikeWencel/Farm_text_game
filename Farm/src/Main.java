import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();
        Level easy = new Level("Easy");
        Player player_one = new Player("Michal","Wencel",36,"Gouda",1987,9,20,easy);
        BankAccount beta_bank_account = new BankAccount(player_one);
        System.out.println(beta_bank_account.getBankAccountNumber());

        System.out.println(player_one.getPlayerMoney());

        System.out.println("Current time is: " + calendar.getTime());

    }
}