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
public class City {
    
    private int cityId;
    private String cityName;
    
    private HashMap<Integer, Community> communityMap;

    public City() {
        communityMap = new HashMap<Integer, Community>();
    }

    public HashMap<Integer, Community> getCommunityMap() {
        return communityMap;
    }

    public void setCommunityMap(HashMap<Integer, Community> communityMap) {
        this.communityMap = communityMap;
    }
    
    public void addCommunity(Community community) {
        communityMap.put(community.getId(), community);
    }
    public void deleteCommunity(Community community) {
        communityMap.remove(community.getId());
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    
}
