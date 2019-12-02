import java.util.Iterator;
import java.util.ArrayList;
public class driveGroup extends Part{
    
    private String groupname;
    private String groupDescription;
    private ArrayList group = new ArrayList();


    public driveGroup(){
        this.groupname = "";


    }
    public driveGroup(String gn, String gd){
        this.gn = groupname;
        this.gd = groupDescription;
    }

    /**
     * @return Group Name
     */
    public int getGroupName() {
        return groupName;
    }

    /**
     * @return the group description
     */
    public String getGroupDesc() {
        return groupDescription;
    }

    /**
     * @return the compatability
     */
    public void addGpu(Part newgpu) {
        group.add(newgpu);
    }

    public void removeGpur(Part newgpu){
        group.remove(newgpu);
    }

    public Part getComponent(int partIndex){
        return (Part)group.get(partIndex);
    }

}