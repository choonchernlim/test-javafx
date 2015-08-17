package com.github.choonchernlim.testJavaFx.guice;

import com.github.choonchernlim.testJavaFx.service.FxmlLoaderService;
import com.github.choonchernlim.testJavaFx.service.impl.FxmlLoaderServiceImpl;
import com.google.common.eventbus.EventBus;
import com.google.inject.AbstractModule;

public final class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(EventBus.class).asEagerSingleton();
        //bind(EventBusService.class).to(EventBusServiceImpl.class).asEagerSingleton();
        bind(FxmlLoaderService.class).to(FxmlLoaderServiceImpl.class).asEagerSingleton();
    }
}
