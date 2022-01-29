/**
 * Randomizes casing of the password
 */
public class RandomCasing extends PasswordDecorator
{
    /**
     *
     * @param passwordBeginning The previous password instance
     */
    public RandomCasing(final Password passwordBeginning)
    {
        super(passwordBeginning);
    }

    /**
     *
     * @return copy of the string with random casing
     */
    @Override
    public String getPassword()
    {
        final StringBuilder builder = new StringBuilder(password);
        final int length = builder.length();
        final java.util.Random random = new java.util.Random(length);
        for(int i = 0; i < length; ++i)
        {
            char c = builder.charAt(i);
            if(Character.isAlphabetic(c))
            {
                if((random.nextInt(2) + 1) % 2 == 1)
                {
                    c = Character.toUpperCase(c);
                }
                else
                {
                    c = Character.toLowerCase(c);
                }
            }
            builder.setCharAt(i, c);
        }
        return builder.toString();
    }
}