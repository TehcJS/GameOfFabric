package io.github.tehcjs.gameoffabric;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements ModInitializer {
	public static Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "gameoffabric";
	public static final String MOD_NAME = "GameOfFabric";

	@Override
	public void onInitialize() {
	}

	public static void log(Level level, String message){
		LOGGER.log(level, "["+MOD_NAME+"] " + message);
	}
}
