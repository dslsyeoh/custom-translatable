package com.dsl.custom.translatable;

import java.util.HashMap;
import java.util.Map;

public class Trainer implements ITranslatable2
{
    private Map<String, String> names = new HashMap<>();

    void setNames(Map<String, String> names)
    {
        this.names = names;
    }

    @Override
    public Map<String, String> translationNames() {
        return names;
    }
}
