/**
 * Small car class
 */
public class SmallCar extends Car
{
    /**
     * Constructor
     * @param make car's make
     * @param model car's model
     */
    public SmallCar(final String make, final String model)
    {
        super(make, model);
    }

    /**
     * Adds a small frame
     */
    @Override
    protected void addFrame()
    {
        System.out.println("Adding a small frame");
    }

    /**
     * Adds 2 accessories
     */
    @Override
    protected void addAccessories()
    {
        this.accessories = genAccessoryList(new Accessory[]{Accessory.FLOOR_MATTS, Accessory.PHONE_CHARGER});
    }
}