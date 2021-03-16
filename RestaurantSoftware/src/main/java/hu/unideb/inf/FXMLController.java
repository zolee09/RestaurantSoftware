
package hu.unideb.inf;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;

public class FXMLController implements Initializable {
    
    private int index;
    private int number;
    private int indexOfTable;
    private int indexOfFood;
    private int currentTable;
    private boolean tableEquals = false;
    private boolean foodEquals = false;
    List<Table> table = new ArrayList<>();
    

    @FXML
    private AnchorPane rootPane;
    @FXML
    private Label orderLabel;
    @FXML
    private Label tableOutWrite;
    @FXML
    private ScrollPane scrollText;
    @FXML
    private Button button0;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button num;
    @FXML
    private Button payButton;
    @FXML
    private Button deleteButton;
    @FXML
    private Button orderButton;
    @FXML
    private Button changer;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void handleButton00Action(ActionEvent event) {
        handleButtonFunction("Húsleves", 799);
    }
    
    @FXML
    private void handleButton01Action(ActionEvent event) {
        handleButtonFunction("Bableves", 699);
    }

    @FXML
    private void handleButton02Action(ActionEvent event) {
        handleButtonFunction("Gyümölcsleves", 599);
    }

    @FXML
    private void handleButton03Action(ActionEvent event) {
        handleButtonFunction("Paradicsomleves", 499);
    }

    @FXML
    private void handleButton10Action(ActionEvent event) {
        handleButtonFunction("Marhapörkölt", 999);
    }

    @FXML
    private void handleButton11Action(ActionEvent event) {
        handleButtonFunction("Túróstészta", 599);
    }

    @FXML
    private void handleButton12Action(ActionEvent event) {
        handleButtonFunction("Töltöttkáposzta", 799);
    }

    @FXML
    private void handleButton13Action(ActionEvent event) {
        handleButtonFunction("Rántotthús", 499);
    }

    @FXML
    private void handleButton20Action(ActionEvent event) {
        handleButtonFunction("Palacsinta", 299);
    }

    @FXML
    private void handleButton21Action(ActionEvent event) {
        handleButtonFunction("Mákosguba", 399);
    }

    @FXML
    private void handleButton22Action(ActionEvent event) {
        handleButtonFunction("Aranygaluska", 499);
    }

    @FXML
    private void handleButton23Action(ActionEvent event) {
        handleButtonFunction("Csokitorta", 299);
    }

    @FXML
    private void handleButton30Action(ActionEvent event) {
        handleButtonFunction("Coca-cola", 299);
    }

    @FXML
    private void handleButton31Action(ActionEvent event) {
        handleButtonFunction("Pepsi", 299);
    }

    @FXML
    private void handleButton32Action(ActionEvent event) {
        handleButtonFunction("Ásványvíz", 199);
    }

    @FXML
    private void handleButton33Action(ActionEvent event) {
        handleButtonFunction("Zöldtea", 299);
    }
    
    @FXML
    private void changeButton00(ActionEvent event) {
        
    }
    @FXML
    private void changeButton01(ActionEvent event) {
        
    }
    @FXML
    private void changeButton10(ActionEvent event) {
        
    }
    @FXML
    private void changeButton11(ActionEvent event) {
        
    }
    @FXML
    private void changeButton20(ActionEvent event) {
        
    }
    @FXML
    private void changeButton21(ActionEvent event) {
        
    }
    @FXML
    private void changeButton30(ActionEvent event) {
        
    }
    @FXML
    private void changeButton31(ActionEvent event) {
        
    }

    @FXML
    private void handleButtonNumber7Action(ActionEvent event) {
        number = 7;
        System.out.println(number);
    }

    @FXML
    public void handleButtonNumber4Action(ActionEvent event) {
        number = 4;
        System.out.println(number);
    }

    @FXML
    private void handleButtonNumber1Action(ActionEvent event) {
        number = 1;
        System.out.println(number);
    }

    @FXML
    private void handleButtonNumber8Action(ActionEvent event) {
        number = 8;
        System.out.println(number);
    }

    @FXML
    private void handleButtonNumber5Action(ActionEvent event) {
        number = 5;
        System.out.println(number);
    }

    @FXML
    private void handleButtonNumber2Action(ActionEvent event) {
        number = 2;
        System.out.println(number);
    }
    
    @FXML
    private void handleButtonNumber9Action(ActionEvent event) {
        number = 9;
        System.out.println(number);
    }

    @FXML
    private void handleButtonNumber6Action(ActionEvent event) {
        number = 6;
        System.out.println(number);
    }

    @FXML
    private void handleButtonNumber3Action(ActionEvent event) {
        number = 3;
        System.out.println(number);
    }

    @FXML
    private void handleButtonNumber0Action(ActionEvent event) {
        number = 0;
        System.out.println(number);
    }

    @FXML
    private void handleButtonPayAction(ActionEvent event) {
        if (table.get(index) != null) {
            
            //végösszeget kiszámolni
            int sum = 0;
            for (Food food : table.get(index).foods) {
                sum += food.getQuantity()*food.getPrice();
            }
            
            //fájlba kiírni
            
            try (PrintStream ps = new PrintStream("elszamolas.txt")){
                String csg = "A(z) " + currentTable + ". számú asztal számlája\n";
                ps.append(csg);
                for (Food food : table.get(index).foods) {
                    csg = food.toString() + "\n";
                    ps.append(csg);
                }
                csg = "\nVégösszeg: " + sum + "\n";
                ps.append(csg);
            } catch (FileNotFoundException ex) {
                System.err.println("Hiba az állomány megnyitásakor: " + ex.getMessage());
                System.exit(1);
            }
            
            //alarm ablakba kiírni a tételeket
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Fizetés");
            alert.setHeaderText("A(z) " + currentTable + ". számú asztal\n\nA fizetendő összeg: " + sum + " forint!");
            alert.setContentText("Köszönjük, hogy nálunk vásárolt!\n\nJó étvágyat kívánunk!");
            alert.showAndWait();

            table.remove(index);
            orderLabel.setText("");
            currentTable = 0;
        }
    }
    
