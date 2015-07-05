/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilities;

import java.util.Objects;

/**
 *
 * @author catchlrnovo
 */
public class comboboxItem {
    private int id;
    private String name;
    
    public comboboxItem(int id, String name){
        this.id  = id; 
        this.name = name;   
    }
    public comboboxItem(int id){
        this.id  = id;  
    }
    @Override
    public String toString(){
         return this.name;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    /**
     *
     * @param i
     * @return
     */
    @Override
    public boolean equals(Object i) {
        comboboxItem item = (comboboxItem)i;

        return getId() == item.getId();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.name);
        return hash;
    }

}

