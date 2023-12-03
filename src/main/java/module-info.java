module ru.vsu.cs.manukovskij.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.databind;


    opens ru.vsu.cs.manukovskij.demo to javafx.fxml;
    exports ru.vsu.cs.manukovskij.demo;
}