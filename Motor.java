public class Motor extends Vehicle
{
    public final double discount = 0.8;

    public Motor(String color, String plate)
    {
        super(color, plate, "MOTOCYKL", 0.5);
    }

    public double getDiscount()
    {
        return discount;
    }

    @Override
    public String toString() {
        return "Motor{" + super.toString() +
                " discount=" + discount +
                '}';
    }
}
