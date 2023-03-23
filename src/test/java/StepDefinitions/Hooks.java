package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;

public class Hooks {
    @After// her senaryodan sonra çalışıcak
    public void after(){
        System.out.println("The Senario finis");
        GWD.quitDriver();
    }
}
