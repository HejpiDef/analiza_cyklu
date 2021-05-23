public class Motor extends Vehicle
{
    public final double discount = 0.2;

    public Motor(String color, String plate)
    {
        super(color, plate, "MOTOCYKL", 0.5);
    }

    public double getDiscount()
    {
        return discount;
    }
}
