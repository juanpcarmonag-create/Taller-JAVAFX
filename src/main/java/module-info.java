module uniquindio.edu.co.tallerjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens uniquindio.edu.co.tallerjavafx to javafx.fxml;
    exports uniquindio.edu.co.tallerjavafx;
    exports uniquindio.edu.co.tallerjavafx.viewController;
    opens uniquindio.edu.co.tallerjavafx.viewController to javafx.fxml;

}
