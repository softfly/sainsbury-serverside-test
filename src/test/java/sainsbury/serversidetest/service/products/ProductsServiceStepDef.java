package sainsbury.serversidetest.service.products;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductsServiceStepDef {

  @When(value = "^Call getProducts$")
  public void Call_getProducts() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Given(value = "^Valid HTML pages$")
  public void Valid_HTML_pages() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Given(value = "^Error connecting to the site$")
  public void Error_connecting_to_the_site() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Given(value = "^Not 200 HTTP code$")
  public void Not_200_HTTP_code() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Given(value = "^Not valid products HTML scheme$")
  public void Not_valid_products_HTML_scheme() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Given(value = "^Not valid product HTML scheme$")
  public void Not_valid_product_HTML_scheme() throws IOException {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Then("^Return products list$")
  public void Return_products_list() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

  @Then("^Return (.*) '(.*)'$")
  public void Return_ERROR0003_product(String error, String message) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }
}
