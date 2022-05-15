package com.raven.springbootdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AstonMartin implements ICar {

    private IEngineService engine;

    // @Autowired
    // public AstonMartin(IEngineService engine) {
    //     this.engine = engine;
    // }

    @Autowired
    public void setEngineService(IEngineService engine) {
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
