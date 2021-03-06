
package hu.unideb.inf;

import com.sun.source.doctree.SinceTree;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class FXMLController implements Initializable {
    
    private int index;
    private int number;
    private int indexOfTable;
    private int indexOfFood;
    private int currentTable;
    private boolean changeButtonPushed = false;
    private boolean changeButtonDeletePushed = false;
    private boolean tableEquals = false;
    private boolean foodEquals = false;
    List<Table> table = new ArrayList<>();
    List<Food> changedFood = new ArrayList<>();
    
    

    @FXML
    private AnchorPane rootPane;
    @FXML
    private Label orderLabel;
    @FXML
    private Label tableOutWrite;
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
    @FXML
    private Label numberOutWrite;
    @FXML
    private TextField nameInput;
    @FXML
    private TextField priceInput;
    @FXML
    private Button changeButton00;
    @FXML
    private Button changeButton10;
    @FXML
    private Button changeButton20;
    @FXML
    private Button changeButton30;
    @FXML
    private Button changeButton01;
    @FXML
    private Button changeButton11;
    @FXML
    private Button changeButton21;
    @FXML
    private Button changeButton31;
    @FXML
    private Button changeButtonDelete;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void handleButton00Action(ActionEvent event) {
        handleButtonFunction("H??sleves", 799);
    }
    
    @FXML
    private void handleButton01Action(ActionEvent event) {
        handleButtonFunction("Bableves", 699);
    }

    @FXML
    private void handleButton02Action(ActionEvent event) {
        handleButtonFunction("Gy??m??lcsleves", 599);
    }

    @FXML
    private void handleButton03Action(ActionEvent event) {
        handleButtonFunction("Paradicsomleves", 499);
    }

    @FXML
    private void handleButton10Action(ActionEvent event) {
        handleButtonFunction("Marhap??rk??lt", 999);
    }

    @FXML
    private void handleButton11Action(ActionEvent event) {
        handleButtonFunction("T??r??st??szta", 599);
    }

    @FXML
    private void handleButton12Action(ActionEvent event) {
        handleButtonFunction("T??lt??ttk??poszta", 799);
    }

    @FXML
    private void handleButton13Action(ActionEvent event) {
        handleButtonFunction("R??ntotth??s", 499);
    }

    @FXML
    private void handleButton20Action(ActionEvent event) {
        handleButtonFunction("Palacsinta", 299);
    }

    @FXML
    private void handleButton21Action(ActionEvent event) {
        handleButtonFunction("M??kosguba", 399);
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
        handleButtonFunction("??sv??nyv??z", 199);
    }

    @FXML
    private void handleButton33Action(ActionEvent event) {
        handleButtonFunction("Z??ldtea", 299);
    }
    
    @FXML
    private void changeButton00(ActionEvent event) {
        int changeButtonNumber = 0;
        if (changeButtonDeletePushed) {
            changeButton00.setText("");
            changedFood.get(changeButtonNumber).setQuantity(0);
            changeButtonDeletePushed = false;
        }
        else {
            changeButtonFunction(changeButtonNumber);
            if (changedFood.get(changeButtonNumber).getQuantity() != 0) {
                changeButton00.setText(changedFood.get(changeButtonNumber).getName());
            }
        }
    }
    @FXML
    private void changeButton01(ActionEvent event) {
        int changeButtonNumber = 1;
        if (changeButtonDeletePushed) {
            changeButton01.setText("");
            changedFood.get(changeButtonNumber).setQuantity(0);
            changeButtonDeletePushed = false;
        }
        else {
            changeButtonFunction(changeButtonNumber);
            if (changedFood.get(changeButtonNumber).getQuantity() != 0) {
                changeButton01.setText(changedFood.get(changeButtonNumber).getName());
            }
        }
    }
    @FXML
    private void changeButton10(ActionEvent event) {
        int changeButtonNumber = 2;
        if (changeButtonDeletePushed) {
            changeButton10.setText("");
            changedFood.get(changeButtonNumber).setQuantity(0);
            changeButtonDeletePushed = false;
        }
        else {
            changeButtonFunction(changeButtonNumber);
            if (changedFood.get(changeButtonNumber).getQuantity() != 0) {
                changeButton10.setText(changedFood.get(changeButtonNumber).getName());
            }
        }
    }
    @FXML
    private void changeButton11(ActionEvent event) {
        int changeButtonNumber = 3;
        if (changeButtonDeletePushed) {
            changeButton11.setText("");
            changedFood.get(changeButtonNumber).setQuantity(0);
            changeButtonDeletePushed = false;
        }
        else {
            changeButtonFunction(changeButtonNumber);
            if (changedFood.get(changeButtonNumber).getQuantity() != 0) {
                changeButton11.setText(changedFood.get(changeButtonNumber).getName());
            }
        }
    }
    @FXML
    private void changeButton20(ActionEvent event) {
        int changeButtonNumber = 4;
        if (changeButtonDeletePushed) {
            changeButton20.setText("");
            changedFood.get(changeButtonNumber).setQuantity(0);
            changeButtonDeletePushed = false;
        }
        else {
            changeButtonFunction(changeButtonNumber);
            if (changedFood.get(changeButtonNumber).getQuantity() != 0) {
                changeButton20.setText(changedFood.get(changeButtonNumber).getName());
            }
        }
    }
    @FXML
    private void changeButton21(ActionEvent event) {
        int changeButtonNumber = 5;
        if (changeButtonDeletePushed) {
            changeButton21.setText("");
            changedFood.get(changeButtonNumber).setQuantity(0);
            changeButtonDeletePushed = false;
        }
        else {
            changeButtonFunction(changeButtonNumber);
            if (changedFood.get(changeButtonNumber).getQuantity() != 0) {
                changeButton21.setText(changedFood.get(changeButtonNumber).getName());
            }
        }
    }
    @FXML
    private void changeButton30(ActionEvent event) {
        int changeButtonNumber = 6;
        if (changeButtonDeletePushed) {
            changeButton30.setText("");
            changedFood.get(changeButtonNumber).setQuantity(0);
            changeButtonDeletePushed = false;
        }
        else {
            changeButtonFunction(changeButtonNumber);
            if (changedFood.get(changeButtonNumber).getQuantity() != 0) {
                changeButton30.setText(changedFood.get(changeButtonNumber).getName());
            }
        }
    }
    @FXML
    private void changeButton31(ActionEvent event) {
        int changeButtonNumber = 7;
        if (changeButtonDeletePushed) {
            changeButton31.setText("");
            changedFood.get(changeButtonNumber).setQuantity(0);
            changeButtonDeletePushed = false;
        }
        else {
            changeButtonFunction(changeButtonNumber);
            if (changedFood.get(changeButtonNumber).getQuantity() != 0) {
                changeButton31.setText(changedFood.get(changeButtonNumber).getName());
            }
        }
    }

    @FXML
    private void handleButtonNumber7Action(ActionEvent event) {
        numberButtonFunction(7);
    }

    @FXML
    public void handleButtonNumber4Action(ActionEvent event) {
        numberButtonFunction(4);
    }

    @FXML
    private void handleButtonNumber1Action(ActionEvent event) {
        numberButtonFunction(1);
    }

    @FXML
    private void handleButtonNumber8Action(ActionEvent event) {
        numberButtonFunction(8);
    }

    @FXML
    private void handleButtonNumber5Action(ActionEvent event) {
        numberButtonFunction(5);
    }

    @FXML
    private void handleButtonNumber2Action(ActionEvent event) {
        numberButtonFunction(2);
    }
    
    @FXML
    private void handleButtonNumber9Action(ActionEvent event) {
        numberButtonFunction(9);
    }

    @FXML
    private void handleButtonNumber6Action(ActionEvent event) {
        numberButtonFunction(6);
    }

    @FXML
    private void handleButtonNumber3Action(ActionEvent event) {
        numberButtonFunction(3);
    }

    @FXML
    private void handleButtonNumber0Action(ActionEvent event) {
        numberButtonFunction(0);
    }

    @FXML
    private void handleButtonPayAction(ActionEvent event) {
        if (table.get(index) != null) {
            
            //v??g??sszeget kisz??molni
            int sum = 0;
            for (Food food : table.get(index).foods) {
                sum += food.getQuantity()*food.getPrice();
            }
            
            //f??jlba ki??rni
            
            try (PrintStream ps = new PrintStream("elszamolas.txt")){
                String csg = "A(z) " + currentTable + ". sz??m?? asztal sz??ml??ja\n";
                ps.append(csg);
                for (Food food : table.get(index).foods) {
                    csg = food.toString() + "\n";
                    ps.append(csg);
                }
                csg = "\nV??g??sszeg: " + sum + "\n";
                ps.append(csg);
            } catch (FileNotFoundException ex) {
                System.err.println("Hiba az ??llom??ny megnyit??sakor: " + ex.getMessage());
                System.exit(1);
            }
            
            //alarm ablakba ki??rni a t??teleket
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Fizet??s");
            alert.setHeaderText("A(z) " + currentTable + ". sz??m?? asztal\n\nA fizetend?? ??sszeg: " + sum + " forint!");
            alert.setContentText("K??sz??nj??k, hogy n??lunk v??s??rolt!\n\nJ?? ??tv??gyat k??v??nunk!");
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
                numberOutWrite.setText("");
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
        
        //ha nem volt egy asztal sem l??trehozunk egy 0-s asztalt
        if (table.size() == 0) {
            //food.add(new Food());
            Table tb = new Table(0);
            table.add(tb);
        }
        else {
            index = table.size();
            //k??rbej??rjuk az asztalokat
            for (Table tb : table) {
                //ha tal??lunk egyez?? asztalt
                if (tb.getTableNumber() == currentTable) {
                    index = table.indexOf(tb);
                    orderLabel.setText(table.get(index).toString());
                }
            }
        }
        numberOutWrite.setText("");
        number = 0;
    }
    
    @FXML
    private void changerButton (ActionEvent event) {
        if (changedFood.isEmpty()) {
            for (int i = 0; i < 8; i++) {
                changedFood.add(new Food(0, "", 0));
            }
        }
        changeButtonPushed = true;
    }
    
    @FXML
    private void changeButtonDelete(ActionEvent event) {
        changeButtonDeletePushed = true;
    }
    
    public void changeButtonFunction (int changeButtonNumber) {
        //ha a m??dos??t?? gomb le van nyomva
        if (changeButtonPushed) {
            //ha nem ??resek az input mez??k
            if (!nameInput.getText().isEmpty() && !priceInput.getText().isEmpty()) {
                String name = nameInput.getText();
                int price = Integer.parseInt(priceInput.getText());
                Food temp = new Food(1, name, price);
                //kicser??lj??k a m??r l??trehozott lista adott elem??t
                changedFood.set(changeButtonNumber, temp);
                System.out.println(changedFood.get(changeButtonNumber).toString());
            }
            else {
                System.out.println("Adjon meg ??rt??ket mindk??t helyre");
            }
            nameInput.setText("");
            priceInput.setText("");
            changeButtonPushed = false;
        }
        else {
            if (changedFood.get(changeButtonNumber).getQuantity() != 0) {
                handleButtonFunction(changedFood.get(changeButtonNumber).getName(), changedFood.get(changeButtonNumber).getPrice());
            }
        }
        
    }
    
    public void numberButtonFunction(int num) {
        String temp;
        if (number < 10) {
            if (number == 0) {
                number = num;
                temp = "" + number;
            }
            else {
                temp = "" + number;
                number = num;
                temp += number;
            }
            number = Integer.parseInt(temp);
            numberOutWrite.setText(temp);
        }
        else {
            System.out.println("T??l nagy sz??mot pr??b??l megadni.");
        }
    }
    
    public void handleButtonFunction(String foodName, int foodPrice) {
        
        int sum = 0;
        Food foodTemp = null;
        Table tableTemp = null;
        List<Food> food = new ArrayList<>();
        List<Food> tempFood = new ArrayList<>();
        
        //ha nem v??lasztunk mennyis??get akkor automatikusan 1
        if (number == 0) number = 1;
        food.add(new Food(number, foodName, foodPrice));
        System.out.println(food.toString());
        
        //ha nem volt egy asztal sem l??trehozunk egyet
        if (table.size() == 0) {
            table.add(new Table(currentTable, food));
        } else {
            indexOfTable = table.size();
            for (Table tb : table) {
                //ha tal??lunk egyez?? asztalt
                if (tb.getTableNumber() == currentTable) {
                    tableEquals = true;
                    indexOfTable = table.indexOf(tb);
                    tempFood = tb.getFoods();
                }
            }
            //ha m??r tal??ltunk egyez?? asztalt (Asztal gombban ki??rt??kelve)
            if (tableEquals) {
                //k??rbej??rjuk az adott asztal ??teleit
                for (Food foo : tempFood) {
                    //megvizsg??ljuk hogy volt e m??r rendelve a k??rt ??tel erre az asztalra
                    if (foo.getName().equals(foodName)) {
                        foodEquals = true;
                        indexOfFood = tempFood.indexOf(foo);
                        //m??solatot k??sz??t??nk az egyezett ??telr??l
                        foodTemp = foo;
                    }
                }
                //ha volt m??r a list??ban a k??rt ??tel
                if (foodEquals) {
                    //??sszegezz??k a most kiv??lasztott mennyis??gett az eddigi mennyis??ggel
                    sum = number + table.get(indexOfTable).getFoods().get(indexOfFood).getQuantity();
                    //lem??soljuk a kiv??laszott ??telt )el??tte megtett??k
                    //foodTemp = table.get(indexOfTable).getFoods().get(indexOfFood);
                    //elt??vol??tjuk a kiv??lasztott ??telt egy ezel??tt haszn??lt ??tellista m??solatb??l
                    tempFood.remove(foodTemp);
                    //hozz??adjuk az ??telt, az ??j darab??rt??kkel ehhez a m??solt list??hoz
                    tempFood.add(new Food(sum, foodName, foodPrice));
                    //k??sz??t??nk egy asztal lista m??solatot az adott asztalr??l
                    tableTemp = table.get(indexOfTable);
                    //elt??vol??tjuk ideiglenesen az adott asztalt
                    table.remove(tableTemp);
                    //k??sz??t??nk egy ??j asztalt a megl??v?? asztalsz??mmal ??s az ??j ??tellist??val
                    tableTemp = new Table(currentTable, tempFood);
                    //hozz??adjuk az asztallist??hoz az "??jraform??zott" asztalt
                    table.add(tableTemp);
                } else {
                    //ha nem volt ??tel egyez??s
                    //hozz??adjuk az ??telt, az ??j darab??rt??kkel ehhez a m??solt list??hoz
                    tempFood.add(new Food(number, foodName, foodPrice));
                    //k??sz??t??nk egy asztal lista m??solatot az adott asztalr??l
                    tableTemp = table.get(indexOfTable);
                    //elt??vol??tjuk ideiglenesen az adott asztalt
                    table.remove(tableTemp);
                    //k??sz??t??nk egy ??j asztalt a megl??v?? asztalsz??mmal ??s az ??j ??tellist??val
                    tableTemp = new Table(currentTable, tempFood);
                    //hozz??adjuk az asztallist??hoz az "??jraform??zott" asztalt
                    table.add(tableTemp);
                }
            } else {
                //ha nem volt asztal egyez??s l??trehozunk egy ??j asztalt a megadott ??tellel
                table.add(new Table(currentTable, food));
            }
        }
        
        //Megjelen??t??s
        orderLabel.setText(table.get(indexOfTable).toString());
        System.out.println(table.get(indexOfTable).toString());
        
        //mindent lenull??zunk
        number = 0;
        indexOfTable = 0;
        indexOfFood = 0;
        indexOfTable = 0;
        tableEquals = false;
        foodEquals = false;
        numberOutWrite.setText("");
        //tableTemp = null;
        //tempFood = null;
    }
}