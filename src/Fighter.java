public class Fighter {
    public String name;
    public int hitPoints;
    public int maxDamage;
    public void printStats(){
        System.out.printf("%s has %d hit points and can do %d damage%n", name, hitPoints, maxDamage);
    }
}
