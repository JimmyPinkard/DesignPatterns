public class RandomCasing extends PasswordDecorator
{
    /**
     *
     * @param passwordBeginning The previous password instance
     */
    public RandomCasing(final Password passwordBeginning)
    {
        super(passwordBeginning);
        StringBuilder builder = new StringBuilder(password);
        int length = builder.length();
        java.util.Random random = new java.util.Random(length);
        for(int i = 0; i < length; ++i)
        {
            char c = builder.charAt(i);
            if(Character.isAlphabetic(c))
            {
                c = (random.nextInt(2) + 1) % 2 == 1 ? Character.toUpperCase(c) : Character.toLowerCase(c);
            }
            builder.setCharAt(i, c);
        }
        this.password = builder.toString();
    }

    /**
     *
     * @return
     */
    @Override
    public String getPassword()
    {
        return password;
    }
}