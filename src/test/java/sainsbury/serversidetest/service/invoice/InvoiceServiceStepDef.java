package sainsbury.serversidetest.service.invoice;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InvoiceServiceStepDef {

  @Given(value = "Gross value {double}")
  public void Gross_value(Double gross) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @When(value = "^Call calculateVat$")
  public void Call_calculateVat() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Then("Return VAT value {double}")
  public void Return_VAT_value(Double vat) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

}
