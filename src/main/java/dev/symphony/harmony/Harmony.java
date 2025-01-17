package dev.symphony.harmony;

import dev.symphony.harmony.config.HarmonyConfig;
import dev.symphony.harmony.config.HarmonyConfigCondition;
import dev.symphony.harmony.item.ModifyItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Harmony implements ModInitializer {
	public static final String MOD_ID = "harmony";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier id (String path) {
		return Identifier.of(Harmony.MOD_ID, path);
	}

	@Override
	public void onInitialize() {
		// Config
		HarmonyConfig.initialize();
		HarmonyConfigCondition.init();

		// gay shit
		ModifyItems.init();
	}
}