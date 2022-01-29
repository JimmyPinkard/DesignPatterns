import java.util.HashMap;
import java.util.Map;

/**
 * Replaces a few letters as if you got an DM from a serial killer
 */
public class Symbols extends PasswordDecorator
{
    /**
     *
     * @param passwordBeginning The previous password instance
     */
    public Symbols(final Password passwordBeginning)
    {
        super(passwordBeginning);
    }

    /**
     * 
     * @return
     */
    @Override
    public String getPassword()
    {
        String copy = password;
        final Map<Character, Character> map = new HashMap<>();
        map.put('a', '@');
        map.put('b', '8');
        map.put('e', '3');
        map.put('g', '9');
        map.put('i', '!');
        map.put('o', '0');
        map.put('s', '$');
        map.put('t', '7');
        for(final Map.Entry<Character, Character> entry : map.entrySet())
        {
            copy = copy.replace(entry.getKey(), entry.getValue());
        }
        return copy;
    }
}