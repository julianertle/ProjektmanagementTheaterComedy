module de.hhn.ai.pmt.theatercomedy {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens de.hhn.ai.pmt.theatercomedy to javafx.fxml;
    exports de.hhn.ai.pmt.theatercomedy;

    opens de.hhn.ai.pmt.theatercomedy.model to javafx.fxml;
    exports de.hhn.ai.pmt.theatercomedy.model;
    exports de.hhn.ai.pmt.theatercomedy.control;
    opens de.hhn.ai.pmt.theatercomedy.control to javafx.fxml;
    exports de.hhn.ai.pmt.theatercomedy.view;
    opens de.hhn.ai.pmt.theatercomedy.view to javafx.fxml;
}