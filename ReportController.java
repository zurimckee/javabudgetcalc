//Ignore until it is GUI Time
//import javafx.collections.FXCollections;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.control.Button;
//import javafx.scene.control.ComboBox;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextArea;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//
//public class ReportController {
//    @FXML
//    Label lblTitle;
//    @FXML
//    ComboBox<String> cmbCategory;
//    @FXML
//    TextArea txtReport;
//    @FXML
//    Button btnClose;
//
//    StudentAssignments studentAssignments;
//
//    public void initData(StudentAssignments studentAssignments) {
//        this.studentAssignments = studentAssignments;
//      //Populate ComboBox
//        String[] categories = new String[Category.values().length];
//        for (Category c : Category.values()) {
//            categories[c.ordinal()] = c.toString();
//        }
//        cmbCategory.getItems().addAll(FXCollections
//                .observableArrayList(categories));
//    }
//
//    @FXML
//    protected void onComboClick() {
//        Category cat = Category.valueOf(cmbCategory.getValue());
//        String strReport = studentAssignments.getAssignmentCategory(cat.ordinal()).toString();
//        //Generate the category report and add it to the TextArea control.
//    }
//
//    @FXML
//    public void onBtnCloseClick(ActionEvent event) {
//        Stage stage = (Stage) btnClose.getScene().getWindow();
//        stage.close();
//    }
//
//
//
//}
