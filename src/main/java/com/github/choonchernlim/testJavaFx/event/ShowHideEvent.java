package com.github.choonchernlim.testJavaFx.event;

public final class ShowHideEvent {
    private final boolean show;

    public ShowHideEvent(final boolean show) {
        this.show = show;
    }

    public boolean isShow() {
        return show;
    }
}
