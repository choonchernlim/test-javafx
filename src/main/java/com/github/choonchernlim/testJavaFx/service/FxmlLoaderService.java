package com.github.choonchernlim.testJavaFx.service;

import com.github.choonchernlim.testJavaFx.constant.FxmlEnum;
import javafx.scene.Parent;

public interface FxmlLoaderService {

    Parent load(FxmlEnum fxmlEnum);
}
