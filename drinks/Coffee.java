package drinks;

/**
 * The most basic coffee class.
 * 
 * @author Willow Sapphire
 * @version 01/24/2024
 */
public class Coffee extends Beverage
{
    /**
     * Constructs a new coffee object.
     */
    public Coffee()
    {
        super("coffee");
    }

    /**
     * Brews some coffee.
     */
    public void brew()
    {
        System.out.println("Pouring hot water over coffee beans...");
    }
}
