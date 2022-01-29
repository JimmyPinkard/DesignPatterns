/**
 * Luxury car class
 */
public class Luxury extends Car
{
    /**
     * Constructor
     * @param make car's make
     * @param model car's model
     */
    public Luxury(final String make, final String model)
    {
        super(make, model);
    }

    /**
     * Adds a beautiful frame
     */
    @Override
    protected void addFrame()
    {
        System.out.println("Adding a beautiful frame");
    }

    /**
     * Adds a custom engine
     */
    @Override
    protected void addEngine()
    {
        System.out.println("Adding a Supped Up Engine");
    }

    /**
     * Adds all the accessories
     */
    @Override
    protected void addAccessories()
    {
        this.accessories = genAccessoryList(new Accessory[]{
                Accessory.FLOOR_MATTS, Accessory.PHONE_CHARGER, Accessory.BACK_UP_CAMERA, Accessory.EXTRA_CUP_HOLDERS,
                Accessory.HEATED_SEATS, Accessory.SPORT_SEATS, Accessory.WINDOW_TINT, Accessory.HIGH_END_SOUND,
                Accessory.TRUNK_ORGANIZER, Accessory.BLUE_TOOTH});
    }
}