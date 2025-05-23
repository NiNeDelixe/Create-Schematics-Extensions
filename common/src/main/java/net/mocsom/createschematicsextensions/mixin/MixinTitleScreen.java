package net.mocsom.createschematicsextensions.mixin;

import net.mocsom.createschematicsextensions.CreateSchematicsExtensionsMod;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MixinTitleScreen {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        CreateSchematicsExtensionsMod.LOGGER.info("Hello from {}!", CreateSchematicsExtensionsMod.class.getName());
    }
}