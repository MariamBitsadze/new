import StepObject.LogInSteps;
import Utils.BrowserActions;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DataObject.LogInData.*;

public class LogIn extends BrowserActions {
    @Test
    public void logInWithCorrectData() throws InterruptedException {
        LogInSteps step1 = new LogInSteps(driver);
        step1.emailFieldAction(correctEmailData);
        step1.passwordFieldAction(correctPasswordData);
        Thread.sleep(5000);
        step1.logInButtonAction();

        String
                expectedResult = "ოთახის ნომერი: ST4885",
                actualResult = driver.findElement(By.tagName("h5")).getText();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult, expectedResult);

        softAssert.assertAll();



    }
    @Test
    public void logInWithIncorrectData(){
        LogInSteps step2 = new LogInSteps(driver);
        step2.emailFieldAction(incorrectEmailData);
        step2.passwordFieldAction(incorrectPasswordData);
        step2.logInButtonAction();
    }
}