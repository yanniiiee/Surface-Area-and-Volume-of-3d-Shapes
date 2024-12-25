module com.example.surface_area_and_volume_of_3d_shapes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.surface_area_and_volume_of_3d_shapes to javafx.fxml;
    exports com.example.surface_area_and_volume_of_3d_shapes;
}