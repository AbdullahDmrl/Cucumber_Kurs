package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class _06_educationCatSteps {
    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();

       @And("^Navigate to education category page$")
       public void navigateToEducationCategoryPage() {
        ln.findAndClick("Education");
        ln.findAndClick("EducationSetUp");
        ln.findAndClick("EducationSetUpCat");

       }


    @When("^User education categories name as \"([^\"]*)\" code name as \"([^\"]*)\"$")
    public void userEducationCategoriesNameAsCodeNameAs(String name, String code) {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput",name);
        dc.findAndSend("codeInput",code);
        dc.findAndClick("saveButton");

    }
}
