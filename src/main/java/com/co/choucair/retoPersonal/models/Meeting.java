package com.co.choucair.retoPersonal.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Meeting {
    public String  meetingname;
    public String meetingnumber;

    public String getMeetingname() {
        return meetingname;
    }

    public void setMeetingname(String meetingname) {
        this.meetingname = meetingname;
    }

    public String getMeetingnumber() {
        return meetingnumber;
    }

    public void setMeetingnumber(String meetingnumber) {
        this.meetingnumber = meetingnumber;
    }
    public static List<Meeting> setData(DataTable table) {
        List<Meeting> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> map : mapList) {
            data.add(new ObjectMapper().convertValue(map, Meeting.class));
        }
        return data;
    }
}
