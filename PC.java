import java.util.List;

public class PC {

    private int pcID;
    private String status;
    private String progressPicURL;
    private List<Part> parts;

    public PC(){

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
}