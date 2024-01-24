package drinks;

/**
 * The most basic tea class.
 * 
 * @author Willow Sapphire
 * @version 01/24/2024
 */
public class Tea extends Beverage
{
    /**
     * Constructs a new tea object.
     */
    public Tea()
    {
        super("tea");
    }

    /**
     * Brews some tea.
     */
    public void brew()
    {
        System.out.println("steeping leaves in hot water...");
    }
}
