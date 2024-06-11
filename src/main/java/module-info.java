module org.pass.passwordmanager {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.pass.passwordmanager to javafx.fxml;
    exports org.pass.passwordmanager;
    exports org.pass.passwordmanager.Controllers;
    exports org.pass.passwordmanager.Controllers.Admin;
    exports org.pass.passwordmanager.Controllers.Client;
    exports org.pass.passwordmanager.Controllers.Util;
    exports org.pass.passwordmanager.Models;

    opens org.pass.passwordmanager.Controllers.Util to javafx.fxml;
}