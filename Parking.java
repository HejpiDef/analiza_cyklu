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
        int spotNumber = lookForPlace(vehicle);
        if (spots.get(spotNumber).isAvailable())
        {
            tickets.add(new Ticket(vehicle));
            spots.get(spotNumber).setAssignedTicket(tickets.get(tickets.size() - 1));
            spots.get(spotNumber).changeAvailability();
        }
    }

    public void leave(Vehicle vehicle)
    {
        for (int i = 0; i<20; i++)
        {
            if (spots.get(i).getAssignedTicket().getAssignedVehicle().equals(vehicle))
            {
                LocalTime localTime = LocalTime.now();
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
                spots.get(i).getAssignedTicket().setEndTime(localTime.format(dateTimeFormatter));
                spots.get(i).changeAvailability();

                for (int j = 0; j < 20; j++)
                {
                    if (tickets.get(j).getAssignedVehicle().equals(vehicle))
                    {

                    }
                }
            }
        }
    }

    private int lookForPlace(Vehicle vehicle)
    {
        int i = 0;

        for (; i<20; i++)
        {
            if (spots.get(i).willFit((Car) vehicle) && spots.get(i).isAvailable()) break;
        }

        return i;
    }
}
