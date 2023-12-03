package com.jpabook.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
public class Address {
    private String city;
    private String street;
    private String zipcode;

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if(!city.equals(address.getCity())) return false;
        if(!street.equals(address.getStreet())) return false;
        if(!zipcode.equals(address.getZipcode())) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + city.hashCode();
        result = 31 * result + street.hashCode();
        result = 31 * result + zipcode.hashCode();
        return result;
    }
}
