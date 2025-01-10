package com.co.choucair.retoPersonal.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MeetingLombookData {

    protected String unitName;
    protected String meetingName;
    protected String meetingNumber;

    public static List<MeetingLombookData> setData(DataTable table){
        List<MeetingLombookData> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> map : mapList) {
            data.add(new ObjectMapper().convertValue(map, MeetingLombookData.class));
        }
           return data;
    }

    public String getUnitName() {
        return unitName;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public String getMeetingNumber() {
        return meetingNumber;
    }
}
