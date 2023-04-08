package StepDefinitions;

import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After// her senaryodan sonra çalışıcak
    public void after(Scenario senaryo){
        System.out.println("The Senario finis");

        ExcelUtility.writeExcel("src/test/java/ApachePOI/resource/ScenarioStatus.xlsx",senaryo,GWD.threadBrowserGet());

        if (senaryo.isFailed()){
            // EXTEnd REpot da çalıştırıyorr
          // TakesScreenshot ts= (TakesScreenshot)GWD.getDriver();
          //final byte[] hafizadakihali=ts.getScreenshotAs(OutputType.BYTES);
          // senaryo.attach(hafizadakihali,"image/png","screenshot name");
        }

        GWD.quitDriver();
    }
}
