package de.pnku.shields_mxsv.mixin.client;

import java.util.List;
import java.util.Objects;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import de.pnku.lolmsv.MoreShieldVariants;
import de.pnku.shields_mxsv.MoreExtraShieldVariants;
import de.pnku.lolmsv.config.MoreShieldVariantsConfig;
import de.pnku.shields_mxsv.item.MoreExtraShieldVariantItem;
import net.minecraft.client.model.ShieldModel;
import net.minecraft.client.renderer.blockentity.BannerRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.resources.model.Material;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManagerReloadListener;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.entity.BannerPatternLayers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import static de.pnku.shields_mxsv.item.MoreExtraShieldVariantItems.more_iron_shields;
import static de.pnku.shields_mxsv.item.tag.MoreExtraShieldVariantItemTags.*;


@Mixin(BlockEntityWithoutLevelRenderer.class)
@Environment(value = EnvType.CLIENT)
public abstract class BlockEntityWithoutLevelRendererMixin implements ResourceManagerReloadListener {
    @Shadow private ShieldModel shieldModel;
    @Unique
    private List<String> textureConfigCheck = MoreShieldVariantsConfig.textureConfigList;

    @Inject(method = "renderByItem", at = @At("TAIL"))
    private void mxsv$injectedRenderByItem(ItemStack stack, ItemDisplayContext context, PoseStack poseStack, MultiBufferSource source, int light, int overlay, CallbackInfo cbi) {
        Item shieldItem = stack.getItem();
        boolean isVariant = stack.is(EXTRA_SHIELD_VARIANTS);
        if (isVariant || (stack.is(EXTRA_SPRUCE_SHIELDS) && textureConfigCheck.contains("spruce"))) {
            BannerPatternLayers bannerPatternsComponent = (BannerPatternLayers)stack.getOrDefault(DataComponents.BANNER_PATTERNS, (Object)BannerPatternLayers.EMPTY);
            String woodType = isVariant ? ((MoreExtraShieldVariantItem) shieldItem).mesvWoodType : "spruce";
            DyeColor shieldBannerDyeColor = stack.get(DataComponents.BASE_COLOR);
            boolean hasBanner = !bannerPatternsComponent.layers().isEmpty() || shieldBannerDyeColor != null;
            poseStack.pushPose();
            poseStack.scale(1.0f, -1.0f, -1.0f);
            boolean usesVanillaTexture = textureConfigCheck.contains(woodType);
            String vanillaTextureModifier = usesVanillaTexture ? "" : "_vanilla" ;
            String namespace = more_iron_shields.containsKey(shieldItem) ? MoreShieldVariants.MOD_ID : MoreExtraShieldVariants.MOD_ID;
            String path = "entity/shield/" + BuiltInRegistries.ITEM.getKey(shieldItem).getPath() + vanillaTextureModifier + "_base";
            Material shieldBaseTextureLocation = new Material(Sheets.SHIELD_SHEET, ResourceLocation.tryBuild(namespace, path));
            Material noPatternShieldBaseTextureLocation = new Material(Sheets.SHIELD_SHEET, ResourceLocation.tryBuild(namespace, path + "_nopattern"));
            Material spriteIdentifier = hasBanner ? shieldBaseTextureLocation : noPatternShieldBaseTextureLocation;
            VertexConsumer vertexConsumer = spriteIdentifier.sprite().wrap(ItemRenderer.getFoilBufferDirect(source, this.shieldModel.renderType(spriteIdentifier.atlasLocation()), true, stack.hasFoil()));
            this.shieldModel.handle().render(poseStack, vertexConsumer, light, overlay);
            if (hasBanner) {
                BannerRenderer.renderPatterns(poseStack, source, light, overlay, this.shieldModel.plate(), spriteIdentifier, false, Objects.requireNonNullElse(shieldBannerDyeColor, DyeColor.WHITE), bannerPatternsComponent, stack.hasFoil());
            }
            else {
                this.shieldModel.plate().render(poseStack, vertexConsumer, light, overlay);
            }
            poseStack.popPose();
        }
    }
}
