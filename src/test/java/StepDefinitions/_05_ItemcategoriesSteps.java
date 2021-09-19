package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class _05_ItemcategoriesSteps {

  DialogContent dc=new DialogContent();
  LeftNav ln=new LeftNav();

    @And("^Navigate to item category page$")
    public void navigateToItemCategoriPage() {
        ln.findAndClick("inventoryBtn");
        ln.findAndClick("setupBtn");
        ln.findAndClick("itemcategoryBtn");
    }

    @When("^User item categories name as \"([^\"]*)\" user type name as \"([^\"]*)\"$")
    public void userAItemCategoriesNameAsUserTypeNameAs(String name, String userType)  {
        dc.findAndClick("addButton");
        dc.findAndSend("nameInput", name);
        dc.findAndClick("userInput");
        dc.listWebelementsSelect("userOptions",userType);
        dc.findAndClick("saveButton");
    }



}
