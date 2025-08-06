package com.sahhiill.clashapi.models.player;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.sahhiill.clashapi.models.village.Building;
import com.sahhiill.clashapi.models.village.Unit;

import java.util.List;

public class ExportedData {
    private static Gson gson = new GsonBuilder().create();
    public String tag;
    public int timestamp;
    public List<Building> buildings;
    @SerializedName("buildings2")
    public List<Building> builderBaseBuildings;
    public List<Building> traps;
    public List<Unit> units;
    @SerializedName("builderBaseUnits")
    public List<Unit> builderBaseUnits;

    public static ExportedData fromJson(String json){
        return gson.fromJson(json, ExportedData.class);
    }

    @Override
    public String toString() {
        return "ExportedData{" +
                "tag='" + tag + '\'' +
                ", timestamp=" + timestamp +
                ", buildings=" + buildings +
                ", builderBaseBuildings=" + builderBaseBuildings +
                ", traps=" + traps +
                ", units=" + units +
                ", builderBaseUnits=" + builderBaseUnits +
                '}';
    }
}
