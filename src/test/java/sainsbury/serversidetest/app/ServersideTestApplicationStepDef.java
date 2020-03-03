package sainsbury.serversidetest.app;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServersideTestApplicationStepDef {

  @When(value = "^Run the application from the command prompt$")
  public void Run_application_from_command_prompt() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Then("^Display products list$")
  public void Display_products_list() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

}
