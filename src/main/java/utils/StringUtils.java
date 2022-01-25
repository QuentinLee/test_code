package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringUtils {

    public static String getInputString(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
    }

    public static void echo(String string){
        System.out.println("Output:" + string);
    }

    public static boolean isUpperCase(String string){
        if(string.charAt(0)>='A' && string.charAt(0)<='Z'){
            return true;
        }else{
            return false;
        }
    }
}
