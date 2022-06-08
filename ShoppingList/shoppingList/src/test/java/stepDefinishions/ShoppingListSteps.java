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


// 1st List item: Map (Store -> Store A; Item -> Sugar; Quantity -> 2)
// 2nd List item: Map (Store -> Store B; Item -> Bread; Quantity -> 5)
    @Given("^I have the following table with the shoppingList$")
    public void inputDataTable(DataTable shoppingList) {
        storesWithItemAndQuantity = shoppingList.asMaps(String.class, String.class);
    }

//Map <Store A, Map <Sugar , 2>> items = new TreeMap<>() -> which is sorted based on the natural ordering of the keys
    @When("I have collected products in Map Collection")
    public void iHaveCollectedProductsInCollection() {
        items = new TreeMap<>();
        for (Map<String, String> map : storesWithItemAndQuantity) {
            String store = map.get("Store");
            String item = map.get("Item");
            Integer quantity = Integer.parseInt(map.get("Quantity"));

            items.putIfAbsent(store, new HashMap<>());
            Map<String, Integer> stringIntegerMap = items.get(store);
            stringIntegerMap.put(item, quantity);
        }
    }

    //print all the items and qty needed, grouped by the store name in natural order
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
