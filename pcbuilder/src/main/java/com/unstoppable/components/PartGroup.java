package com.unstoppable.components;

import java.util.Iterator;
import java.util.ArrayList;

public class PartGroup extends Part{
    
    private String groupName;
    private String groupDescription;
    private ArrayList group = new ArrayList();


    public PartGroup(){
        this.groupName = "";
        this.groupDescription="";


    }
    public PartGroup(String gn, String gd){
        this.groupName = gn;
        this.groupDescription = gd;
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
        group.add(newPart);
    }

    public void removePart(Part newPart){
        group.remove(newPart);
    }

    public Part getComponent(int partIndex){
        return (Part)group.get(partIndex);
    }

}
