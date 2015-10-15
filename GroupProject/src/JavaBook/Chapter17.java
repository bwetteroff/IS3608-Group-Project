//listing 1
// A JavaFX application skeleton. 
 
import javafx.application.*; 
import javafx.scene.*; 
import javafx.stage.*; 
import javafx.scene.layout.*; 
 
public class JavaFXSkel extends Application { 
 
  public static void main(String[] args) { 
  
    System.out.println("Launching JavaFX application."); 
  
    // Start the JavaFX application by calling launch(). 
    launch(args);   
  } 
 
  // Override the init() method. 
  public void init() { 
    System.out.println("Inside the init() method."); 
  } 
 
  // Override the start() method. 
  public void start(Stage myStage) { 
 
    System.out.println("Inside the start() method."); 
 
    // Give the stage a title. 
    myStage.setTitle("JavaFX Skeleton."); 
 
    // Create a root node. In this case, a flow layout 
    // is used, but several alternatives exist. 
    FlowPane rootNode = new FlowPane(); 
 
    // Create a scene. 
    Scene myScene = new Scene(rootNode, 300, 200); 
 
    // Set the scene on the stage. 
    myStage.setScene(myScene); 
 
    // Show the stage and its scene. 
    myStage.show(); 
  } 
 
  // Override the stop() method. 
  public void stop() { 
    System.out.println("Inside the stop() method."); 
  } 
}

//listing 2
// Demontrate a JavaFX label. 
 
import javafx.application.*; 
import javafx.scene.*; 
import javafx.stage.*; 
import javafx.scene.layout.*; 
import javafx.scene.control.*; 
 
public class JavaFXLabelDemo extends Application { 
 
  public static void main(String[] args) { 
 
    // Start the JavaFX application by calling launch(). 
    launch(args);   
  } 
 
  // Override the start() method. 
  public void start(Stage myStage) { 
 
    // Give the stage a title. 
    myStage.setTitle("Use a JavaFX label."); 
 
    // Use a FlowPane for the root node. 
    FlowPane rootNode = new FlowPane(); 
 
    // Create a scene. 
    Scene myScene = new Scene(rootNode, 300, 200); 
 
    // Set the scene on the stage. 
    myStage.setScene(myScene); 
 
    // Create a label. 
    Label myLabel = new Label("JavaFX is a powerful GUI"); 
 
    // Add the label to the scene graph. 
    rootNode.getChildren().add(myLabel); 
 
    // Show the stage and its scene. 
    myStage.show(); 
  } 
}

//listing 3
// Demonstrate JavaFX events and buttons. 
 
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
    myStage.setTitle("Use JavaFX Buttons and Events."); 
 
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
    Button btnUp = new Button("Up"); 
    Button btnDown = new Button("Down"); 
 
    // Handle the action events for the Up button. 
    btnUp.setOnAction(new EventHandler<ActionEvent>() { 
      public void handle(ActionEvent ae) { 
        response.setText("You pressed Up."); 
      } 
    }); 
 
    // Handle the action events for the Down button. 
    btnDown.setOnAction(new EventHandler<ActionEvent>() { 
      public void handle(ActionEvent ae) { 
        response.setText("You pressed Down."); 
      } 
    }); 
 
    // Add the label and buttons to the scene graph. 
    rootNode.getChildren().addAll(btnUp, btnDown, response); 
 
    // Show the stage and its scene. 
    myStage.show(); 
  } 
}

//listing 4
// Demonstrate Check Boxes. 
 
import javafx.application.*; 
import javafx.scene.*; 
import javafx.stage.*; 
import javafx.scene.layout.*; 
import javafx.scene.control.*; 
import javafx.event.*; 
import javafx.geometry.*; 
 
public class CheckboxDemo extends Application { 
 
  CheckBox cbSmartphone; 
  CheckBox cbTablet; 
  CheckBox cbNotebook; 
  CheckBox cbDesktop; 
 
  Label response; 
  Label selected; 
 
  String computers; 
 
