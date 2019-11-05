public class Order{

    private String trackingNo;
    private PC orderPC;
    private int orderID;
    private String customer;

    public Order(){

    }

    //Create a new order with a specified orderID
    public Order(int orderID, String customer){
        this.orderID = orderID;
        this.customer = customer;
        this.trackingNo = "NoTrackingNumSet";
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

    /**
     * @param trackingNo the trackingNo to set
     */
    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    /**
     * @param orderPC the orderPC to set
     */
    public void setOrderPC(PC orderPC) {
        this.orderPC = orderPC;
    }


    public void newPC(){
        this.orderPC = new PC(orderID);
    }

    @Override
    public String toString() {
        String output = "Customer: " + this.customer + "\n";
        output += "Order ID: " + this.orderID + "\n";
        output += "Tracking #: " + this.trackingNo + "\n";

        return output;
    }
}