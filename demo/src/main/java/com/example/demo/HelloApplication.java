package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Interface");

        // Create UI components
        DatePicker datePicker = new DatePicker();
        FileChooser fileChooser = new FileChooser();
        ToggleGroup genderGroup = new ToggleGroup();
        RadioButton maleRadioButton = new RadioButton("Male");
        RadioButton femaleRadioButton = new RadioButton("Female");
        ComboBox<String> cityComboBox = new ComboBox<>();
        cityComboBox.getItems().addAll("City 1", "City 2", "City 3");
        Button saveButton = new Button("Save");
        TextField cnicTextField = new TextField(); // Add a text field for CNIC

        // Set up layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        gridPane.add(new Label("Date Picker:"), 0, 0);
        gridPane.add(datePicker, 1, 0);
        gridPane.add(new Label("File Chooser:"), 0, 1);
//        gridPane.add(fileChooser, 1, 1);
        gridPane.add(new Label("Gender:"), 0, 2);
        gridPane.add(maleRadioButton, 1, 2);
        gridPane.add(femaleRadioButton, 2, 2);
        maleRadioButton.setToggleGroup(genderGroup);
        femaleRadioButton.setToggleGroup(genderGroup);
        gridPane.add(new Label("City:"), 0, 3);
        gridPane.add(cityComboBox, 1, 3);
        gridPane.add(new Label("CNIC:"), 0, 4); // Add label for CNIC
        gridPane.add(cnicTextField, 1, 4); // Add CNIC text field
        gridPane.add(saveButton, 1, 5); // Move save button down one row

        Scene scene = new Scene(gridPane, 400, 350); // Adjust scene height slightly
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}