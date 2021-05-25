import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Parking
{
    ArrayList<Spot> spots = new ArrayList<>(20);
    ArrayList<Ticket> tickets = new ArrayList<>(20);

    public Parking()
    {
        for(int i = 0; i<20; i++)
        {
            Spot s = RandomInfo.randomSpot(i);
            spots.add(s);
        }
    }

    public void park(Vehicle vehicle)
    {
        try
        {
            int spotNumber = lookForPlace(vehicle);
            if (spots.get(spotNumber).isAvailable()) {
                tickets.add(new Ticket(vehicle));
                spots.get(spotNumber).setAssignedTicket(tickets.get(tickets.size() - 1));
                spots.get(spotNumber).changeAvailability();
                System.out.println("Parked at " + spots.get(spotNumber).toString());
            }
        }
        catch (Exception exception)
        {
            System.out.println("Car is too big for these parking spots");
        }
    }

    public void leave(Vehicle vehicle)
    {
        try {
            for (int i = 0; i < 20; i++) {
                if (spots.get(i).getAssignedTicket().getAssignedVehicle().equals(vehicle)) {
                    LocalTime localTime = LocalTime.now();
                    LocalTime newLocalTime = localTime.plusHours(2);
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
                    spots.get(i).getAssignedTicket().setEndTime(newLocalTime.format(dateTimeFormatter));
                    spots.get(i).changeAvailability();
                    System.out.println("Left from " + spots.get(i).toString() + "\n Payment: " + Payment.calcPayment(spots.get(i).getAssignedTicket()));
                    spots.get(i).setAssignedTicket(null);
                    break;
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println(vehicle.toString() + " is not parked anywhere");
        }
    }

    private int lookForPlace(Vehicle vehicle)
    {
        int i = 0;

        for (; i<20; i++)
        {
            if (vehicle instanceof Car)
            {
                if (spots.get(i).willFit((Car) vehicle) && spots.get(i).isAvailable() && !((Car) vehicle).isLPG())
                    break;
            }
            else
            {
                if (spots.get(i).isAvailable())
                    break;
            }
        }

        return i;
    }
}
