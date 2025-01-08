package com.stanieldev.syncopation.registry;

import com.stanieldev.syncopation.Registry;
import com.stanieldev.syncopation.data.MetalType;
import net.minecraft.world.item.Item;


public class MetalRegistry {
    public static void registerAll(MetalType metalType) {
        registerIngot(metalType);
    }

    public static void registerIngot(MetalType metalType) {
        Registry.ITEMS.registerItem(metalType.getName() + "_ingot", Item::new, new Item.Properties());

        // Add to lang file using generated resources
        

        // Add to item model
        // Add item texture
        // Add in-game tags
    }
}
