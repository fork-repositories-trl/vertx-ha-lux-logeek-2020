package ru.kupchinolabs.vertx.vertx_ha_lux_logeek_2020.poison_pill;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.Vertx;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PoisonPill extends AbstractVerticle {

    @Override
    public void init(Vertx vertx, Context context) {
        super.init(vertx, context);
        log.info("init called");
    }

    @Override
    public void start() {
        vertx.setTimer(12500, c -> {
            log.info("<<< \u2620\u2620\u2620 POISON PILL IS NOW ACTIVATED \u2620\u2620\u2620 >>>");
            Runtime.getRuntime().halt(-42);
        });
        log.info("<--- PoisonPill ---> is now running");
    }

    @Override
    public void stop() {
        log.info("<--- PoisonPill ---> is now stopped");
    }

}
