package com.unstoppable.components;

import java.util.Iterator;
import java.util.ArrayList;

public class PartGroup extends Part{
    
    private String groupname;
    private String groupDescription;
    private ArrayList group = new ArrayList();


    public PartGroup(){
        this.groupname = "";
        this.groupDescription="";


    }
    public PartGroup(String gn, String gd){
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
    public void addPart(Part newPart) {
        group.add(newPartS);
    }

    public void removePart(Part newPart){
        group.remove(newgpu);
    }

    public Part getComponent(int partIndex){
        return (Part)group.get(partIndex);
    }

}