  public static void main(String[] args) { 
 
    // Start the JavaFX application by calling launch(). 
    launch(args);   
  } 
 
  // Override the start() method. 
  public void start(Stage myStage) { 
 
    // Give the stage a title. 
    myStage.setTitle("Demonstrate Check Boxes"); 
 
    // Use a vertical FlowPane for the root node. In this case, 
    // vertical and horizontal gaps of 10. 
    FlowPane rootNode = new FlowPane(Orientation.VERTICAL, 10, 10); 
 
    // Center the controls in the scene. 
    rootNode.setAlignment(Pos.CENTER); 
 
    // Create a scene. 
    Scene myScene = new Scene(rootNode, 230, 200); 
 
    // Set the scene on the stage. 
    myStage.setScene(myScene); 
 
    Label heading = new Label("What Computers Do You Own?"); 
 
    // Create a label that will report the state change of a check box. 
    response = new Label(""); 
 
    // Create a label that will report all selected check boxes. 
    selected = new Label(""); 
 
    // Create the check boxes. 
    cbSmartphone = new CheckBox("Smartphone"); 
    cbTablet = new CheckBox("Tablet"); 
    cbNotebook = new CheckBox("Notebook"); 
    cbDesktop = new CheckBox("Desktop"); 
 
    // Handle action events for the check boxes. 
    cbSmartphone.setOnAction(new EventHandler<ActionEvent>() { 
      public void handle(ActionEvent ae) { 
        if(cbSmartphone.isSelected()) 
          response.setText("Smartphone was just selected."); 
        else 
          response.setText("Smartphone was just cleared."); 
 
        showAll(); 
      } 
    }); 
 
    cbTablet.setOnAction(new EventHandler<ActionEvent>() { 
      public void handle(ActionEvent ae) { 
        if(cbTablet.isSelected()) 
          response.setText("Tablet was just selected."); 
        else 
          response.setText("Tablet was just cleared."); 
 
        showAll(); 
      } 
    }); 
 
    cbNotebook.setOnAction(new EventHandler<ActionEvent>() { 
      public void handle(ActionEvent ae) { 
        if(cbNotebook.isSelected()) 
          response.setText("Notebook was just selected."); 
        else 
          response.setText("Notebook was just cleared."); 
 
        showAll(); 
      } 
    }); 
 
    cbDesktop.setOnAction(new EventHandler<ActionEvent>() { 
      public void handle(ActionEvent ae) { 
        if(cbDesktop.isSelected()) 
          response.setText("Desktop was just selected."); 
        else 
          response.setText("Desktop was just cleared."); 
 
        showAll(); 
      } 
    }); 
 
    // Add controls to the scene graph. 
    rootNode.getChildren().addAll(heading, cbSmartphone, cbTablet, 
                                  cbNotebook, cbDesktop, response, selected); 
 
    // Show the stage and its scene. 
    myStage.show(); 
 
    showAll(); 
  } 
 
  // Update and show the selections. 
  void showAll() { 
    computers = ""; 
    if(cbSmartphone.isSelected()) computers = "Smartphone "; 
    if(cbTablet.isSelected()) computers += "Tablet "; 
    if(cbNotebook.isSelected()) computers += "Notebook "; 
    if(cbDesktop.isSelected()) computers += "Desktop"; 
 
    selected.setText("Computers selected: " + computers); 
  } 
}

//listing 5
// Demonstrate a list view. 
 
import javafx.application.*; 
import javafx.scene.*; 
import javafx.stage.*; 
import javafx.scene.layout.*; 
import javafx.scene.control.*; 
import javafx.geometry.*; 
import javafx.beans.value.*; 
import javafx.collections.*; 
 
public class ListViewDemo extends Application { 
 
  Label response; 
 
  public static void main(String[] args) { 
 
    // Start the JavaFX application by calling launch(). 
    launch(args);   
  } 
 
