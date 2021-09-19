package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Utilities.ExcelUtility;
import cucumber.api.java.en.When;

import java.util.List;

public class _10_CitizenshipApachePOISteps {
    DialogContent dc = new DialogContent();

    @When("^User Create a citizenship with ApachePOI$")
    public void userCreateACitizenshipWithApachePOI() {
        List<List<String>> Liste= ExcelUtility.getlistData("src/test/java/ApachePOI/resources/ApacheExcel2.xlsx",
                "testCitizen",2);

        for (int i = 0; i < Liste.size(); i++) {
            dc.findAndClick("addButton");
            dc.findAndSend("nameInput", Liste.get(i).get(0));
            dc.findAndSend("shortName", Liste.get(i).get(1));
            dc.findAndClick("saveButton");
            dc.findAndContainsText("successMessage","success");
            dc.invisibilityOfElement("successMessage");
        }

    }

    @When("^User Delete a citizenship with ApachePOI$")
    public void userDeleteACitizenshipWithApachePOI() {
        List<List<String>> Liste= ExcelUtility.getlistData("src/test/java/ApachePOI/resources/ApacheExcel2.xlsx",
                "testCitizen",2);

        for (int i = 0; i < Liste.size(); i++) {
            dc.findAndDelete(Liste.get(i).get(0));
            dc.findAndContainsText("successMessage","success");
            dc.invisibilityOfElement("successMessage");
        }





    }
}
