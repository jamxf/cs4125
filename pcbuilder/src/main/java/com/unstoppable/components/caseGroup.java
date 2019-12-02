/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unstoppable.components;

import java.util.Iterator;
import java.util.ArrayList;
/**
 *
 * @author Iansi
 */
public class caseGroup extends Part{
    
    private String groupName;
    private String groupDescription;
    private ArrayList group = new ArrayList();


    public caseGroup(){
        this.groupName = "";


    }
    public caseGroup(String gn, String gd){
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
    
    public void addGpu(Part newPart) {
        group.add(newPart);
    }

    public void removeGpur(Part newPart){
        group.remove(newPart);
    }

    public Part getComponent(int partIndex){
        return (Part)group.get(partIndex);
    }

}
