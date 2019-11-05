import java.util.List;

public class PC {

    private int pcID;
    private String status;
    private String progressPicURL;
    private List<Part> parts;
    private int orderID;

    public PC(){

    }

    public PC(int orderID){
        this.orderID = orderID;
        this.pcID = 123 * orderID;
        this.status = "New";
        this.progressPicURL = "http://www.ourpcbuilder.com/404";
    }

    /**
     * @return the orderID
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * @return the parts
     */
    public List<Part> getParts() {
        return parts;
    }

    /**
     * @return the pcID
     */
    public int getPcID() {
        return pcID;
    }

    /**
     * @return the progressPicURL
     */
    public String getProgressPicURL() {
        return progressPicURL;
    }
    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param progressPicURL the progressPicURL to set
     */
    public void setProgressPicURL(String progressPicURL) {
        this.progressPicURL = progressPicURL;
    }

    public void addPart(Part newPart){
        parts.add(newPart);
    }

    @Override
    public String toString() {
        String output = "Order ID: " + this.orderID + "\n";
        output += "PC ID: " + this.pcID + "\n";
        output += "Progress pic: " + this.progressPicURL + "\n";

        return output;
    }
}