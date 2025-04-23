//Ignore this file until it is GUI Time

//import javafx.application.Platform;
//import javafx.collections.FXCollections;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.Scene;
//import javafx.scene.control.ComboBox;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.VBox;
//import javafx.stage.FileChooser;
//import javafx.stage.Modality;
//import javafx.stage.Stage;
//
//import java.io.File;
//import java.io.IOException;
//
//public class MainController {
//
//    @FXML
//    AnchorPane mainPane;
//    @FXML
//    ComboBox<String> cmbCategory;
//    @FXML
//    Label lblTitle;
//    FXMLLoader fxmlLoader = null;
//    StudentAssignments studentAssignments = new StudentAssignments();
//
//    public StudentAssignments getStudentAssignments() {
//        return studentAssignments;
//    }
//
//    public void initialize() {
//        //System.out.println("Initalize the Controller.");
//    }
//
//    @FXML
//    public void onFileExitMenuItemClick() {
//        Platform.exit();
//    }
//
//    @FXML
//    protected void onFileOpenMenuItemClick() {
//        FileChooser fileChooser = new FileChooser();
//        fileChooser.setTitle("Open Client File");
//        fileChooser.getExtensionFilters().addAll(
//                new FileChooser.ExtensionFilter("Text Files", "*.txt"));
//
//        File selectedFile = fileChooser.showOpenDialog(null);
//        if (selectedFile != null) {
//            studentAssignments.readGradeFile(selectedFile);
//            System.out.println(studentAssignments);
//        }
//    }
//
//    private Stage createDialog( String FXMLFile) throws IOException {
//        fxmlLoader = new FXMLLoader(getClass().getResource(FXMLFile));
//        Scene scene = new Scene(fxmlLoader.load());
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.initModality(Modality.APPLICATION_MODAL);
//        return stage;
//    }
//
//    @FXML
//    protected void onAddAssignmentMenuItemClick() throws IOException {
//        Stage stage = createDialog( "AssignmentGUI.fxml");
//        AssignmentController assignmentController = fxmlLoader.getController();
//        assignmentController.initData(studentAssignments);
//        stage.showAndWait();
//
//    }
//
//    @FXML
//    protected void onReportCategoryMenuItemClick() throws IOException {
//        Stage stage = createDialog("CategoryReportGUI.fxml");
//        ReportController repController = fxmlLoader.getController();
//        repController.initData(studentAssignments);
//        stage.showAndWait();
//    }
//
//
//}
