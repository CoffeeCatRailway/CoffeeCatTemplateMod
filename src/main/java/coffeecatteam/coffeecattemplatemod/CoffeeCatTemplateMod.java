package coffeecatteam.coffeecattemplatemod;

import coffeecatteam.coffeecattemplatemod.init.InitBlock;
import coffeecatteam.coffeecattemplatemod.proxy.ProxyCommon;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Author: CoffeeCatRailway
 */
@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class CoffeeCatTemplateMod {

    public static final CreativeTabs TAB = new CreativeTabs("cctm_tab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(InitBlock.EXMAPLE_BLOCK);
        }
    };

    private static Logger logger = getLogger();

    @SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
    private static ProxyCommon proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        logger.info("Pre Initialize");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
        logger.info("Initialize");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
        logger.info("Post Initialize");
    }

    public static Logger getLogger() {
        if (logger == null)
            logger = LogManager.getFormatterLogger(Reference.NAME.replace("\\s+", ""));
        return logger;
    }
}
