package coffeecatteam.coffeecattemplatemod.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Author: CoffeeCatRailway
 */
public class ItemBase extends Item {

    public ItemBase(String name, CreativeTabs tab) {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(tab);
    }
}
