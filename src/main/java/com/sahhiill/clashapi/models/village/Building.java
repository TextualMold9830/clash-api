package com.sahhiill.clashapi.models.village;

import com.google.gson.annotations.SerializedName;

public class Building {
    int data;
    int lvl;
    @SerializedName("gear_up") int gearUp;
    @SerializedName("cnt") int count;
    int timer;

    @Override
    public String toString() {
        return "Building{" +
                "data=" + data +
                ", lvl=" + lvl +
                ", gearUp=" + gearUp +
                ", count=" + count +
                ", timer=" + timer +
                '}';
    }
}
