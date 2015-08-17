package com.github.choonchernlim.testJavaFx.guice;

import com.github.choonchernlim.testJavaFx.service.EventBusService;
import com.github.choonchernlim.testJavaFx.service.FxmlLoaderService;
import com.github.choonchernlim.testJavaFx.service.impl.EventBusServiceImpl;
import com.github.choonchernlim.testJavaFx.service.impl.FxmlLoaderServiceImpl;
import com.google.inject.AbstractModule;

public final class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(EventBusService.class).to(EventBusServiceImpl.class).asEagerSingleton();
        bind(FxmlLoaderService.class).to(FxmlLoaderServiceImpl.class).asEagerSingleton();
    }
}
