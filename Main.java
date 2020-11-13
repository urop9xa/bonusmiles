public class Main {
    public static void main(String[] args) {
        int price = 30000;
        int bonusmiles = 1;
        int rubles = 20;
        int totalBonus = price * bonusmiles / rubles;
        System.out.println(totalBonus);
    }
}