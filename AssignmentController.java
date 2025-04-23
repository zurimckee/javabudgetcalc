

//Ignore this file until it is GUI Time.
//import javafx.collections.FXCollections;
//
//import javafx.fxml.FXML;
//import javafx.scene.control.Button;
//import javafx.scene.control.ComboBox;
//import javafx.scene.control.TextField;
//import javafx.stage.Stage;
//
///**
// * Created By:  Kelvin S. Bryant for COMP167
// */
//public class AssignmentController {
//
//    @FXML
//    TextField txtPoints;
//    @FXML
//    TextField txtMaxPoints;
//    @FXML
//    TextField txtAssignmentName;
//@FXML
//Button btnSave;
//@FXML Button btnCancel;
//    @FXML
//    ComboBox<String> cmbCategory;
//    StudentAssignments studentAssignments;
//
//    /**
//     * Enables the caller to pass the student grade data to the Add Assignment form.
//     * @param studentAssignments
//     */
//    public void initData(StudentAssignments studentAssignments) {
//        this.studentAssignments = studentAssignments;
//        String[] categories = new String[Category.values().length];
//
//        //Add the grade categories to the ComboBox/DropDown
//        for (Category c : Category.values()) {
//            categories[c.ordinal()] = c.toString();
//        }
//        cmbCategory.getItems().addAll(FXCollections
//                .observableArrayList(categories));
//    }
//
//    @FXML protected void onComboClick() {
//        //Nothing needed here for this assignment.
//    }
//
//    @FXML protected void onBtnCancelClick() {
//        Stage stage = (Stage) btnCancel.getScene().getWindow();
//        stage.close();
//    }
//
//    @FXML protected void onBtnSaveClick() {
//        //####Use the information in the Category ComboBox and the TextFields to populate a new Assignment Object.
//        //  Add that object to your studentAssignments object
//
//        //Close the window/stage
//        Stage stage = (Stage) btnSave.getScene().getWindow();
//        stage.close();
//    }
//
//}

