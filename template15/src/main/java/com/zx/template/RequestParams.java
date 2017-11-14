package com.zx.template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 2017/11/14.
 */

public class RequestParams {

    private final List<Map> params = new ArrayList<>();


    public void addFormData(String key, String value) {
        Map param = new HashMap<>();
        param.put(key, value);
        params.add(param);
    }
}
