package StepDefinitions;

import Pages.FormContent;
import Pages.Parent;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _09_humanResourceSteps {
    FormContent fc=new FormContent();

    @When("^User sending the keys in form content$")
    public void userSendingTheKeysInFormContent(List<List<String>> lisDdatas) {

        for (List<String> lisDdata : lisDdatas) {
            fc.findAndSend(lisDdata.get(0), lisDdata.get(1));
        }
    }



    @When("^Delete the element in the form content$")
    public void deleteTheElementInTheFormContent(List<List<String>> lisDdatas) {
        for (List<String> lisDdata : lisDdatas) {
            fc.findAndSend(lisDdata.get(0), lisDdata.get(1));
        }
        fc.findAndClick("searchBtn");
        fc.waitnumberOfElementsToBeLessThan(By.xpath("//ms-delete-button//button"),8);
        fc.findAndClick("deleteBtn");
        fc.findAndClick("confirmdeleteBtn");
    }
}
