package ru.kupchinolabs.vertx.vertx_ha_lux_logeek_2020.destination;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.eventbus.Message;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DestinationConnector extends AbstractVerticle { // TODO AfoReadyVerticle

    @Override
    public void init(Vertx vertx, Context context) {
        super.init(vertx, context);
        log.info("init called");
    }

    @Override
    public void start() {
        vertx.eventBus().consumer("destination_topic", (Handler<Message<String>>) m -> log.info("Receiving '" + m.body() + "'"));
        log.info("<--- DestinationConnector ---> is now running");
    }

    @Override
    public void stop() {
        log.info("<--- DestinationConnector ---> is now stopped");
    }

}
