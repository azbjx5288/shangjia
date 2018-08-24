package com.goldenmango.lottery.app;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gan on 2018/8/24.
 */

public class JsonTools {
    public static List<String> parseList(String jsonString){
        List<String> list = new ArrayList<>();
        try {
            JSONObject jsonObject = new JSONObject(jsonString);
            JSONArray jsonArray = jsonObject.getJSONArray("citys");
            for(int i = 0;i<jsonArray.length();i++){
                list.add(jsonArray.getString(i));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return list;
    }
}
