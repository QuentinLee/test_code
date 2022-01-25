import filter.InputFilter;
import org.jetbrains.annotations.TestOnly;
import org.junit.Test;
import service.CodeTestService;
import service.impl.CodeTest1Service;
import service.impl.CodeTest2Service;
import utils.StringUtils;

import static org.junit.Assert.assertEquals;

public class CodeTest {

    @Test
    public void TestCodeTest1(){
        String inputString = "aabbbbaabb";

        inputString = InputFilter.filterInputString(inputString);

        CodeTestService codeTest1Service = new CodeTest1Service();
        codeTest1Service.setInputStr(inputString);

        codeTest1Service.find();
        codeTest1Service.replace();

        assertEquals("aaaabb", codeTest1Service.getResult());

        codeTest1Service.find();
        codeTest1Service.replace();

        assertEquals("bb", codeTest1Service.getResult());

    }


    @Test
    public void TestCodeTest2(){
        String inputString = "aaaAAAkkkKKK";

        inputString = InputFilter.filterInputString(inputString);

        CodeTestService codeTest2Service = new CodeTest2Service();
        codeTest2Service.setInputStr(inputString);

        codeTest2Service.find();
        codeTest2Service.replace();

        assertEquals("zZjJ", codeTest2Service.getResult());
    }
}
