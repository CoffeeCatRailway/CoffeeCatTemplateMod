package coffeecatteam.coffeecattemplatemod.init;

import coffeecatteam.coffeecattemplatemod.CoffeeCatTemplateMod;
import coffeecatteam.coffeecattemplatemod.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

/**
 * Author: CoffeeCatRailway
 */
public class InitBlock {

    // Block variables here
    public static final Block EXMAPLE_BLOCK = new BlockBase("example_block", Material.ROCK, CoffeeCatTemplateMod.TAB);

    // Register blocks here
	public static void init() {
        register(EXMAPLE_BLOCK);
	}

	// Register tileentities here
	public static void registerTileEntities() {
    }

    private static void register(Block... blocks) {
        for (Block block : blocks)
            register(block);
    }

    private static void register(Block block) {
	    RegistrationHandler.Blocks.BLOCKS.add(block);
        ItemBlock itemBlock = (ItemBlock) new ItemBlock(block).setRegistryName(block.getRegistryName());
        RegistrationHandler.Items.ITEMS.add(itemBlock);
    }
}
