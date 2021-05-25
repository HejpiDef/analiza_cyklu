public class Main
{
    public static void main(String[] args)
    {
        Parking pr = new Parking();
        Car cr1 = RandomInfo.randomCar();
        Car cr2 = RandomInfo.randomCar();
        Motor mr = RandomInfo.randomMotor();

        pr.park(cr1);
        pr.park(mr);
        pr.park(cr2);
        pr.leave(mr);
    }
}
