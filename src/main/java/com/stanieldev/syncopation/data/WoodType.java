package com.stanieldev.syncopation.data;

import com.stanieldev.syncopation.registry.WoodRegistry;
import org.jetbrains.annotations.NotNull;

public class WoodType implements IWoodType {
    private final String name;

    // Constructor
    public WoodType(String name) {
        this.name = name.toLowerCase();
    }

    // Getters
    @Override
    public @NotNull String getName() {
        return name;
    }

    // Register
    @Override
    public void register() {
        WoodRegistry.registerAll(this);
    }
}