public class Part{
    
    private String name;
    private String category;
    private String description;
    private Double price;
    private String status;
    private int stock;
    private int compatability;
    
    public Part(){

    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @return the compatability
     */
    public int getCompatability() {
        return compatability;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }
    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }
    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }
    
}