import filter.InputFilter;
import service.CodeTestService;
import service.impl.CodeTest1Service;
import service.impl.CodeTest2Service;
import utils.StringUtils;


public class Main {

    private CodeTestService codeTest1Service;

    public static void main(String[] args) {
	    // write your code here
        String inputString = StringUtils.getInputString();

//        inputString = "aaaAAAkkkKKK";
        inputString = InputFilter.filterInputString(inputString);
//        System.out.println("inputString:"+inputString);

        CodeTestService codeTest1Service = new CodeTest1Service();
        codeTest1Service.setInputStr(inputString);
        while (codeTest1Service.find().size()>0){
            codeTest1Service.replace();
            StringUtils.echo(codeTest1Service.getResult());
        }

        CodeTestService codeTest2Service = new CodeTest2Service();
        codeTest2Service.setInputStr(inputString);
        while (codeTest2Service.find().size()>0){
            codeTest2Service.replace();
            StringUtils.echo(codeTest2Service.getResult());
        }
    }
}
