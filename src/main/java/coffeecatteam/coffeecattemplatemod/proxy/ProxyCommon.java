package coffeecatteam.coffeecattemplatemod.proxy;

import coffeecatteam.coffeecattemplatemod.init.RegistrationHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Author: CoffeeCatRailway
 */
public class ProxyCommon {

	public void preInit(FMLPreInitializationEvent event) {
        RegistrationHandler.init();
	}

	public void init(FMLInitializationEvent event) {

	}

	public void postInit(FMLPostInitializationEvent event) {
	}
}