    @FXML
    private void handleButtonDeleteAction(ActionEvent event) {
        if (table.get(index).foods.size() > 0) {
            if (number == 0){
                table.get(index).foods.remove(table.get(index).foods.size()-1);
            } else {
                number = 0;
            }
            orderLabel.setText(table.get(index).toString());
        }
    }
    
    @FXML
    private void handleButtonOrderAction(ActionEvent event) {
        orderLabel.setText("");
        tableOutWrite.setText("" + number);
        currentTable = number;
        
        //ha nem volt egy asztal sem létrehozunk egy 0-s asztalt
        if (table.size() == 0) {
            //food.add(new Food());
            Table tb = new Table(0);
            table.add(tb);
        }
        else {
            index = table.size();
            //körbejárjuk az asztalokat
            for (Table tb : table) {
                //ha találunk egyező asztalt
                if (tb.getTableNumber() == currentTable) {
                    index = table.indexOf(tb);
                    orderLabel.setText(table.get(index).toString());
                }
            }
        }
        number = 0;
    }
    
    @FXML
    private void changerButton (ActionEvent event) {
        
    }
    
    public void handleButtonFunction(String foodName, int foodPrice) {
        
        int sum = 0;
        Food foodTemp = null;
        Table tableTemp = null;
        List<Food> food = new ArrayList<>();
        List<Food> tempFood = new ArrayList<>();
        
        //ha nem választunk mennyiséget akkor automatikusan 1
        if (number == 0) number = 1;
        food.add(new Food(number, foodName, foodPrice));
        System.out.println(food.toString());
        
        //ha nem volt egy asztal sem létrehozunk egyet
        if (table.size() == 0) {
            table.add(new Table(currentTable, food));
        } else {
            indexOfTable = table.size();
            for (Table tb : table) {
                //ha találunk egyező asztalt
                if (tb.getTableNumber() == currentTable) {
                    tableEquals = true;
                    indexOfTable = table.indexOf(tb);
                    tempFood = tb.getFoods();
                }
            }
            //ha már találtunk egyező asztalt (Asztal gombban kiértékelve)
            if (tableEquals) {
                //körbejárjuk az adott asztal ételeit
                for (Food foo : tempFood) {
                    //megvizsgáljuk hogy volt e már rendelve a kért étel erre az asztalra
                    if (foo.getName().equals(foodName)) {
                        foodEquals = true;
                        indexOfFood = tempFood.indexOf(foo);
                        //másolatot készítünk az egyezett ételről
                        foodTemp = foo;
                    }
                }
                //ha volt már a listában a kért étel
                if (foodEquals) {
                    //összegezzük a most kiválasztott mennyiségett az eddigi mennyiséggel
                    sum = number + table.get(indexOfTable).getFoods().get(indexOfFood).getQuantity();
                    //lemásoljuk a kiválaszott ételt )előtte megtettük
                    //foodTemp = table.get(indexOfTable).getFoods().get(indexOfFood);
                    //eltávolítjuk a kiválasztott ételt egy ezelőtt használt étellista másolatból
                    tempFood.remove(foodTemp);
                    //hozzáadjuk az ételt, az új darabértékkel ehhez a másolt listához
                    tempFood.add(new Food(sum, foodName, foodPrice));
                    //készítünk egy asztal lista másolatot az adott asztalról
                    tableTemp = table.get(indexOfTable);
                    //eltávolítjuk ideiglenesen az adott asztalt
                    table.remove(tableTemp);
                    //készítünk egy új asztalt a meglévő asztalszámmal és az új étellistával
                    tableTemp = new Table(currentTable, tempFood);
                    //hozzáadjuk az asztallistához az "újraformázott" asztalt
                    table.add(tableTemp);
                } else {
                    //ha nem volt étel egyezés
                    //hozzáadjuk az ételt, az új darabértékkel ehhez a másolt listához
                    tempFood.add(new Food(number, foodName, foodPrice));
                    //készítünk egy asztal lista másolatot az adott asztalról
                    tableTemp = table.get(indexOfTable);
                    //eltávolítjuk ideiglenesen az adott asztalt
                    table.remove(tableTemp);
                    //készítünk egy új asztalt a meglévő asztalszámmal és az új étellistával
                    tableTemp = new Table(currentTable, tempFood);
                    //hozzáadjuk az asztallistához az "újraformázott" asztalt
                    table.add(tableTemp);
                }
            } else {
                //ha nem volt asztal egyezés létrehozunk egy új asztalt a megadott étellel
                table.add(new Table(currentTable, food));
            }
        }
        
        //Megjelenítés
        orderLabel.setText(table.get(indexOfTable).toString());
        System.out.println(table.get(indexOfTable).toString());
        
        //mindent lenullázunk
        number = 0;
        indexOfTable = 0;
        indexOfFood = 0;
        indexOfTable = 0;
        tableEquals = false;
        foodEquals = false;
        //tableTemp = null;
        //tempFood = null;
    }
    
    
}