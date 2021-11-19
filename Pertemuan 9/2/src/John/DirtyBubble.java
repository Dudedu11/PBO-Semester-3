package John;

public class DirtyBubble extends SuperHero{

    public DirtyBubble(int pLevel, String n){
        super(pLevel, n);
        super.addPower(new Stength());
        super.addPower(new Flying());
    }

    @Override
    public void identity(){
        System.out.println("It's " + super.getName() + ", the FlyingDutchMan! It has the power level of " + getPowerLevel());
        System.out.println(".....HEED ME.....");
        System.out.println("FOR MY NAAAAAAAME IS " + super.getName());
    }
}