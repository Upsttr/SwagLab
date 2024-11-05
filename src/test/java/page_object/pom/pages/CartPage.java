package page_object.pom.pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class CartPage {

    private final ElementsCollection cartItems = $$x("//div[@class='cart_item']");

    private final SelenideElement checkoutButton = $x("//button[@id='checkout']");

    public void shouldHaveItemsInCart(int expectedCount) {
        cartItems.shouldHave(CollectionCondition.size(expectedCount));
    }

    public void proceedToCheckout() {
        checkoutButton.click();
    }
}


