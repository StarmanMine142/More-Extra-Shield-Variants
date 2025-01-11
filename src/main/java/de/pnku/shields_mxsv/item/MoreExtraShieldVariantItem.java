package de.pnku.shields_mxsv.item;

import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricBannerShieldItem;
import dev.imb11.shields.datagen.providers.ShieldsEnchantmentProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.Enchantment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public class MoreExtraShieldVariantItem extends FabricBannerShieldItem {
    public final String mesvWoodType;
    public final Item repairIngredient;
    public @Nullable ItemStack MIXIN$ITEM_STACK_VALUE = null;
    public @Nullable HolderLookup.RegistryLookup<Enchantment> ENCHANTMENT_LOOKUP = null;

    public MoreExtraShieldVariantItem(String mesvWoodType, Properties properties, int coolDownTicks, int enchantability, Item... repairItems) {
        super(properties, coolDownTicks, enchantability, repairItems);
        this.mesvWoodType = mesvWoodType;
        this.repairIngredient = repairItems[0];
    }

    @Override
    public @NotNull String getDescriptionId(ItemStack stack) {
        DyeColor dyeColor = stack.get(DataComponents.BASE_COLOR);
        if (dyeColor != null) {
            return this.getDescriptionId() + "." + dyeColor.getName();
        }
        return super.getDescriptionId(stack);
    }

    @Override
    public void onDestroyed(ItemEntity entity) {
            super.onDestroyed(entity);
    }

    @Override
    public int getCoolDownTicks() {
        // Check for bracing enchantment, each level decreases cooldown ticks by 10%.
        if (MIXIN$ITEM_STACK_VALUE != null && ENCHANTMENT_LOOKUP != null) {
            var enchantment = ENCHANTMENT_LOOKUP.getOrThrow(ShieldsEnchantmentProvider.BRACING);
            int enchantmentLevel = MIXIN$ITEM_STACK_VALUE.getEnchantments().getLevel(enchantment);

            if (enchantmentLevel > 0) {
                MIXIN$ITEM_STACK_VALUE = null;
                ENCHANTMENT_LOOKUP = null;

                return (int) (super.getCoolDownTicks() * (1 - (0.1 * enchantmentLevel)));
            }

            MIXIN$ITEM_STACK_VALUE = null;
            ENCHANTMENT_LOOKUP = null;
        }

        return super.getCoolDownTicks();
    }

    public String getMaterialModifier(){
        if (this.repairIngredient.equals(Items.COPPER_INGOT)) {return "copper";}
        else if (this.repairIngredient.equals(Items.GOLD_INGOT)) {return "gold";}
        else if (this.repairIngredient.equals(Items.DIAMOND)) {return "diamond";}
        else if (this.repairIngredient.equals(Items.NETHERITE_INGOT)) {return "netherite";}
        else {return "";}
    }

}
