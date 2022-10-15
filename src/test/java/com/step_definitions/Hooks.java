package com.step_definitions;


import com.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
In the class we will be able to pass pre-post conditions to each scenario and each step
 */
public class Hooks {

    //@Before(order = 0)
    //public void setUpScenario(){
    //    System.out.println("=====Setting up browser using cucumber @Before");
    //}

   // @Before(value = "@login", order = 1)
    //public void setUpLoginFun(){
      //  System.out.println("====This will only apply to scenarios with @login tag");
    //}

    //@Before(value = "@db", order = -1)
    //public void setUpForDataBase(){
        //System.out.println("====This will only apply to scenarios with @db tag");
   // }

    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();
        System.out.println("====Closing browser using cucumber @After");
        System.out.println("=====Scenario ended/Take screenshot if it is failed");
    }

    //@BeforeStep
    public void setUpStep(){
        System.out.println("=====applying setup using @BeforeStep");
    }

   // @AfterStep
    public void afterStep(){
        System.out.println("=========appling teardown using @AfterStep");
    }
}
