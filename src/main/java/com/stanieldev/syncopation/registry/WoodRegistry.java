package com.stanieldev.syncopation.registry;

import com.stanieldev.syncopation.Registry;
import com.stanieldev.syncopation.data.WoodType;
import net.minecraft.world.item.Item;


public class WoodRegistry {
    public static void registerAll(WoodType woodType) {
        registerStick(woodType);
    }

    public static void registerStick(WoodType woodType) {
        Registry.ITEMS.registerItem(woodType.getName() + "_stick", Item::new, new Item.Properties());
    }
}
