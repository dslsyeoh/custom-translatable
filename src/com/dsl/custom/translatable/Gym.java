package com.dsl.custom.translatable;

public class Gym implements Translatable
{
    private String name;

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String translationName()
    {
        return name;
    }
}
