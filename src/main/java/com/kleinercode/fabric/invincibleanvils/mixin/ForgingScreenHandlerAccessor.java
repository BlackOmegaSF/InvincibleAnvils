package com.kleinercode.fabric.invincibleanvils.mixin;

import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.ItemCombinerMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ItemCombinerMenu.class)
public interface ForgingScreenHandlerAccessor {

    @Accessor
    ContainerLevelAccess getAccess();

}
