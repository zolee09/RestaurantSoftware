
package hu.unideb.inf;

import java.util.List;

public class Table {
    private int tableNumber;
    List<Food> foods;

    public Table(int tableNumber, List<Food> foods) {
        this.tableNumber = tableNumber;
        this.foods = foods;
    }

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
    }
    
    public int getTableNumber() {
        return tableNumber;
    }
    
    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < foods.size(); i++) {
            sb.append(foods.get(i).getQuantity()).append(" x ").append(foods.get(i).getName()).append(": ").append(foods.get(i).getPrice()).append("Ft").append("\n");
        }
        return sb.toString();
    }
    
}
