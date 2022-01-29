public abstract class CarFactory
{
    /**
     * Creates Car objects
     * @param type
     * @param make
     * @param model
     * @return
     */
    public static Car createCar(final String type, final String make, final String model)
    {
        System.out.printf("Creating a %s %s\n", make, model);
        CarType carType = switch (type.toLowerCase())
                {
                    case "small" -> CarType.SMALL;
                    case "sedan" -> CarType.SEDAN;
                    case "luxury" -> CarType.LUXURY;
                    default -> CarType.NONE;
                };
        Car car = switch (carType)
                {
                    case SMALL -> new SmallCar(make, model);
                    case SEDAN -> new Sedan(make, model);
                    case LUXURY -> new Luxury(make, model);
                    case NONE -> null;
                };
        if(car == null)
        {
            System.err.println("No car specified");
            System.exit(1);
        }
        car.assemble();
        return car;
    }
}