package org.launchcode.techjobs_oo;

import java.util.Objects;

public class PositionType extends JobField {
    //first constructor
    public PositionType() {
        super();
    }

    //second constructor
    public PositionType(String value) {
        super(value);
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    // Getters and Setters:

//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
//    public String toString() {
//        return value;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionType positionType = (PositionType) o;
        return getId() == positionType.getId() ;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, value);
//    }
}
