import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;
import static praktikum.IngredientType.SAUCE;


@RunWith(MockitoJUnitRunner.class)
public class TestBurgerGetPrice {
    Burger burger = new Burger();

    @Mock
    Bun bun;
    Ingredient ingredient = Mockito.spy(new Ingredient(SAUCE, "Цезарь", 30F));

    @Before
    public void addIngredient() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
    }

    @Test
    public void testGetPrice() {
        when(bun.getPrice()).thenReturn(10F);
        doReturn(30F).when(ingredient).getPrice();
        assertEquals("Ошибка валидации", burger.getPrice(), 50, 0);
    }
}