public abstract class PasswordDecorator extends Password
{
    protected Password passwordBeginning;
    public PasswordDecorator(final Password passwordBeginning)
    {
        this.passwordBeginning = passwordBeginning;
        this.password = passwordBeginning.getPassword();
    }

    public abstract String getPassword();
}