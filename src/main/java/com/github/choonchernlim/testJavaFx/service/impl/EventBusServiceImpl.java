package com.github.choonchernlim.testJavaFx.service.impl;

import com.github.choonchernlim.testJavaFx.service.EventBusService;
import com.google.common.eventbus.EventBus;

public final class EventBusServiceImpl implements EventBusService {
    private final EventBus eventBus;

    public EventBusServiceImpl() {
        eventBus = new EventBus();
    }

    @Override
    public void register(final Object object) {
        eventBus.register(object);
    }

    @Override
    public void post(final Object event) {
        eventBus.post(event);
    }
}
