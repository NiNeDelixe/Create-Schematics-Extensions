package net.mocsom.createschematicsextensions.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.mocsom.createschematicsextensions.CreateSchematicsExtensionsBlocks;
import net.mocsom.createschematicsextensions.CreateSchematicsExtensionsMod;
import net.fabricmc.api.ModInitializer;

public class CreateSchematicsExtensionsModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CreateSchematicsExtensionsMod.init();
        CreateSchematicsExtensionsMod.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), CreateSchematicsExtensionsMod.NAME);
        // on fabric, Registrates must be explicitly finalized and registered.
        CreateSchematicsExtensionsBlocks.REGISTRATE.register();
    }
}
