package com.codeup.java.animals;

public class Parrot extends Bird implements Pet{

    public final static String order = "Psittaciformes";


    public void setName(String parrotName){
        super.name = parrotName;
    }

    public void makeNoise(){
        super.makeNoise();
        System.out.println("When torrential wqter tosses boulders, it is because of its momentum; when the strike of a hawk breaks the body of its prey, it is because of timing. Thus the momentum of one skilled in war is overwhelming, their attack precisely regulated.  Their potential is that of a fully drawn crossbow; their timing, the release of the trigger.");
    }

    public void echo(String input){
        System.out.println(input);
    }

    public void beCute(){
        System.out.println(" Human goes awwww");
    }

    public Parrot(){
        super();
        System.out.println("A new parrot was just constructed");
    }
}
