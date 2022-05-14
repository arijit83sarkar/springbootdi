package com.raven.springbootdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AstonMartin implements ICar {

    private EngineServiceImpl engine;

    @Autowired
    public AstonMartin(EngineServiceImpl engine) {
        this.engine = engine;
    }

    @Override
    public String getCarDetails() {
        return "V8 Roadster";
    }

    @Override
    public String getEngine() {
        return this.engine.getEngineDetails();
    }

}
