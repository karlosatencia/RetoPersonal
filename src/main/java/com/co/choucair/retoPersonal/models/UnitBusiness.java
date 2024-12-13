package com.co.choucair.retoPersonal.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UnitBusiness {
    public String unitname;

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public static List<UnitBusiness> setData(DataTable table) {
        List<UnitBusiness> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> map : mapList) {
            data.add(new ObjectMapper().convertValue(map, UnitBusiness.class));
        }
        return data;
    }
}
