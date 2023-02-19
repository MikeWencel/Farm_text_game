public class Level {
    private int money;
    public Level(String level) {
        if (level.equals("Easy")){
            this.money = 10000;
        }
    }

    public int getMoney() {
        return this.money;
    }

}
