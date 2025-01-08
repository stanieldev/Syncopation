package com.stanieldev.syncopation.data;

import org.jetbrains.annotations.NotNull;

public interface IMetalType {
    @NotNull
    String getName();
    void register();
}