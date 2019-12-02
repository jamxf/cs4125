package com.unstoppable.components;

import java.util.Iterator;
import java.util.ArrayList;
public class gpuGroup extends Part{
    
    private String groupname;
    private String groupDescription;
    private ArrayList group = new ArrayList();


    public gpuGroup(){
        this.groupname = "";


    }
    public gpuGroup(String gn, String gd){
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