import java.text.SimpleDateFormat;
import java.util.Date;

public class Payment
{
    public static double calcPayment(Ticket ticket)
    {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        double payment = 0.0;
        try
        {
            Date startDate = format.parse(ticket.getStartTime());
            Date endDate = format.parse(ticket.getEndTime());
            double parkingTime = (endDate.getTime() - startDate.getTime())/60000.0;

            double perMin = 1.50;
            if (ticket.getAssignedVehicle() instanceof Car)
            {
                Car cr = (Car) ticket.getAssignedVehicle();
                if (cr.getEngineDisplacement() < 2.0) payment = parkingTime * perMin;
                else if (cr.getEngineDisplacement() > 2.0 && cr.getEngineDisplacement() < 3.0) payment = parkingTime * perMin * 1.1;
                else if (cr.getEngineDisplacement() > 3.0) payment = parkingTime * perMin * 1.2;
            }
            else if(ticket.getAssignedVehicle() instanceof Motor)
            {
                Motor mr = (Motor) ticket.getAssignedVehicle();
                payment = parkingTime * perMin * mr.getDiscount();
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return payment;
    }
}
