public class Spot
{
    public boolean isAvailable;
    public int spotSize;
    public int spotNumber;
    public Ticket assignedTicket;

    public Spot(int spotSize, int spotNumber)
    {
        this.spotSize = spotSize;
        this.spotNumber = spotNumber;
        this.isAvailable = true;
    }

    public boolean isAvailable()
    {
        return isAvailable;
    }

    public int getSpotSize()
    {
        return spotSize;
    }

    public int getSpotNumber()
    {
        return spotNumber;
    }

    public Ticket getAssignedTicket()
    {
        return assignedTicket;
    }

    public void changeAvailability()
    {
        if (this.isAvailable = false) isAvailable = true;
        else isAvailable = false;
    }

    public void setSpotSize(int spotSize)
    {
        this.spotSize = spotSize;
    }

    public void setSpotNumber(int spotNumber)
    {
        this.spotNumber = spotNumber;
    }

    public boolean willFit(Car car)
    {
        return car.getVehicleSize() <= this.getSpotSize();
    }

    public void setAssignedTicket(Ticket assignedTicket)
    {
        this.assignedTicket = assignedTicket;
    }
}
