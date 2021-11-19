package John;

public class ManRay extends SuperHero{

    public ManRay(int pLevel, String n){
        super(pLevel, n);
        super.addPower(new LaserEye());
        super.addPower(new Stength());
    }

    @Override
    public void identity(){
        System.out.println("It's " + super.getName() + ", the FlyingDutchMan! It has the power level of " + getPowerLevel());
        System.out.println(".....HEED ME.....");
        System.out.println("FOR MY NAAAAAAAME IS " + super.getName());
    }
}