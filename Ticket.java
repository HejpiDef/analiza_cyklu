import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ticket
{
    public String startTime;
    public String endTime;
    public Vehicle assignedVehicle;

    public Ticket(Vehicle vehicle)
    {
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        this.startTime = localTime.format(dateTimeFormatter);
        this.assignedVehicle = vehicle;
    }

    public String getEndTime()
    {
        return endTime;
    }

    public String getStartTime()
    {
        return startTime;
    }

    public Vehicle getAssignedVehicle()
    {
        return assignedVehicle;
    }

    public void setEndTime(String endTime)
    {
        this.endTime = endTime;
    }

    public void setAssignedVehicle(Vehicle assignedVehicle)
    {
        this.assignedVehicle = assignedVehicle;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", assignedVehicle=" + assignedVehicle +
                '}';
    }
}
