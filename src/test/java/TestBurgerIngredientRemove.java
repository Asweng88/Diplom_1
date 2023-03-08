import org.junit.Before;
import org.junit.Test;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestBurgerIngredientRemove {
    private final String nameFilling = "Лук";
    private final float priceFilling = 20;
    private final String nameSauce = "Цезарь";
    private final float priceSauce = 30;
    Ingredient ingredientFilling = new Ingredient(IngredientType.FILLING, nameFilling, priceFilling);
    Ingredient ingredientSauce = new Ingredient(IngredientType.SAUCE, nameSauce, priceSauce);
    Burger burger = new Burger();

    @Before
    public void addIngredient(){

        burger.addIngredient(ingredientFilling);
        burger.addIngredient(ingredientSauce);
    }


    @Test
    public void testRemoveIngredient() {

        burger.removeIngredient(0);
        assertEquals("Количество элементов не соответствует ожидаемому", burger.ingredients.size(), 1);
        assertTrue("Ошибка валидации элемента ingredientSauce", burger.ingredients.contains(ingredientSauce));
    }

}
