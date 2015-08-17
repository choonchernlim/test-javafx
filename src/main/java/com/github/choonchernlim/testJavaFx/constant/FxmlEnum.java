package com.github.choonchernlim.testJavaFx.constant;

public enum FxmlEnum {
    MAIN("fxml/main.fxml"),
    RIGHT_PANE("fxml/right-pane.fxml");

    private final String path;

    FxmlEnum(final String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
