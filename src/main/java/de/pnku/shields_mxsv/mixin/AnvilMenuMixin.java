package de.pnku.shields_mxsv.mixin;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static de.pnku.shields_mxsv.item.MoreExtraShieldVariantItems.*;
import static dev.imb11.shields.items.ShieldsItems.*;

@Mixin(AnvilMenu.class)
public abstract class AnvilMenuMixin extends ItemCombinerMenu {
    @Shadow
    @Final
    private DataSlot cost;

    @Shadow @Nullable private String itemName;

    protected AnvilMenuMixin(@Nullable MenuType<?> type, int containerId, Inventory playerInventory, ContainerLevelAccess access) {
        super(type, containerId, playerInventory, access);
    }

    /**
     * Modified copy of IMB11's ExtraShields' AnvilMenuMixin:
     * <
     *  Credits to <a href="https://github.com/hiisuuii/infinicore/blob/master/src%2Fmain%2Fjava%2Fhisui%2Finfinicore%2Fmixin%2FInfinicoreMixin.java#L27">Infinicore's Implementation of Anvil Recipes</a>
     *  for the correct mixin target.
     * >
     */
    @Inject(method = "createResult", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/item/ItemStack;isDamageableItem()Z", ordinal = 0), cancellable = true)
    private void inject(CallbackInfo info) {
        // [plating (input2)], [input1, output]

        ItemStack expectedInput1 = this.inputSlots.getItem(0);
        ItemStack expectedPlating = this.inputSlots.getItem(1);

        for (Item shieldItem : more_extra_shields) {
            Item platingItem;
            Item platedShieldItem;
            if (more_iron_shields.containsKey(shieldItem)) {platingItem = SHIELD_PLATING; platedShieldItem = more_iron_shields.get(shieldItem);}
            else if (more_copper_shields.containsKey(shieldItem)) {platingItem = COPPER_SHIELD_PLATING; platedShieldItem = more_copper_shields.get(shieldItem);}
            else if (more_gold_shields.containsKey(shieldItem)) {platingItem = GOLD_SHIELD_PLATING; platedShieldItem = more_gold_shields.get(shieldItem);}
            else if (more_diamond_shields.containsKey(shieldItem)) {platingItem = DIAMOND_SHIELD_PLATING; platedShieldItem = more_diamond_shields.get(shieldItem);}
            else if (more_netherite_shields.containsKey(shieldItem)) {platingItem = NETHERITE_SHIELD_PLATING; platedShieldItem = more_netherite_shields.get(shieldItem);}
            else {platingItem = null; platedShieldItem = null;}
            if (platingItem != null) {
                var input1 = shieldItem;
                var output = platedShieldItem;

                // Check if the input items are the same as the expected items
                if (expectedInput1.getItem() == input1 && expectedPlating.getItem() == platingItem) {
                    this.resultSlots.setItem(0, expectedInput1.transmuteCopy(output));
                    this.itemName = expectedInput1.getHoverName().getString();
                    this.cost.set(1);
                    info.cancel();
                    return;
                }
            }
        }
    }
}
