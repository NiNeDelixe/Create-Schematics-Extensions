package net.mocsom.createschematicsextensions.fabric;

import net.fabricmc.loader.api.FabricLoader;

public class CreateSchematicsExtensionsExpectPlatformImpl {
	public static String platformName() {
		return FabricLoader.getInstance().isModLoaded("quilt_loader") ? "Quilt" : "Fabric";
	}
}
