package service;


import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class CodeTestService {

    protected Set<String> regResult = new HashSet<>();
    protected String inputStr = null;
    protected String result = null;
    protected int findNum = 3;

    public void setInputStr(String inputStr) {
        this.inputStr = inputStr;
    }

    public String getResult() {
        return result;
    }


    public Set<String> find(){
        regResult.clear();
        Matcher m = Pattern.compile("(\\w)\\1*").matcher(inputStr);
        regResult = new HashSet<>();
        while (m.find()) {
            String findStr = m.group(0);
            if(findStr.length()>= findNum){
                regResult.add(findStr);
            }
        }
        return regResult;
    }

    public abstract void replace();
}
