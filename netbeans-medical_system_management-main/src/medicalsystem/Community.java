/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsystem;

import java.util.HashMap;

/**
 *
 * @author TT
 */
public class Community {
    
    private int id;
    private String name;
    private HashMap<Integer, House> houseMap;

    public Community(int id) {
        this.id = id;
        houseMap = new HashMap<Integer, House>();
    }
    public Community(int id, String name) {
        this.id = id;
        this.name = name;
        houseMap = new HashMap<Integer, House>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Integer, House> getHouseMap() {
        return houseMap;
    }

    public void setHouseMap(HashMap<Integer, House> houseMap) {
        this.houseMap = houseMap;
    }
    
    @Override
    public String toString(){
//        return Integer.toString(id);
        return name;
    }
    
    
    
}
