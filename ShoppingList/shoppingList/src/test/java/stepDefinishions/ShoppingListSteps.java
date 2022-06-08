package stepDefinishions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;

import java.util.*;

public class ShoppingListSteps {
    List<Map<String, String>> storesWithItemAndQuantity;
    Map<String, Map<String, Integer>> items;


// 1st List element: Map (Store -> Store A; Item -> Sugar; Quantity -> 2)
// 2nd List element: Map (Store -> Store XYZ; Item -> Flour; Quantity -> 1)
    @Given("^I have the following table with the shoppingList$")
    public void inputDataTable(DataTable shoppingList) {
        this.storesWithItemAndQuantity = shoppingList.asMaps(String.class, String.class);
    }

//Map <Store , Map <Sugar , 2>> items = new TreeMap<>()
    @When("I have collected products in Map Collection")
    public void iHaveCollectedProductsInCollection() {
        items = new TreeMap<>();
        for (Map<String, String> map : this.storesWithItemAndQuantity) {
            String store = map.get("Store");
            String item = map.get("Item");
            Integer quantity = Integer.parseInt(map.get("Quantity"));

            items.putIfAbsent(store, new HashMap<>());
            Map<String, Integer> stringIntegerMap = items.get(store);
            stringIntegerMap.put(item, quantity);
        }
    }

    @Then("print the shoppingList")
    public void printTheShoppingList() {
        for (Map.Entry<String, Map<String, Integer>> mapEntry : this.items.entrySet()) {
            System.out.println(String.format("I need to buy from %s:", mapEntry.getKey()));

            for (Map.Entry<String, Integer> entry : mapEntry.getValue().entrySet()) {
                System.out.println(String.format
                        ("-> %d %s ", entry.getValue(), entry.getKey()));
            }
            System.out.println();
        }
    }
}
