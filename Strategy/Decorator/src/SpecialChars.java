import java.util.HashMap;
import java.util.Map;

/**
 * Has a 30% chance to add a random special character
 */
public class SpecialChars extends PasswordDecorator
{
    /**
     *
     * @param passwordBeginning The previous password instance
     */
    public SpecialChars(final Password passwordBeginning)
    {
        super(passwordBeginning);
        StringBuilder builder = new StringBuilder(password);
        int length = builder.length();
        java.util.Random random = new java.util.Random(length);
        final Map<Integer, Character> map = new HashMap<>();
        map.put(0, '*');
        map.put(1, '!');
        map.put(2, '%');
        map.put(3, '+');
        map.put(4, '.');
        map.put(5, '{');
        map.put(6, '}');
        for(int i = 0; i < length; ++i)
        {
            if(random.nextInt(10) < 3)
            {
                builder.insert(i, map.get(random.nextInt(map.size())));
                ++length;
            }
        }
    }

    @Override
    public String getPassword()
    {
        return password;
    }
}