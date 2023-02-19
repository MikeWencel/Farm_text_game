import java.util.concurrent.ThreadLocalRandom;

public class BankAccount {

    private String bankAccountNumber;
    private Player player;

    private int money;

    public String create_bank_account(){
        String temp_number = "0";
        for(int i = 0; i<14;i++){
            int randomNum = ThreadLocalRandom.current().nextInt(1, 9 + 1);
            temp_number = randomNum + temp_number;
        }
        this.bankAccountNumber = temp_number;
        return this.bankAccountNumber;
    }

    public BankAccount(Player player) {
        this.bankAccountNumber = create_bank_account();
        this.money = player.getPlayerMoney();
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public int getMoney() {
        return money;
    }
}
