package net.mocsom.createschematicsextensions;

import com.simibubi.create.Create;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateSchematicsExtensionsMod {
    public static final String MOD_ID = "createschematicsextensions";
    public static final String NAME = "Create: Schematics Extensions";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);


    public static void init() {
        LOGGER.info("{} initializing! Create version: {} on platform: {}", NAME, Create.VERSION, CreateSchematicsExtensionsExpectPlatform.platformName());
        CreateSchematicsExtensionsBlocks.init(); // hold registrate in a separate class to avoid loading early on forge
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
