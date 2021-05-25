public class Car extends Vehicle
{
    public double engineDisplacement;
    public boolean LPG;

    public Car(String color, String plate, String typ, int carSize, double engineDisplacement, boolean LPG)
    {
        super(color, plate, "Auto " + typ, carSize);
        this.engineDisplacement = engineDisplacement;
        this.LPG = LPG;
    }

    public double getEngineDisplacement()
    {
        return engineDisplacement;
    }

    public boolean isLPG()
    {
        return LPG;
    }

    public void setEngineDisplacement(int engineDisplacement)
    {
        this.engineDisplacement = engineDisplacement;
    }

    public void setLPG(boolean LPG)
    {
        this.LPG = LPG;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                " engineDisplacement=" + engineDisplacement +
                ", LPG=" + LPG +
                '}';
    }
}
