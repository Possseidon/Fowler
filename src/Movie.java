public class Movie {
	
	enum PriceType
	{
		REGULAR,
		NEW_RELEASE,
		CHILDRENS
    }
	
    private String title;
    private PriceType priceCode;
    
    public Movie(String newTitle, PriceType newPriceCode) 
    {
        title = newTitle;
        priceCode = newPriceCode;
    }
    
    public PriceType getPriceCode() 
    {
        return priceCode;
    }
    
    public void setPriceCode(PriceType arg) 
    {
        priceCode = arg;
    }
    
    public String getTitle()
    {
        return title;
    }
}