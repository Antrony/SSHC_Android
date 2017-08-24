package com.ansel.arcians.sshc_android.bal;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ZoneObject {
    @SerializedName("results")
    public List<Datum> zones = new ArrayList<>();

    public class Datum {
        @SerializedName("name")
        private String zoneName;
        public String getName() {
            return zoneName;
        }
        public void setName(String zoneName) {
            this.zoneName = zoneName;
        }
    }

    public List getZone() {
        return zones;
    }
    public void setZone(List<Datum> zones) {
        this.zones = zones;
    }
}