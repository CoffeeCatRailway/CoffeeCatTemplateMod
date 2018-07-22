package coffeecatteam.coffeecattemplatemod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Author: CoffeeCatRailway
 */
public class BlockBase extends Block {

    public BlockBase(String name, Material material, CreativeTabs tab) {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(tab);
    }
}
