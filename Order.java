public class Order{

    private String trackingNo;
    private PC orderPC;
    private int orderID;

    public Order(){

    }

    /**
     * @return the orderID
     */
    public int getOrderID() {
        return orderID;
    }
    /**
     * @return the orderPC
     */
    public PC getOrderPC() {
        return orderPC;
    }
    /**
     * @return the trackingNo
     */
    public String getTrackingNo() {
        return trackingNo;
    }
    
}