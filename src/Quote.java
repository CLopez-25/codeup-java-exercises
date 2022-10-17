public class Quote {
    public static String RandomQuote(){
        int randomNumber = (int) (Math.random() * 4) + 1;
        switch (randomNumber) {
            case 1 : return "Time is money";
            case 2 : return "Pura vide";
            case 3 : return "Knowledge is power";
            case 4 : return "With great power comes great responsibility";
            default : return "When torrential wqter tosses boulders, it is because of its momentum; when the strike of a hawk breaks the body of its prey, it is because of timing. Thus the momentum of one skilled in war is overwhelming, their attack precisely ";
        }
    }
}

