module com.oop.groupseventeen.group17 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.groupseventeen.group17 to javafx.fxml;
    exports com.oop.groupseventeen.group17;
}