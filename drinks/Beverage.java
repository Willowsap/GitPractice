package drinks;

/**
 * A generic beverage.
 * 
 * @author Willow Sapphire
 * @version 01/24/2024
 */
public abstract class Beverage
{
    /**
     * The name of the beverage.
     */
    private String name;

    /**
     * Constructs a new beverage.
     * 
     * @param name the name of the beverage.
     */
    public Beverage(String name)
    {
        this.name = name;
    }

    /**
     * Brews the beverage.
     */
    public abstract void brew();

    /**
     * Uses the beverage name as its string representation.
     */
    @Override
    public String toString()
    {
        return this.name;
    }
}