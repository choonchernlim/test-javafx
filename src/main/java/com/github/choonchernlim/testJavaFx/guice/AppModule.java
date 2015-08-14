package com.github.choonchernlim.testJavaFx.guice;

import com.github.choonchernlim.testJavaFx.service.EventBusService;
import com.github.choonchernlim.testJavaFx.service.impl.EventBusServiceImpl;
import com.google.inject.AbstractModule;

public final class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(EventBusService.class).to(EventBusServiceImpl.class).asEagerSingleton();
    }
}
