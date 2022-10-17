public class FighterTest {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
        fighter1.printStats();
        fighter1.name = "arata";
        fighter1.hitPoints = 17;
        fighter1.maxDamage = 14;
        fighter1.printStats();
    }
}
