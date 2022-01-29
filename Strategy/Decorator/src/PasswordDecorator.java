/**
 * Decorator for password
 */
public abstract class PasswordDecorator extends Password
{
    protected Password passwordBeginning;
    public PasswordDecorator(final Password passwordBeginning)
    {
        this.passwordBeginning = passwordBeginning;
        this.password = passwordBeginning.getPassword();
    }

    /**
     * Implemented by children
     * @return
     */
    public abstract String getPassword();
}