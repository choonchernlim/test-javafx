package com.github.choonchernlim.testJavaFx.guice;

import com.github.choonchernlim.testJavaFx.service.EventBusService;
import com.github.choonchernlim.testJavaFx.service.FxmlLoaderService2;
import com.github.choonchernlim.testJavaFx.service.impl.EventBusServiceImpl;
import com.github.choonchernlim.testJavaFx.service.impl.FxmlLoaderServiceImpl2;
import com.google.inject.AbstractModule;

public final class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(EventBusService.class).to(EventBusServiceImpl.class).asEagerSingleton();
        bind(FxmlLoaderService2.class).to(FxmlLoaderServiceImpl2.class).asEagerSingleton();
    }
}
