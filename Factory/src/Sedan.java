/**
 * Sedan car class
 */
public class Sedan extends Car
{
    /**
     * Constructor
     * @param make car's make
     * @param model car's model
     */
    public Sedan(final String make, final String model)
    {
        super(make, model);
    }

    /**
     * Adds a three part frame
     */
    @Override
    protected void addFrame()
    {
        System.out.println("Adding a three part frame");
    }

    /**
     * Adds 5 accessories
     */
    @Override
    protected void addAccessories()
    {
        this.accessories = genAccessoryList(new Accessory[]{
                Accessory.FLOOR_MATTS, Accessory.PHONE_CHARGER, Accessory.BACK_UP_CAMERA,
                Accessory.EXTRA_CUP_HOLDERS, Accessory.HEATED_SEATS});
    }
}