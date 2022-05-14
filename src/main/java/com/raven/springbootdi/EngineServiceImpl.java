package com.raven.springbootdi;

import org.springframework.stereotype.Component;

@Component
public class EngineServiceImpl implements IEngineService{

    @Override
    public String getEngineDetails() {
        return "All alloy quad overhead cam, 4.0 litre twin turbo V8.";
    }
    
}
