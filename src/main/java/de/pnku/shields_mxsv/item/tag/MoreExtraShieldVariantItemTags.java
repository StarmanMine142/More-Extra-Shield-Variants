package de.pnku.shields_mxsv.item.tag;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import de.pnku.shields_mxsv.MoreExtraShieldVariants;


public class MoreExtraShieldVariantItemTags {
    public static final TagKey<Item> EXTRA_SHIELD_VARIANTS = TagKey.create(Registries.ITEM, ResourceLocation.tryBuild(MoreExtraShieldVariants.MOD_ID, "extra_shield_variants"));
    public static final TagKey<Item> EXTRA_SPRUCE_SHIELDS = TagKey.create(Registries.ITEM, ResourceLocation.tryBuild(MoreExtraShieldVariants.MOD_ID, "extra_spruce_shields"));
}