  // Override the start() method. 
  public void start(Stage myStage) { 
 
    // Give the stage a title. 
    myStage.setTitle("ListView Demo"); 
 
    // Use a FlowPane for the root node. In this case, 
    // vertical and horizontal gaps of 10. 
    FlowPane rootNode = new FlowPane(10, 10); 
 
    // Center the controls in the scene. 
    rootNode.setAlignment(Pos.CENTER); 
 
    // Create a scene. 
    Scene myScene = new Scene(rootNode, 200, 120); 
 
    // Set the scene on the stage. 
    myStage.setScene(myScene); 
 
    // Create a label. 
    response = new Label("Select Computer Type"); 
 
    // Create an ObservableList of entries for the list view. 
    ObservableList<String> computerTypes = 
      FXCollections.observableArrayList("Smartphone", "Tablet", "Notebook", 
                                        "Desktop" );  
 
    // Create the list view. 
    ListView<String> lvComputers = new ListView<String>(computerTypes); 
 
    // Set the preferred height and width. 
    lvComputers.setPrefSize(100, 70); 
 
    // Get the list view selection model. 
    MultipleSelectionModel<String> lvSelModel = 
                                     lvComputers.getSelectionModel(); 
 
    // Use a change listener to respond to a change of selection within 
    // a list view. 
    lvSelModel.selectedItemProperty().addListener( 
                                      new ChangeListener<String>() { 
      public void changed(ObservableValue<? extends String> changed, 
                          String oldVal, String newVal) { 
 
        // Display the selection. 
        response.setText("Computer selected is " + newVal); 
      } 
    }); 
 
    // Add the label and list view to the scene graph. 
    rootNode.getChildren().addAll(lvComputers, response); 
 
    // Show the stage and its scene. 
    myStage.show(); 
  } 
}

//listing 6
// Demonstrate a text field. 
 
import javafx.application.*; 
import javafx.scene.*; 
import javafx.stage.*; 
import javafx.scene.layout.*; 
import javafx.scene.control.*; 
import javafx.event.*; 
import javafx.geometry.*; 
 
public class TextFieldDemo extends Application { 
 
  TextField tf; 
  Label response; 
 
  public static void main(String[] args) { 
 
    // Start the JavaFX application by calling launch(). 
    launch(args);   
  } 
 
  // Override the start() method. 
  public void start(Stage myStage) { 
 
    // Give the stage a title. 
    myStage.setTitle("Demonstrate a TextField"); 
 
    // Use a FlowPane for the root node. In this case, 
    // vertical and horizontal gaps of 10. 
    FlowPane rootNode = new FlowPane(10, 10); 
 
    // Center the controls in the scene. 
    rootNode.setAlignment(Pos.CENTER); 
 
    // Create a scene. 
    Scene myScene = new Scene(rootNode, 230, 140); 
 
    // Set the scene on the stage. 
    myStage.setScene(myScene); 
 
    // Create a label that will report the state of the 
    // selected check box. 
    response = new Label("Enter Name: "); 
 
    // Create a button that gets the text. 
    Button btnGetText = new Button("Get Name"); 
 
    // Create a text field. 
    tf = new TextField(); 
 
    // Set the prompt. 
    tf.setPromptText("Enter a name."); 
 
    // Set preferred column count. 
    tf.setPrefColumnCount(15); 
 
    // Use a lambda expression to handle action events for the 
    // text field. Action events are generated when ENTER is 
    // pressed while the text field has input focus. In this case, 
    // the text in the field is obtained and displayed. 
    tf.setOnAction( (ae) -> response.setText("Enter pressed. Name is: " + 
                                             tf.getText())); 
 
    // Use a lambda expression to get text from the text field 
    // when the button is pressed. 
    btnGetText.setOnAction((ae) -> 
                            response.setText("Button pressed. Name is: " + 
                                             tf.getText())); 
 
    // Use a separator to better organize the layout. 
    Separator separator = new Separator(); 
    separator.setPrefWidth(180); 
 
    // Add controls to the scene graph. 
    rootNode.getChildren().addAll(tf, btnGetText, separator, response); 
 
    // Show the stage and its scene. 
    myStage.show(); 
  } 
}

