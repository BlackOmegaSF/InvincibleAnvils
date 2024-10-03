package com.kleinercode.fabric.mixin;

import net.minecraft.screen.AnvilScreenHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AnvilScreenHandler.class)
public class AnvilUseDamageMixin {

    // Prevents anvils from being damaged by replacing the entire context run method

    @Inject(method = "onTakeOutput", at = @At(value = "INVOKE", target = "Lnet/minecraft/screen/ScreenHandlerContext;run(Ljava/util/function/BiConsumer;)V"), cancellable = true)
    private void onAnvilUseDamageCheck(CallbackInfo info) {
        ((ForgingScreenHandlerAccessor)this).getContext().run((world, pos) -> world.syncWorldEvent(1030, pos, 0));
        info.cancel();
    }

}
