package de.pnku.shields_mxsv.item;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import static de.pnku.shields_mxsv.item.MoreExtraShieldVariantItems.more_extra_shields;


@Environment(value = EnvType.CLIENT)
public class MoreExtraShieldVariantModelPredicateProvider {
    
    
    public static void registerMxsvItemModelPredicates() {
        for (Item shieldItem : more_extra_shields){
            registerShield(shieldItem);
        }
        
    }

    private static void registerShield(Item shield) {
        ItemProperties.register(shield, ResourceLocation.parse("blocking"),
            (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0f : 0.0f);
    }

}
