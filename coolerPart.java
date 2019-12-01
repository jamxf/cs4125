public class coolerPart extends Part{
    
    private int partID;
    private String name;
    private String category;
    private String description;
    private Double price;
    private String status;
    private int stock;
    private int compatability;
    private String Vendor;
    private String formType;
    private String height;


    public coolerPart(){


    }
    
    public coolerPart(int id, String name, String category, 
    String description, Double price, String status, int compatability, 
    String V, String pU, String formT, String h){
        this.formType = formT;
        this.height = h;
        this.partID = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.status = status;
        this.compatability = compatability;
        this.Vendor = V;
        this.powerUsage = pU;
        this.formType = formT;
        this.height = t;
    }
    
    public String getFormType(){
        return formType;
    }

    public String getHeight(){
        return height;
    }

    /**
     * @return the partID
     */
    public int getPartID() {
        return partID;
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

    public int getVendor() {
        return Vendor;
    }

    public int getPU() {
        return powerUsage;
    }
    
}