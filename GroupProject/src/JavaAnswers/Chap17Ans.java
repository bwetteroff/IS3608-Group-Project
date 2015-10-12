//listing 1
// Demonstrate Platform.exit().  
  
import javafx.application.*;  
import javafx.scene.*;  
import javafx.stage.*;  
import javafx.scene.layout.*;  
import javafx.scene.control.*;  
import javafx.event.*;  
import javafx.geometry.*;  
  
public class JavaFXEventDemo extends Application {  
  
  Label response;  
  
  public static void main(String[] args) {  
  
    // Start the JavaFX application by calling launch().  
    launch(args);    
  }  
  
  // Override the start() method.  
  public void start(Stage myStage) {  
  
    // Give the stage a title.  
    myStage.setTitle("Use Platform.exit().");  
  
    // Use a FlowPane for the root node. In this case,  
    // vertical and horizontal gaps of 10.  
    FlowPane rootNode = new FlowPane(10, 10);  
  
    // Center the controls in the scene.  
    rootNode.setAlignment(Pos.CENTER);  
  
    // Create a scene.  
    Scene myScene = new Scene(rootNode, 300, 100);  
  
    // Set the scene on the stage.  
    myStage.setScene(myScene);  
  
    // Create a label.  
    response = new Label("Push a Button");  
  
    // Create two push buttons.  
    Button btnRun = new Button("Run");  
    Button btnExit = new Button("Exit");  
  
    // Handle the action events for the Run button.  
    btnRun.setOnAction((ae) -> response.setText("You pressed Run.")); 
  
    // Handle the action events for the Exit button.  
    btnExit.setOnAction((ae) -> Platform.exit());  
  
    // Add the label and buttons to the scene graph.  
    rootNode.getChildren().addAll(btnRun, btnExit, response);  
  
    // Show the stage and its scene.  
    myStage.show();  
  }  
}

//listing 2
// A JavaFX version of the file comparison program shown in 
// Try This 16-1. 
  
import javafx.application.*;  
import javafx.scene.*;  
import javafx.stage.*;  
import javafx.scene.layout.*;  
import javafx.scene.control.*;  
import javafx.event.*;  
import javafx.geometry.*;  
import java.io.*; 
  
public class JavaFXFileComp extends Application {  
  
  TextField tfFirst;  // holds the first file name 
  TextField tfSecond; // holds the second file name 
 
  Button btnComp; // button to compare the files 
 
  Label labFirst, labSecond; // displays prompts 
  Label labResult; // displays results and error messages 
 
  public static void main(String[] args) {  
  
    // Start the JavaFX application by calling launch().  
    launch(args);    
  }  
  
  // Override the start() method.  
  public void start(Stage myStage) {  
  
    // Give the stage a title.  
    myStage.setTitle("Compare Files");  
  
    // Use a FlowPane for the root node. In this case,  
    // vertical and horizontal gaps of 10.  
    FlowPane rootNode = new FlowPane(10, 10);  
  
    // Center the controls in the scene.  
    rootNode.setAlignment(Pos.CENTER);  
  
    // Create a scene.  
    Scene myScene = new Scene(rootNode, 180, 180);  
  
    // Set the scene on the stage.  
    myStage.setScene(myScene);  
  
    // Create the text fields for the file names. 
    tfFirst = new TextField(); 
    tfSecond = new TextField(); 
 
    // Set preferred column sizes. 
    tfFirst.setPrefColumnCount(12); 
    tfSecond.setPrefColumnCount(12); 
 
    // Set prompts for file names. 
    tfFirst.setPromptText("Enter file name.");  
    tfSecond.setPromptText("Enter file name.");  
 
    // Create the Compare button. 
    btnComp = new Button("Compare"); 
 
    // Create the labels. 
    labFirst = new Label("First file: "); 
    labSecond = new Label("Second file: "); 
    labResult = new Label(""); 
 
    // Use a lambda expressions to handle action events for the  
    // text fields. These handlers simply fire the Compare button.  
    tfFirst.setOnAction( (ae) -> btnComp.fire());  
    tfSecond.setOnAction( (ae) -> btnComp.fire());  
 
    // Handle the action event for the Compare button.  
    btnComp.setOnAction(new EventHandler<ActionEvent>() {  
      public void handle(ActionEvent ae) {  
        int i=0, j=0; 
 
        // First, confirm that both file names have 
        // been entered. 
        if(tfFirst.getText().equals("")) { 
          labResult.setText("First file name missing."); 
          return; 
        } 
        if(tfSecond.getText().equals("")) { 
          labResult.setText("Second file name missing."); 
          return; 
        } 
 
        // Compare files. Use try-with-resources to manage the files. 
        try (FileInputStream f1 = new FileInputStream(tfFirst.getText()); 
             FileInputStream f2 = new FileInputStream(tfSecond.getText())) 
        { 
          // Check the contents of each file. 
          do { 
            i = f1.read(); 
            j = f2.read(); 
            if(i != j) break; 
          } while(i != -1 && j != -1); 
 
          if(i != j) 
            labResult.setText("Files are not the same."); 
          else 
            labResult.setText("Files compare equal."); 
 
        } catch(IOException exc) { 
          labResult.setText("File Error Encountered"); 
        } 
      } 
    });  
  
    // Add controls to the scene graph.  
    rootNode.getChildren().addAll(labFirst, tfFirst, labSecond, tfSecond, 
                                  btnComp, labResult);  
  
    // Show the stage and its scene.  
    myStage.show();  
  }  
}

