package service.impl;


import service.CodeTestService;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeTest1Service extends CodeTestService {


    public void replace(){
        Iterator it = regResult.iterator();
        while (it.hasNext()) {
            String replaceStr = it.next().toString();
            inputStr = inputStr.replace(replaceStr,"");
        }
        result = inputStr;
    }
}
