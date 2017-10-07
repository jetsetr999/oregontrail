/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpackagejpp;

import java.io.Serializable;

import java.util.Objects;

/**
 *
 * @author parhe
 */
public class HotelScene extends RegularScene implements Serializable 
{


    private String availableCharacters;

    public String getAvailableCharacters() {
        return availableCharacters;
    }

    public void setAvailableCharacters(String availableCharacters) {
        this.availableCharacters = availableCharacters;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.availableCharacters);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HotelScene other = (HotelScene) obj;
        if (!Objects.equals(this.availableCharacters, other.availableCharacters)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HotelScene{" + "availableCharacters=" + availableCharacters + '}';
    }
    
    
    
}
