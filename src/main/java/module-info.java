module de.hhn.ai.pmt.theatercomedy {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens de.hhn.ai.pmt.theatercomedy to javafx.fxml;
    exports de.hhn.ai.pmt.theatercomedy;
}