/**
 * Removes the whitespace from a password
 */
public class EasyPassword extends Password
{
    /**
     * @param password The first version of password
     */
    public EasyPassword(final String password)
    {
        this.password = password;
    }

    /**
     * @return the password without spaces
     */
    @Override
    public String getPassword()
    {
        return password.replaceAll("[\\s]", "");
    }
}