package filter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputFilter {

    //Just for extended use
    public static String filterInputString(String string){
        String regEx="[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(string);
        return m.replaceAll("").trim();
    }
}
