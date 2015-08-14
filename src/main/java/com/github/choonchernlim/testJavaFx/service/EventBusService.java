package com.github.choonchernlim.testJavaFx.service;

public interface EventBusService {

    void register(Object object);

    void post(Object event);
}
