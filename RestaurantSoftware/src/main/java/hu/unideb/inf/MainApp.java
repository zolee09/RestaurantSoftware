package hu.unideb.inf;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        
        stage.setTitle("Mérnök-software Kft.");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    
    
    /* iras tesztelese /meghivasa
    try {
            Gepjarmu lista[] = new Gepjarmu[3];
            lista[0] = new Gepjarmu("ABC-987", "Valaki");
            lista[1] = new Autobusz("BUS-123", "BKV", 40);
            lista[2] = new Teherauto("TEH-456", "Fosped", 5);
             
            for( int i = 0; i < 3; i++ ) {
                lista[i].print();
            }
            PersistentOutputStream out =
                new PersistentOutputStream(
                    new FileOutputStream("gepjarmu.tmp") );

            for( int i = 0; i < 3; i++ ) {
                out.writePersistent( lista[i] );
            }
            out.close();
        }
        catch( Exception ee )
        {    System.err.println( ee.toString() );     }
    */
    
    /* olvasas meghivasa
    try {
            Gepjarmu lista[] = new Gepjarmu[3];           
            PersistentInputStream in =
                new PersistentInputStream(
                    new FileInputStream("gepjarmu.tmp") );

            for( int i = 0; i < 3; i++ ) {
               lista[i] = (Gepjarmu) in.readPersistent();
            }
            in.close();

            for( int i = 0; i < 3; i++ ) {
               lista[i].print();
            }
        }
        catch( Exception ee )
        {    System.err.println( ee.toString() );     }
    */
    
    }
}
