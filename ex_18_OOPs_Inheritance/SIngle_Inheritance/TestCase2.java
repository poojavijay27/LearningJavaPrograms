package ex_18_OOPs_Inheritance.SIngle_Inheritance;

public class TestCase2 extends CommonToAll {

    void runningTC2()
    {
        startBrowser();
        System.out.println("Running TC2");
        readExcelFile();
        readDataBaseFile();
        closeBrowser();
    }
}
