package com.kleinercode.fabric.invincibleanvils.mixin;

import net.minecraft.world.inventory.AnvilMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AnvilMenu.class)
public class AnvilUseDamageMixin {

    // Prevents anvils from being damaged by replacing the entire context run method

    @Inject(method = "onTake", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/inventory/ContainerLevelAccess;execute(Ljava/util/function/BiConsumer;)V"), cancellable = true)
    private void onAnvilUseDamageCheck(CallbackInfo info) {
        ((ForgingScreenHandlerAccessor)this).getAccess().execute((world, pos) -> world.levelEvent(1030, pos, 0));
        info.cancel();
    }

}
