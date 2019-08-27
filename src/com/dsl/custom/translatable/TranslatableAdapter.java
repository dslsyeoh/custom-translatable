package com.dsl.custom.translatable;

public class TranslatableAdapter implements ITranslatable
{
    private ITranslatable2 iTranslatable2;

    public TranslatableAdapter(ITranslatable2 iTranslatable2)
    {
        this.iTranslatable2 = iTranslatable2;
    }

    @Override
    public String translation(String key)
    {
        return iTranslatable2.translationNames().get(key);
    }
}
