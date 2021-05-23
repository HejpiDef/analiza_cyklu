public class Vehicle
{
    public String color;
    public String plate;
    public String typ;
    public double vehicleSize;

    public Vehicle(String color, String plate, String typ, double vehicleSize)
    {
        this.color = color;
        this.plate = plate;
        this.typ = typ;
        this.vehicleSize = vehicleSize;
    }

    public String getColor()
    {
        return color;
    }

    public String getPlate()
    {
        return plate;
    }

    public String getTyp()
    {
        return typ;
    }

    public double getVehicleSize()
    {
        return vehicleSize;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setPlate(String plate)
    {
        this.plate = plate;
    }

    public void setTyp(String typ)
    {
        this.typ = typ;
    }

    public void setVehicleSize(int vehicleSize)
    {
        this.vehicleSize = vehicleSize;
    }
}
