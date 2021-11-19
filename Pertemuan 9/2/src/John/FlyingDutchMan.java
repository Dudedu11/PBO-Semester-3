package John;

import java.util.List;

public class FlyingDutchMan extends SuperHero{

    public FlyingDutchMan(int pLevel, String n){
        super(pLevel, n);
        super.addPower(new Flying());
        super.addPower(new LaserEye());
    }

    @Override
    public void identity(){
        System.out.println("It's " + super.getName() + ", the FlyingDutchMan! It has the power level of " + getPowerLevel());
        System.out.println(".....HEED ME.....");
        System.out.println("FOR MY NAAAAAAAME IS " + super.getName());
    }
}