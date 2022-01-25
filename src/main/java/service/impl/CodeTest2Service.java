package service.impl;


import Config.Const;
import service.CodeTestService;
import utils.StringUtils;

import java.util.Iterator;

public class CodeTest2Service extends CodeTestService {


    public void replace(){
        Iterator it = regResult.iterator();
        while (it.hasNext()) {
            String replaceStr = it.next().toString();
            String replaceTo = this.getReplaceByStr(replaceStr);
            inputStr = inputStr.replace(replaceStr,replaceTo);
        }
        result = inputStr;
    }

    private String getReplaceByStr(String reStr){
        String firstStr = reStr.substring(0,1);

        boolean isUpperCase = StringUtils.isUpperCase(firstStr);
        if(!isUpperCase){
            firstStr = firstStr.toUpperCase();
        }
        int azIndex = Const.AZ_LIST.indexOf(firstStr);
        if(azIndex == -1) {
            return "";
        }
        int realIndex = 0;
        if(azIndex - 1 < 0){
            realIndex = 25;
        }else{
            realIndex = azIndex - 1;
        }
        if(isUpperCase){
            reStr = Const.AZ_LIST.get(realIndex);
        }else{
            reStr = Const.AZ_LIST.get(realIndex).toLowerCase();
        }
        return reStr;
    }
}
