package StepDefinitions;

import Pages.FormContent;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.util.List;

public class _08_EntranceExamsSteps {
    FormContent fc=new FormContent();

    @And("^Click on the elements in the form content$")
    public void clickOnTheElementsInTheFormContent(DataTable elements) {
        List<String> listElements=elements.asList(String.class);
        for (String element : listElements){
            fc.findAndClick(element);
        }

    }

    @When("^Delete the exam name as \"([^\"]*)\"$")
    public void deleteTheExamNameAs(String name)  {
       fc.findAndDelete(name);
    }
}
