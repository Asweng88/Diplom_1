import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doReturn;
import static praktikum.IngredientType.SAUCE;

@RunWith(MockitoJUnitRunner.class)
public class TestBurgerGetReceipt {
    Burger burger = new Burger();
    private final String result = "(==== Булка ====)\r\n= sauce Цезарь =\r\n(==== Булка ====)\r\n\r\nPrice: 30,000000\r\n";

    @Mock
    Bun bun;
    Ingredient ingredient = Mockito.spy(new Ingredient(SAUCE, "Цезарь", 30F));

    @Before
    public void addIngredient() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
    }

    @Test
    public void testGetReceipt() {
        Mockito.when(bun.getName()).thenReturn("Булка");
        Mockito.when(ingredient.getPrice()).thenReturn(30F);
        Mockito.when(ingredient.getName()).thenReturn("Цезарь");
        Mockito.when(ingredient.getType()).thenReturn(SAUCE);
        assertTrue("Ошибка валидации", burger.getReceipt().contains(result));
    }
}
