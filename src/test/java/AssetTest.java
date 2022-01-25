import filter.InputFilter;
import org.jetbrains.annotations.TestOnly;
import org.junit.Test;
import service.CodeTestService;
import service.impl.CodeTest1Service;
import utils.StringUtils;

public class AssetTest {

    @Test
    public void TestCodeTest1(){
        String inputString = StringUtils.getInputString();

        inputString = InputFilter.filterInputString(inputString);

        CodeTestService codeTest1Service = new CodeTest1Service();
        codeTest1Service.setInputStr(inputString);

        System.out.println("Output:");
        while (codeTest1Service.find().size()>0){
            codeTest1Service.replace();
            StringUtils.echo(codeTest1Service.getResult());
        }
    }


    @Test
    public void TestCodeTest2(){
        String inputString = StringUtils.getInputString();
        
        inputString = InputFilter.filterInputString(inputString);

        CodeTestService codeTest1Service = new CodeTest1Service();
        codeTest1Service.setInputStr(inputString);

        System.out.println("Output:");
        while (codeTest1Service.find().size()>0){
            codeTest1Service.replace();
            StringUtils.echo(codeTest1Service.getResult());
        }
    }
}
