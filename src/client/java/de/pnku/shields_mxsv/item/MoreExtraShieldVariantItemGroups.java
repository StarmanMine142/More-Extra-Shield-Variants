package de.pnku.shields_mxsv.item;

import dev.imb11.shields.items.ShieldsItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.*;

import static de.pnku.shields_mxsv.item.MoreExtraShieldVariantItems.more_extra_shields;

@Environment(value = EnvType.CLIENT)
public class MoreExtraShieldVariantItemGroups {

    public static void registerMxsvItemGroups() {
        for (Item shieldItem : more_extra_shields) {
            Item baseShieldItem;
            String shieldDescId = shieldItem.getDescriptionId();
            boolean isPlated = shieldDescId.contains("plated");
            if (shieldDescId.contains("copper")){
                baseShieldItem = isPlated ? ShieldsItems.PLATED_COPPER_SHIELD : ShieldsItems.COPPER_SHIELD;
            } else if (shieldDescId.contains("gold")){
                baseShieldItem = isPlated ? ShieldsItems.PLATED_GOLD_SHIELD : ShieldsItems.GOLD_SHIELD;
            } else if (shieldDescId.contains("diamond")){
                baseShieldItem = isPlated ? ShieldsItems.PLATED_DIAMOND_SHIELD : ShieldsItems.DIAMOND_SHIELD;
            } else if (shieldDescId.contains("netherite")){
                baseShieldItem = isPlated ? ShieldsItems.PLATED_NETHERITE_SHIELD : ShieldsItems.NETHERITE_SHIELD;
            } else {
                baseShieldItem = isPlated ? ShieldsItems.PLATED_SHIELD : Items.SHIELD;
                if (!isPlated) {ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(entries -> entries.addAfter(baseShieldItem, shieldItem));}
            }
            ItemGroupEvents.modifyEntriesEvent(ShieldsItems.CUSTOM_ITEM_GROUP_KEY).register(entries -> entries.addAfter(baseShieldItem, shieldItem));
        }
    }

}
