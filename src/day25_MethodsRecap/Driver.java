package day25_MethodsRecap;

/*
Accesess- modifier Specifier returntype
 */


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Driver {


    public static void main(String[] args) {

        String str = getDriver1("fiREFOX");
        String str2 = getDriver2("CHROME");
        String str3 = getDriver3("edge");

        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str3);

    }


    public static String getDriver1(String browserName) {

        String result = "";

        switch (browserName.toLowerCase()) {

            case "chrome":
                result = "Chrome Driver";
                break;

            case "firefox":
                result = "Firefox Driver";
                break;

            case "safari":
                result = "Safari Driver";
                break;

            case "opera":
                result = "Opera Driver";
                break;

            case "edge":
                result = "Edge Driver";
                break;

            default:
                result = "Invalid Driver";

        }

        return result;
    }

    public static String getDriver2(String browserName) {
        browserName = browserName.toLowerCase();
        String result = "";

        if (browserName.equals("chrome")) {
            result = "Chrome Driver";
        } else if (browserName.equals("firefox")) {
            result = "Firefox Driver";
        } else if (browserName.equals("safari")) {
            result = "Safari Driver";
        } else if (browserName.equals("edge")) {
            result = "Edge Driver";
        } else if (browserName.equals("opera")) {
            result = "Opera Driver";
        } else {
            result = "Invalid Driver";
        }
        return result;


    }


    public static String getDriver3(String browserName){
        browserName = browserName.toLowerCase();

        String result =  (browserName.equals("chrome"))?"Chrome Driver"
                        :(browserName.equals("firefox"))?"Firefox Driver"
                        :(browserName.equals("safari"))?"Safari Driver"
                        :(browserName.equals("edge"))?"Edge Driver"
                        :(browserName.equals("Opera"))?"Opera Driver":"Invalid Driver";

        return result;


    }

}
