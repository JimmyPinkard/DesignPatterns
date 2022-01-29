import java.util.ArrayList;
import java.util.List;

/**
 * Abstract base class for Cars
 */
public abstract class Car
{
    private final String make;
    private final String model;
    protected ArrayList<Accessory> accessories;

    /**
     * Constructor
     * @param make car's make
     * @param model car's model
     */
    public Car(final String make, final String model)
    {
        this.make = make;
        this.model = model;
    }

    /**
     * Assembles the avengers, I mean parts of the car
     */
    public void assemble()
    {
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        addAccessories();
        displayAccessories();
    }

    /**
     * Adds the wheels
     */
    protected void addWheels()
    {
        System.out.println("Adding the Wheels");
    }

    /**
     * Adds the engine
     */
    protected void addEngine()
    {
        System.out.println("Adding a Standard Engine");
    }

    /**
     * Adds the windows
     */
    protected void addWindows()
    {
        System.out.println("Adding Windows");
    }

    /**
     * Prints the Accessory List to stdout
     */
    protected void displayAccessories()
    {
        System.out.println("Accessories:");
        for(Accessory accessory : accessories)
        {
            System.out.printf("- %s\n", accessory.name());
        }
    }

    //Abstract methods to be implemented by children

    /**
     * Adds the frame to be implemented by children
     */
    protected abstract void addFrame();
    /**
     * Adds the accessories to be implemented by children
     */
    protected abstract void addAccessories();

    /**
     * Utility function I couldn't be bothered to keep writing List.of() and including 2 imports per class
     * @param accessories array of Accesories
     * @return the Array as an ArrayList
     */
    protected static ArrayList<Accessory> genAccessoryList(final Accessory[] accessories)
    {
        return new ArrayList<>(List.of(accessories));
    }
}