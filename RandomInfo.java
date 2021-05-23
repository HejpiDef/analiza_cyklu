import java.util.Random;

public class RandomInfo
{
    private static Random rand;
    private static final String[] color = {"Czerwony", "Czarny", "Bialy", "Niebieski", "Zielony", "Zolty"};
    private static final String[] carType = {"SUV", "Coupe", "Combi", "Sedan", "Hatchback", "Minivan"};
    private static final double[] engineDisplacements = {1.4, 1.6, 1.8, 2.0, 2.2, 2.4, 3.0, 5.2};

    public static Car randomCar()
    {
        int carColor = rand.nextInt(color.length);
        int carTyp = rand.nextInt(carType.length);
        int engine = rand.nextInt(engineDisplacements.length);
        int randomPlate = rand.nextInt(99999) + 11111;
        int randomCarSize = rand.nextInt(5) + 1;
        boolean randomLPG = rand.nextBoolean();

        return new Car(color[carColor], "EL" + String.valueOf(randomPlate), carType[carTyp], randomCarSize, engineDisplacements[engine], randomLPG);
    }

    public static Motor randomMotor()
    {
        int motorColor = rand.nextInt(color.length);
        int randomPlate = rand.nextInt(9999) + 1111;

        return new Motor(color[motorColor], "EL" + String.valueOf(randomPlate));
    }

    public static Spot randomSpot(int spotNumber)
    {
        int randomSize = rand.nextInt(5) + 1;

        return new Spot(randomSize, spotNumber);
    }
}
