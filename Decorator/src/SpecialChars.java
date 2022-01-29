import java.util.HashMap;
import java.util.Map;

/**
 * Has a 30% chance to add a random special character
 */
public class SpecialChars extends PasswordDecorator
{
    //We don't need it for every instance
    private static final int capacity = 7;
    private static final Map<Integer, Character> specialChars = new HashMap<>(capacity);
    static
    {
        specialChars.put(0, '*');
        specialChars.put(1, '!');
        specialChars.put(2, '%');
        specialChars.put(3, '+');
        specialChars.put(4, '.');
        specialChars.put(5, '{');
        specialChars.put(6, '}');
    }

    /**
     *
     * @param passwordBeginning The previous password instance
     */
    public SpecialChars(final Password passwordBeginning)
    {
        super(passwordBeginning);
    }

    /**
     *
     * @return copy of the string with special characters added 30% of the time
     */
    @Override
    public String getPassword()
    {
        StringBuilder builder = new StringBuilder(password);
        int length = builder.length();
        java.util.Random random = new java.util.Random(length);
        for(int i = 0; i < length; ++i)
        {
            if(random.nextInt(10) < 3)
            {
                builder.insert(i, specialChars.get(random.nextInt(capacity)));
                ++length;
            }
        }
        return builder.toString();
    }
}