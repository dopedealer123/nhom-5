module com.tsp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.tsp to javafx.fxml;
    exports com.tsp;

    exports com.tsp.controller;
    opens com.tsp.controller to javafx.fxml;

    exports com.tsp.controller.graphView;
    opens com.tsp.controller.graphView to javafx.fxml;

    exports com.tsp.graph;
    opens com.tsp.graph to javafx.fxml;
}