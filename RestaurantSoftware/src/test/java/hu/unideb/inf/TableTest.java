package hu.unideb.inf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class TableTest {
    @Test
    public void testSetTableNumber() {
        Table table = new Table(10);
        table.setTableNumber(10);
        assertEquals(10, table.getTableNumber());
    }

    @Test
    public void testSetFoods() {
        Table table = new Table(10);
        table.setFoods(new ArrayList<Food>());
        assertEquals("", table.toString());
    }

    @Test
    public void testToString() {
        Table table = new Table(10);
        table.setFoods(new ArrayList<Food>());
        assertEquals("", table.toString());
    }

    @Test
    public void testToString2() {
        ArrayList<Food> foodList = new ArrayList<Food>();
        foodList.add(new Food(3, "Palacsinta", 299));

        Table table = new Table(10);
        table.setFoods(foodList);
        assertEquals("3 x Palacsinta: 299Ft\n", table.toString());
    }
}

