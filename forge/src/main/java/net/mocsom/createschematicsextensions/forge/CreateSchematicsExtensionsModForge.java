package net.mocsom.createschematicsextensions.forge;

import net.mocsom.createschematicsextensions.CreateSchematicsExtensionsBlocks;
import net.mocsom.createschematicsextensions.CreateSchematicsExtensionsMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateSchematicsExtensionsMod.MOD_ID)
public class CreateSchematicsExtensionsModForge {
    public CreateSchematicsExtensionsModForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        CreateSchematicsExtensionsBlocks.REGISTRATE.registerEventListeners(eventBus);
        CreateSchematicsExtensionsMod.init();
    }
}
