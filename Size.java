
/**
 * Class que define o tamanho dos copos
 *
 * @author Tiago Rosa
 * @version 08/03/2021
 */
public enum Size
{
    SMALL(32, 36, "Pequeno", 'S'),
    MEDIUM(37, 44, "Médio", 'M'),
    LARGE(45, 52, "Grande", 'L');
    
    private final String description;
    private final int minValue;
    private int maxValue;
    private final char code;
    
    private Size(int minValue, int maxValue, String description, char code)
    {
        this.description=description;
        this.minValue=minValue;
        this.maxValue=maxValue;
        this.code=code;
    }
    
    @Override
    public String toString()
    {
        return this.description;
    }
    
    public String getDiscription()
    {
        return description;
    }
    
    public int getMinValue()
    {
        return minValue;
    }
    
    public int getMaxValue()
    {
        return maxValue;
    }
    
    public char getCode()
    {
        return code;
    }
}
