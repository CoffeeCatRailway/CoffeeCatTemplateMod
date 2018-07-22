package coffeecatteam.coffeecattemplatemod.init;

import coffeecatteam.coffeecattemplatemod.CoffeeCatTemplateMod;
import coffeecatteam.coffeecattemplatemod.objects.items.ItemBase;
import net.minecraft.item.Item;

/**
 * Author: CoffeeCatRailway
 */
public class InitItem {

    // Item variables here
    public static final Item EXMAPLE_ITEM = new ItemBase("example_item", CoffeeCatTemplateMod.TAB);

    // Register items here
    public static void init() {
        register(EXMAPLE_ITEM);
    }

    private static void register(Item... items) {
        for (Item item : items)
            register(item);
    }

	private static void register(Item item) {
        RegistrationHandler.Items.ITEMS.add(item);
    }
}
