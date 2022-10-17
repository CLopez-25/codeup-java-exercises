public class Quote {
    public static String RandomQuote(){
        int randomNumber = (int) (Math.random() * 4) + 1;
        return switch (randomNumber) {
            case 1 -> "Time is money";
            case 2 -> "Pura vide";
            case 3 -> "Knowledge is power";
            case 4 -> "With great power comes great responsibility";
            default ->
                    "When torrential wqter tosses boulders, it is because of its momentum; when the strike of a hawk breaks the body of its prey, it is because of timing. Thus the momentum of one skilled in war is overwhelming, their attack precisely regulated.  Their potential is that of a fully drawn crossbow; their timing, the release of the trigger.";
        };
    }
}