//listing 7
// Demonstrate rotation, scaling, reflection, and bluring. 
  
import javafx.application.*;  
import javafx.scene.*;  
import javafx.stage.*;  
import javafx.scene.layout.*;  
import javafx.scene.control.*;  
import javafx.event.*;  
import javafx.geometry.*;  
import javafx.scene.transform.*; 
import javafx.scene.effect.*; 
import javafx.scene.paint.*; 
  
public class EffectsAndTransformsDemo extends Application {  
  
  double angle = 0.0; 
  double scaleFactor = 0.4; 
  double blurVal = 1.0; 
 
  // Create initial effects and transforms. 
  Reflection reflection = new Reflection(); 
  BoxBlur blur = new BoxBlur(1.0, 1.0, 1); 
  Rotate rotate = new Rotate(); 
  Scale scale = new Scale(scaleFactor, scaleFactor); 
 
  // Create push buttons.  
  Button btnRotate = new Button("Rotate");  
  Button btnBlur = new Button("Blur off"); 
  Button btnScale = new Button("Scale"); 
 
  Label reflect = new Label("Reflection Adds Visual Sparkle"); 
 
  public static void main(String[] args) {  
  
    // Start the JavaFX application by calling launch().  
    launch(args);    
  }  
  
  // Override the start() method.  
  public void start(Stage myStage) {  
  
    // Give the stage a title.  
    myStage.setTitle("Effects and Transforms Demo");  
  
    // Use a FlowPane for the root node. In this case,  
    // vertical and horizontal gaps of 20 are used. 
    FlowPane rootNode = new FlowPane(20, 20);  
  
    // Center the controls in the scene.  
    rootNode.setAlignment(Pos.CENTER);  
  
    // Create a scene.  
    Scene myScene = new Scene(rootNode, 300, 120);  
  
    // Set the scene on the stage.  
    myStage.setScene(myScene);  
 
    // Add rotation to the transform list for the Rotate button. 
    btnRotate.getTransforms().add(rotate);  
 
    // Add scaling to the transform list for the Scale button. 
    btnScale.getTransforms().add(scale); 
 
    // Set the reflection effect on the reflection label. 
    reflection.setTopOpacity(0.7); 
    reflection.setBottomOpacity(0.3); 
    reflect.setEffect(reflection); 
 
    // Handle the action events for the Rotate button.  
    btnRotate.setOnAction(new EventHandler<ActionEvent>() {  
      public void handle(ActionEvent ae) {  
        // Each time button is pressed, it is rotated 30 degrees 
        // around its center. 
        angle += 15.0; 
 
        rotate.setAngle(angle);        
        rotate.setPivotX(btnRotate.getWidth()/2); 
        rotate.setPivotY(btnRotate.getHeight()/2); 
      }  
    });  
  
    // Handle the action events for the Scale button.  
    btnScale.setOnAction(new EventHandler<ActionEvent>() {  
      public void handle(ActionEvent ae) {  
        // Each time button is pressed, the button's scale is changed. 
        scaleFactor += 0.1; 
        if(scaleFactor > 2.0) scaleFactor = 0.4; 
 
        scale.setX(scaleFactor); 
        scale.setY(scaleFactor);         
 
      }  
    });  
 
    // Handle the action events for the Blur button. 
    btnBlur.setOnAction(new EventHandler<ActionEvent>() {  
      public void handle(ActionEvent ae) {  
        // Each time button is pressed, its blur status is changed. 
        if(blurVal == 10.0) { 
          blurVal = 1.0; 
          btnBlur.setEffect(null); 
          btnBlur.setText("Blur off"); 
        } else { 
          blurVal++; 
          btnBlur.setEffect(blur);  
          btnBlur.setText("Blur on"); 
        } 
        blur.setWidth(blurVal); 
        blur.setHeight(blurVal); 
      }  
    });  
 
    // Add the label and buttons to the scene graph.  
    rootNode.getChildren().addAll(btnRotate, btnScale, btnBlur, reflect);  
 
    // Show the stage and its scene.  
    myStage.show();  
  }  
}

