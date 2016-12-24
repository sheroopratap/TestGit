package com.paynow.bankprocess;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Pratap on 12/24/2016.
 */
public class BankProcess {


    Map<String,List<String>> map = new HashMap<>();

    public String startProcess()
    {
        return null;
    }

    public List<String> getList(String key)
    {
        List<String> retList = map.get(key);

        if(retList == null)
            retList = new ArrayList<>();

        
        return retList;

    }
    public void test()
    {
        List<String> list = getList("axy");

    }
}
