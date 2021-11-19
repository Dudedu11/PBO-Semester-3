package John;

import java.util.ArrayList;
import java.util.List;

public abstract class SuperHero {

    protected int powerLevel;
    protected String name;
    protected List<Power> powerList = new ArrayList();

    public SuperHero(int pLevel, String n){
        powerLevel = pLevel;
        name = n;
    }

    public int getPowerLevel(){
        return powerLevel;
    }

    public String getName(){
        return name;
    }

    public void addPower(Power power){
        powerList.add(power);
    }

    abstract void identity();

    public void showPowers(){
        System.out.println("TIME TO SHOW YOU MY POWERS");

        for(int i = 0 ; i < 2 ; i++){
            powerList.get(i).doPower();
        }
    }



}
