package com.unstoppable.components;
/**
 *
 * @author Iansi
 */
import java.util.Iterator;
import java.util.ArrayList;
public class gpuGroup extends Part{
    
    private String groupName;
    private String groupDescription;
    private ArrayList group = new ArrayList();


    public gpuGroup(){
        this.groupName = "";


    }
    public gpuGroup(String gn, String gd){
        this.groupName = gn;
        this.groupDescription = gd;
    }

    /**
     * @return Group Name
     */
    public String getGroupName() {
        return groupName;
    }
    
    public String getGroupDesc() {
        return groupDescription;
    }
    
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