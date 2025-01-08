package com.stanieldev.syncopation.data;

import com.stanieldev.syncopation.registry.MetalRegistry;
import org.jetbrains.annotations.NotNull;

public class MetalType implements IMetalType {
    private final String name;

    // Constructor
    public MetalType(String name) {
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
        MetalRegistry.registerAll(this);
    }
}