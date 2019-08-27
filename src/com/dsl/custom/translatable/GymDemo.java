package com.dsl.custom.translatable;

import java.util.HashMap;
import java.util.Map;

public class GymDemo implements ITranslatable
{
    private Gym gym = new Gym();
    private Trainer trainer = new Trainer();
    private Branch branch = new Branch();

    public void init() {
        gym.setName("gym.name.dsl");

        Map<String, String> trainers = new HashMap<>();
        trainers.put("t1", "trainer.name.aaa");
        trainers.put("t2", "trainer.name.bbb");
        trainers.put("t3", "trainer.name.ccc");

        Map<String, String> branches = new HashMap<>();
        branches.put("b1", "branch.name.mmm");
        branches.put("b2", "branch.name.nnn");
        branches.put("b3", "branch.name.ooo");

        trainer.setNames(trainers);
        branch.setNames(branches);
    }

    void print()
    {
        System.out.println(translation(gym.translationName()));
        System.out.println(translation(trainer, "t1"));
        System.out.println(translation(branch, "b1"));
    }

    @Override
    public String translation(String key)
    {
        return "resourceFactory.getStringBinding(" + "\"" + key + "\")";
    }

    private <T extends ITranslatable2> String translation(T type, String key)
    {
        TranslatableAdapter translatableAdapter = new TranslatableAdapter(type);
        return translation(translatableAdapter.translation(key));
    }
}
