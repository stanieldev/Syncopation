package com.stanieldev.syncopation;

import com.stanieldev.syncopation.data.MetalType;
import com.stanieldev.syncopation.data.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;

public class Registry {

    // Deferred Register Buffers
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Syncopation.MOD_ID);
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Syncopation.MOD_ID);

    // Syncopation Buffers
    private static final ArrayList<MetalType> metals = new ArrayList<>();
    private static ArrayList<WoodType> woods = new ArrayList<>();

    // Mod Adders
    public void addMetal(MetalType metal) {
        metals.add(metal);
    }
    public void addWood(WoodType wood) {
        woods.add(wood);
    }

    // Final Registration
    public void register(IEventBus modEventBus) {
        metals.forEach(MetalType::register);
        woods.forEach(WoodType::register);
        ITEMS.register(modEventBus);
        BLOCKS.register(modEventBus);
    }
}
