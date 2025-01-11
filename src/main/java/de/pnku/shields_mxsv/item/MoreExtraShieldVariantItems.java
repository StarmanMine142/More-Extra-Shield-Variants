package de.pnku.shields_mxsv.item;

import de.pnku.lolmsv.MoreShieldVariants;
import de.pnku.shields_mxsv.MoreExtraShieldVariants;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.entity.BannerPatternLayers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MoreExtraShieldVariantItems {

    // Shields
    public static final Item WARPED_SHIELD = new MoreExtraShieldVariantItem("warped", new Item.Properties().durability(337).fireResistant().component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.WARPED_PLANKS);

    public static final Item WARPED_PLATED_SHIELD = new MoreExtraShieldVariantItem("warped", new Item.Properties().durability(420).fireResistant().component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 6 * 20, 9, Items.WARPED_PLANKS);

    public static final Item WARPED_COPPER_SHIELD = new MoreExtraShieldVariantItem("warped", new Item.Properties().durability(240).fireResistant().component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 8 * 20, 9, Items.COPPER_INGOT);

    public static final Item WARPED_COPPER_PLATED_SHIELD = new MoreExtraShieldVariantItem("warped", new Item.Properties().durability(300).fireResistant().component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 10 * 20, 9, Items.COPPER_INGOT);

    public static final Item WARPED_GOLD_SHIELD = new MoreExtraShieldVariantItem("warped", new Item.Properties().durability(451).fireResistant().component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 3 * 20, 9, Items.GOLD_INGOT);

    public static final Item WARPED_GOLD_PLATED_SHIELD = new MoreExtraShieldVariantItem("warped", new Item.Properties().durability(563).fireResistant().component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 4 * 20, 9, Items.GOLD_INGOT);

    public static final Item WARPED_DIAMOND_SHIELD = new MoreExtraShieldVariantItem("warped", new Item.Properties().durability(867).fireResistant().component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 4 * 20, 9, Items.DIAMOND);

    public static final Item WARPED_DIAMOND_PLATED_SHIELD = new MoreExtraShieldVariantItem("warped", new Item.Properties().durability(1083).fireResistant().component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.DIAMOND);

    public static final Item WARPED_NETHERITE_SHIELD = new MoreExtraShieldVariantItem("warped", new Item.Properties().durability(910).fireResistant().component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.NETHERITE_INGOT);

    public static final Item WARPED_NETHERITE_PLATED_SHIELD = new MoreExtraShieldVariantItem("warped", new Item.Properties().durability(1137).fireResistant().component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 6 * 20, 9, Items.NETHERITE_INGOT);


    public static final Item CRIMSON_SHIELD = new MoreExtraShieldVariantItem("crimson", new Item.Properties().durability(337).fireResistant().component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.CRIMSON_PLANKS);

    public static final Item CRIMSON_PLATED_SHIELD = new MoreExtraShieldVariantItem("crimson", new Item.Properties().durability(420).fireResistant().component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 6 * 20, 9, Items.CRIMSON_PLANKS);

    public static final Item CRIMSON_COPPER_SHIELD = new MoreExtraShieldVariantItem("crimson", new Item.Properties().durability(240).fireResistant().component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 8 * 20, 9, Items.COPPER_INGOT);

    public static final Item CRIMSON_COPPER_PLATED_SHIELD = new MoreExtraShieldVariantItem("crimson", new Item.Properties().durability(300).fireResistant().component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 10 * 20, 9, Items.COPPER_INGOT);

    public static final Item CRIMSON_GOLD_SHIELD = new MoreExtraShieldVariantItem("crimson", new Item.Properties().durability(451).fireResistant().component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 3 * 20, 9, Items.GOLD_INGOT);

    public static final Item CRIMSON_GOLD_PLATED_SHIELD = new MoreExtraShieldVariantItem("crimson", new Item.Properties().durability(563).fireResistant().component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 4 * 20, 9, Items.GOLD_INGOT);

    public static final Item CRIMSON_DIAMOND_SHIELD = new MoreExtraShieldVariantItem("crimson", new Item.Properties().durability(867).fireResistant().component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 4 * 20, 9, Items.DIAMOND);

    public static final Item CRIMSON_DIAMOND_PLATED_SHIELD = new MoreExtraShieldVariantItem("crimson", new Item.Properties().durability(1083).fireResistant().component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.DIAMOND);

    public static final Item CRIMSON_NETHERITE_SHIELD = new MoreExtraShieldVariantItem("crimson", new Item.Properties().durability(910).fireResistant().component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.NETHERITE_INGOT);

    public static final Item CRIMSON_NETHERITE_PLATED_SHIELD = new MoreExtraShieldVariantItem("crimson", new Item.Properties().durability(1137).fireResistant().component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 6 * 20, 9, Items.NETHERITE_INGOT);


    public static final Item BAMBOO_SHIELD = new MoreExtraShieldVariantItem("bamboo", new Item.Properties().durability(336).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.BAMBOO_PLANKS);

	public static final Item BAMBOO_PLATED_SHIELD = new MoreExtraShieldVariantItem("bamboo", new Item.Properties().durability(420).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 6 * 20, 9, Items.BAMBOO_PLANKS);

    public static final Item BAMBOO_COPPER_SHIELD = new MoreExtraShieldVariantItem("bamboo", new Item.Properties().durability(240).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 8 * 20, 9, Items.COPPER_INGOT);

    public static final Item BAMBOO_COPPER_PLATED_SHIELD = new MoreExtraShieldVariantItem("bamboo", new Item.Properties().durability(300).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 10 * 20, 9, Items.COPPER_INGOT);

    public static final Item BAMBOO_GOLD_SHIELD = new MoreExtraShieldVariantItem("bamboo", new Item.Properties().durability(451).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 3 * 20, 9, Items.GOLD_INGOT);

    public static final Item BAMBOO_GOLD_PLATED_SHIELD = new MoreExtraShieldVariantItem("bamboo", new Item.Properties().durability(563).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 4 * 20, 9, Items.GOLD_INGOT);

    public static final Item BAMBOO_DIAMOND_SHIELD = new MoreExtraShieldVariantItem("bamboo", new Item.Properties().durability(867).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 4 * 20, 9, Items.DIAMOND);

    public static final Item BAMBOO_DIAMOND_PLATED_SHIELD = new MoreExtraShieldVariantItem("bamboo", new Item.Properties().durability(1083).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.DIAMOND);

    public static final Item BAMBOO_NETHERITE_SHIELD = new MoreExtraShieldVariantItem("bamboo", new Item.Properties().durability(910).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.NETHERITE_INGOT);

    public static final Item BAMBOO_NETHERITE_PLATED_SHIELD = new MoreExtraShieldVariantItem("bamboo", new Item.Properties().durability(1137).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 6 * 20, 9, Items.NETHERITE_INGOT);


    public static final Item CHERRY_SHIELD = new MoreExtraShieldVariantItem("cherry", new Item.Properties().durability(336).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.CHERRY_PLANKS);

	public static final Item CHERRY_PLATED_SHIELD = new MoreExtraShieldVariantItem("cherry", new Item.Properties().durability(420).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 6 * 20, 9, Items.CHERRY_PLANKS);

    public static final Item CHERRY_COPPER_SHIELD = new MoreExtraShieldVariantItem("cherry", new Item.Properties().durability(240).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 8 * 20, 9, Items.COPPER_INGOT);

    public static final Item CHERRY_COPPER_PLATED_SHIELD = new MoreExtraShieldVariantItem("cherry", new Item.Properties().durability(300).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 10 * 20, 9, Items.COPPER_INGOT);

    public static final Item CHERRY_GOLD_SHIELD = new MoreExtraShieldVariantItem("cherry", new Item.Properties().durability(451).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 3 * 20, 9, Items.GOLD_INGOT);

    public static final Item CHERRY_GOLD_PLATED_SHIELD = new MoreExtraShieldVariantItem("cherry", new Item.Properties().durability(563).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 4 * 20, 9, Items.GOLD_INGOT);

    public static final Item CHERRY_DIAMOND_SHIELD = new MoreExtraShieldVariantItem("cherry", new Item.Properties().durability(867).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 4 * 20, 9, Items.DIAMOND);

    public static final Item CHERRY_DIAMOND_PLATED_SHIELD = new MoreExtraShieldVariantItem("cherry", new Item.Properties().durability(1083).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.DIAMOND);

    public static final Item CHERRY_NETHERITE_SHIELD = new MoreExtraShieldVariantItem("cherry", new Item.Properties().durability(910).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.NETHERITE_INGOT);

    public static final Item CHERRY_NETHERITE_PLATED_SHIELD = new MoreExtraShieldVariantItem("cherry", new Item.Properties().durability(1137).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 6 * 20, 9, Items.NETHERITE_INGOT);


    public static final Item MANGROVE_SHIELD = new MoreExtraShieldVariantItem("mangrove", new Item.Properties().durability(336).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.MANGROVE_PLANKS);

	public static final Item MANGROVE_PLATED_SHIELD = new MoreExtraShieldVariantItem("mangrove", new Item.Properties().durability(420).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 6 * 20, 9, Items.MANGROVE_PLANKS);

    public static final Item MANGROVE_COPPER_SHIELD = new MoreExtraShieldVariantItem("mangrove", new Item.Properties().durability(240).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 8 * 20, 9, Items.COPPER_INGOT);

    public static final Item MANGROVE_COPPER_PLATED_SHIELD = new MoreExtraShieldVariantItem("mangrove", new Item.Properties().durability(300).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 10 * 20, 9, Items.COPPER_INGOT);

    public static final Item MANGROVE_GOLD_SHIELD = new MoreExtraShieldVariantItem("mangrove", new Item.Properties().durability(451).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 3 * 20, 9, Items.GOLD_INGOT);

    public static final Item MANGROVE_GOLD_PLATED_SHIELD = new MoreExtraShieldVariantItem("mangrove", new Item.Properties().durability(563).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 4 * 20, 9, Items.GOLD_INGOT);

    public static final Item MANGROVE_DIAMOND_SHIELD = new MoreExtraShieldVariantItem("mangrove", new Item.Properties().durability(867).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 4 * 20, 9, Items.DIAMOND);

    public static final Item MANGROVE_DIAMOND_PLATED_SHIELD = new MoreExtraShieldVariantItem("mangrove", new Item.Properties().durability(1083).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.DIAMOND);

    public static final Item MANGROVE_NETHERITE_SHIELD = new MoreExtraShieldVariantItem("mangrove", new Item.Properties().durability(910).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.NETHERITE_INGOT);

    public static final Item MANGROVE_NETHERITE_PLATED_SHIELD = new MoreExtraShieldVariantItem("mangrove", new Item.Properties().durability(1137).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 6 * 20, 9, Items.NETHERITE_INGOT);


    public static final Item DARK_OAK_SHIELD = new MoreExtraShieldVariantItem("dark_oak", new Item.Properties().durability(336).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.DARK_OAK_PLANKS);

    public static final Item DARK_OAK_PLATED_SHIELD = new MoreExtraShieldVariantItem("dark_oak", new Item.Properties().durability(420).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 6 * 20, 9, Items.DARK_OAK_PLANKS);

    public static final Item DARK_OAK_COPPER_SHIELD = new MoreExtraShieldVariantItem("dark_oak", new Item.Properties().durability(240).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 8 * 20, 9, Items.COPPER_INGOT);

    public static final Item DARK_OAK_COPPER_PLATED_SHIELD = new MoreExtraShieldVariantItem("dark_oak", new Item.Properties().durability(300).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 10 * 20, 9, Items.COPPER_INGOT);

    public static final Item DARK_OAK_GOLD_SHIELD = new MoreExtraShieldVariantItem("dark_oak", new Item.Properties().durability(451).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 3 * 20, 9, Items.GOLD_INGOT);

    public static final Item DARK_OAK_GOLD_PLATED_SHIELD = new MoreExtraShieldVariantItem("dark_oak", new Item.Properties().durability(563).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 4 * 20, 9, Items.GOLD_INGOT);

    public static final Item DARK_OAK_DIAMOND_SHIELD = new MoreExtraShieldVariantItem("dark_oak", new Item.Properties().durability(867).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 4 * 20, 9, Items.DIAMOND);

    public static final Item DARK_OAK_DIAMOND_PLATED_SHIELD = new MoreExtraShieldVariantItem("dark_oak", new Item.Properties().durability(1083).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.DIAMOND);

    public static final Item DARK_OAK_NETHERITE_SHIELD = new MoreExtraShieldVariantItem("dark_oak", new Item.Properties().durability(910).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.NETHERITE_INGOT);

    public static final Item DARK_OAK_NETHERITE_PLATED_SHIELD = new MoreExtraShieldVariantItem("dark_oak", new Item.Properties().durability(1137).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 6 * 20, 9, Items.NETHERITE_INGOT);


    public static final Item ACACIA_SHIELD = new MoreExtraShieldVariantItem("acacia", new Item.Properties().durability(336).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.ACACIA_PLANKS);

    public static final Item ACACIA_PLATED_SHIELD = new MoreExtraShieldVariantItem("acacia", new Item.Properties().durability(420).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 6 * 20, 9, Items.ACACIA_PLANKS);

    public static final Item ACACIA_COPPER_SHIELD = new MoreExtraShieldVariantItem("acacia", new Item.Properties().durability(240).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 8 * 20, 9, Items.COPPER_INGOT);

    public static final Item ACACIA_COPPER_PLATED_SHIELD = new MoreExtraShieldVariantItem("acacia", new Item.Properties().durability(300).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 10 * 20, 9, Items.COPPER_INGOT);

    public static final Item ACACIA_GOLD_SHIELD = new MoreExtraShieldVariantItem("acacia", new Item.Properties().durability(451).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 3 * 20, 9, Items.GOLD_INGOT);

    public static final Item ACACIA_GOLD_PLATED_SHIELD = new MoreExtraShieldVariantItem("acacia", new Item.Properties().durability(563).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 4 * 20, 9, Items.GOLD_INGOT);

    public static final Item ACACIA_DIAMOND_SHIELD = new MoreExtraShieldVariantItem("acacia", new Item.Properties().durability(867).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 4 * 20, 9, Items.DIAMOND);

    public static final Item ACACIA_DIAMOND_PLATED_SHIELD = new MoreExtraShieldVariantItem("acacia", new Item.Properties().durability(1083).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.DIAMOND);

    public static final Item ACACIA_NETHERITE_SHIELD = new MoreExtraShieldVariantItem("acacia", new Item.Properties().durability(910).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.NETHERITE_INGOT);

    public static final Item ACACIA_NETHERITE_PLATED_SHIELD = new MoreExtraShieldVariantItem("acacia", new Item.Properties().durability(1137).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 6 * 20, 9, Items.NETHERITE_INGOT);


    public static final Item JUNGLE_SHIELD = new MoreExtraShieldVariantItem("jungle", new Item.Properties().durability(336).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.JUNGLE_PLANKS);

    public static final Item JUNGLE_PLATED_SHIELD = new MoreExtraShieldVariantItem("jungle", new Item.Properties().durability(420).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 6 * 20, 9, Items.JUNGLE_PLANKS);

    public static final Item JUNGLE_COPPER_SHIELD = new MoreExtraShieldVariantItem("jungle", new Item.Properties().durability(240).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 8 * 20, 9, Items.COPPER_INGOT);

    public static final Item JUNGLE_COPPER_PLATED_SHIELD = new MoreExtraShieldVariantItem("jungle", new Item.Properties().durability(300).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 10 * 20, 9, Items.COPPER_INGOT);

    public static final Item JUNGLE_GOLD_SHIELD = new MoreExtraShieldVariantItem("jungle", new Item.Properties().durability(451).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 3 * 20, 9, Items.GOLD_INGOT);

    public static final Item JUNGLE_GOLD_PLATED_SHIELD = new MoreExtraShieldVariantItem("jungle", new Item.Properties().durability(563).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 4 * 20, 9, Items.GOLD_INGOT);

    public static final Item JUNGLE_DIAMOND_SHIELD = new MoreExtraShieldVariantItem("jungle", new Item.Properties().durability(867).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 4 * 20, 9, Items.DIAMOND);

    public static final Item JUNGLE_DIAMOND_PLATED_SHIELD = new MoreExtraShieldVariantItem("jungle", new Item.Properties().durability(1083).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.DIAMOND);

    public static final Item JUNGLE_NETHERITE_SHIELD = new MoreExtraShieldVariantItem("jungle", new Item.Properties().durability(910).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.NETHERITE_INGOT);

    public static final Item JUNGLE_NETHERITE_PLATED_SHIELD = new MoreExtraShieldVariantItem("jungle", new Item.Properties().durability(1137).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 6 * 20, 9, Items.NETHERITE_INGOT);


    public static final Item BIRCH_SHIELD = new MoreExtraShieldVariantItem("birch", new Item.Properties().durability(336).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.BIRCH_PLANKS);

    public static final Item BIRCH_PLATED_SHIELD = new MoreExtraShieldVariantItem("birch", new Item.Properties().durability(420).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 6 * 20, 9, Items.BIRCH_PLANKS);

    public static final Item BIRCH_COPPER_SHIELD = new MoreExtraShieldVariantItem("birch", new Item.Properties().durability(240).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 8 * 20, 9, Items.COPPER_INGOT);

    public static final Item BIRCH_COPPER_PLATED_SHIELD = new MoreExtraShieldVariantItem("birch", new Item.Properties().durability(300).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 10 * 20, 9, Items.COPPER_INGOT);

    public static final Item BIRCH_GOLD_SHIELD = new MoreExtraShieldVariantItem("birch", new Item.Properties().durability(451).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 3 * 20, 9, Items.GOLD_INGOT);

    public static final Item BIRCH_GOLD_PLATED_SHIELD = new MoreExtraShieldVariantItem("birch", new Item.Properties().durability(563).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 4 * 20, 9, Items.GOLD_INGOT);

    public static final Item BIRCH_DIAMOND_SHIELD = new MoreExtraShieldVariantItem("birch", new Item.Properties().durability(867).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 4 * 20, 9, Items.DIAMOND);

    public static final Item BIRCH_DIAMOND_PLATED_SHIELD = new MoreExtraShieldVariantItem("birch", new Item.Properties().durability(1083).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.DIAMOND);

    public static final Item BIRCH_NETHERITE_SHIELD = new MoreExtraShieldVariantItem("birch", new Item.Properties().durability(910).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.NETHERITE_INGOT);

    public static final Item BIRCH_NETHERITE_PLATED_SHIELD = new MoreExtraShieldVariantItem("birch", new Item.Properties().durability(1137).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 6 * 20, 9, Items.NETHERITE_INGOT);


    public static final Item OAK_SHIELD = new MoreExtraShieldVariantItem("oak", new Item.Properties().durability(336).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.OAK_PLANKS);

	public static final Item OAK_PLATED_SHIELD = new MoreExtraShieldVariantItem("oak", new Item.Properties().durability(420).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 6 * 20, 9, Items.OAK_PLANKS);

    public static final Item OAK_COPPER_SHIELD = new MoreExtraShieldVariantItem("oak", new Item.Properties().durability(240).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 8 * 20, 9, Items.COPPER_INGOT);

    public static final Item OAK_COPPER_PLATED_SHIELD = new MoreExtraShieldVariantItem("oak", new Item.Properties().durability(300).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 10 * 20, 9, Items.COPPER_INGOT);

    public static final Item OAK_GOLD_SHIELD = new MoreExtraShieldVariantItem("oak", new Item.Properties().durability(451).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 3 * 20, 9, Items.GOLD_INGOT);

    public static final Item OAK_GOLD_PLATED_SHIELD = new MoreExtraShieldVariantItem("oak", new Item.Properties().durability(563).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 4 * 20, 9, Items.GOLD_INGOT);

    public static final Item OAK_DIAMOND_SHIELD = new MoreExtraShieldVariantItem("oak", new Item.Properties().durability(867).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 4 * 20, 9, Items.DIAMOND);

    public static final Item OAK_DIAMOND_PLATED_SHIELD = new MoreExtraShieldVariantItem("oak", new Item.Properties().durability(1083).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.DIAMOND);

    public static final Item OAK_NETHERITE_SHIELD = new MoreExtraShieldVariantItem("oak", new Item.Properties().durability(910).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 5 * 20, 9, Items.NETHERITE_INGOT);

    public static final Item OAK_NETHERITE_PLATED_SHIELD = new MoreExtraShieldVariantItem("oak", new Item.Properties().durability(1137).component(DataComponents.BANNER_PATTERNS, BannerPatternLayers.EMPTY), 6 * 20, 9, Items.NETHERITE_INGOT);

    public static final List<Item> more_extra_shields = new ArrayList<>();
    public static final Map<Item, Item> more_iron_shields = new HashMap<>();
    public static final Map<Item, Item> more_copper_shields = new HashMap<>();
    public static final Map<Item, Item> more_gold_shields = new HashMap<>();
    public static final Map<Item, Item> more_diamond_shields = new HashMap<>();
    public static final Map<Item, Item> more_netherite_shields = new HashMap<>();

    public static void registerShieldItems() {
        registerShieldVariantItem(WARPED_SHIELD, WARPED_PLATED_SHIELD);
        registerShieldVariantItem(CRIMSON_SHIELD, CRIMSON_PLATED_SHIELD);
        registerShieldVariantItem(BAMBOO_SHIELD, BAMBOO_PLATED_SHIELD);
        registerShieldVariantItem(CHERRY_SHIELD, CHERRY_PLATED_SHIELD);
        registerShieldVariantItem(MANGROVE_SHIELD, MANGROVE_PLATED_SHIELD);
        registerShieldVariantItem(DARK_OAK_SHIELD, DARK_OAK_PLATED_SHIELD);
        registerShieldVariantItem(ACACIA_SHIELD, ACACIA_PLATED_SHIELD);
        registerShieldVariantItem(JUNGLE_SHIELD, JUNGLE_PLATED_SHIELD);
        registerShieldVariantItem(BIRCH_SHIELD, BIRCH_PLATED_SHIELD);
        registerShieldVariantItem(OAK_SHIELD, OAK_PLATED_SHIELD);

        registerExtraShieldVariantItem(WARPED_COPPER_SHIELD, WARPED_COPPER_PLATED_SHIELD);
        registerExtraShieldVariantItem(CRIMSON_COPPER_SHIELD, CRIMSON_COPPER_PLATED_SHIELD);
        registerExtraShieldVariantItem(ACACIA_COPPER_SHIELD, ACACIA_COPPER_PLATED_SHIELD);
        registerExtraShieldVariantItem(BAMBOO_COPPER_SHIELD, BAMBOO_COPPER_PLATED_SHIELD);
        registerExtraShieldVariantItem(CHERRY_COPPER_SHIELD, CHERRY_COPPER_PLATED_SHIELD);
        registerExtraShieldVariantItem(MANGROVE_COPPER_SHIELD, MANGROVE_COPPER_PLATED_SHIELD);
        registerExtraShieldVariantItem(DARK_OAK_COPPER_SHIELD, DARK_OAK_COPPER_PLATED_SHIELD);
        registerExtraShieldVariantItem(JUNGLE_COPPER_SHIELD, JUNGLE_COPPER_PLATED_SHIELD);
        registerExtraShieldVariantItem(BIRCH_COPPER_SHIELD, BIRCH_COPPER_PLATED_SHIELD);
        registerExtraShieldVariantItem(OAK_COPPER_SHIELD, OAK_COPPER_PLATED_SHIELD);

        registerExtraShieldVariantItem(WARPED_GOLD_SHIELD, WARPED_GOLD_PLATED_SHIELD);
        registerExtraShieldVariantItem(CRIMSON_GOLD_SHIELD, CRIMSON_GOLD_PLATED_SHIELD);
        registerExtraShieldVariantItem(ACACIA_GOLD_SHIELD, ACACIA_GOLD_PLATED_SHIELD);
        registerExtraShieldVariantItem(BAMBOO_GOLD_SHIELD, BAMBOO_GOLD_PLATED_SHIELD);
        registerExtraShieldVariantItem(CHERRY_GOLD_SHIELD, CHERRY_GOLD_PLATED_SHIELD);
        registerExtraShieldVariantItem(MANGROVE_GOLD_SHIELD, MANGROVE_GOLD_PLATED_SHIELD);
        registerExtraShieldVariantItem(DARK_OAK_GOLD_SHIELD, DARK_OAK_GOLD_PLATED_SHIELD);
        registerExtraShieldVariantItem(JUNGLE_GOLD_SHIELD, JUNGLE_GOLD_PLATED_SHIELD);
        registerExtraShieldVariantItem(BIRCH_GOLD_SHIELD, BIRCH_GOLD_PLATED_SHIELD);
        registerExtraShieldVariantItem(OAK_GOLD_SHIELD, OAK_GOLD_PLATED_SHIELD);

        registerExtraShieldVariantItem(WARPED_DIAMOND_SHIELD, WARPED_DIAMOND_PLATED_SHIELD);
        registerExtraShieldVariantItem(CRIMSON_DIAMOND_SHIELD, CRIMSON_DIAMOND_PLATED_SHIELD);
        registerExtraShieldVariantItem(ACACIA_DIAMOND_SHIELD, ACACIA_DIAMOND_PLATED_SHIELD);
        registerExtraShieldVariantItem(BAMBOO_DIAMOND_SHIELD, BAMBOO_DIAMOND_PLATED_SHIELD);
        registerExtraShieldVariantItem(CHERRY_DIAMOND_SHIELD, CHERRY_DIAMOND_PLATED_SHIELD);
        registerExtraShieldVariantItem(MANGROVE_DIAMOND_SHIELD, MANGROVE_DIAMOND_PLATED_SHIELD);
        registerExtraShieldVariantItem(DARK_OAK_DIAMOND_SHIELD, DARK_OAK_DIAMOND_PLATED_SHIELD);
        registerExtraShieldVariantItem(JUNGLE_DIAMOND_SHIELD, JUNGLE_DIAMOND_PLATED_SHIELD);
        registerExtraShieldVariantItem(BIRCH_DIAMOND_SHIELD, BIRCH_DIAMOND_PLATED_SHIELD);
        registerExtraShieldVariantItem(OAK_DIAMOND_SHIELD, OAK_DIAMOND_PLATED_SHIELD);

        registerExtraShieldVariantItem(WARPED_NETHERITE_SHIELD, WARPED_NETHERITE_PLATED_SHIELD);
        registerExtraShieldVariantItem(CRIMSON_NETHERITE_SHIELD, CRIMSON_NETHERITE_PLATED_SHIELD);
        registerExtraShieldVariantItem(ACACIA_NETHERITE_SHIELD, ACACIA_NETHERITE_PLATED_SHIELD);
        registerExtraShieldVariantItem(BAMBOO_NETHERITE_SHIELD, BAMBOO_NETHERITE_PLATED_SHIELD);
        registerExtraShieldVariantItem(CHERRY_NETHERITE_SHIELD, CHERRY_NETHERITE_PLATED_SHIELD);
        registerExtraShieldVariantItem(MANGROVE_NETHERITE_SHIELD, MANGROVE_NETHERITE_PLATED_SHIELD);
        registerExtraShieldVariantItem(DARK_OAK_NETHERITE_SHIELD, DARK_OAK_NETHERITE_PLATED_SHIELD);
        registerExtraShieldVariantItem(JUNGLE_NETHERITE_SHIELD, JUNGLE_NETHERITE_PLATED_SHIELD);
        registerExtraShieldVariantItem(BIRCH_NETHERITE_SHIELD, BIRCH_NETHERITE_PLATED_SHIELD);
        registerExtraShieldVariantItem(OAK_NETHERITE_SHIELD, OAK_NETHERITE_PLATED_SHIELD);
    }

    private static void registerShieldVariantItem(Item shieldItem, Item platedShieldItem) {
        registerPlating(shieldItem, platedShieldItem);
        String shieldName = ((MoreExtraShieldVariantItem) shieldItem).mesvWoodType + "_shield";
        String platedShieldName = ((MoreExtraShieldVariantItem) platedShieldItem).mesvWoodType + "_plated_shield";
        // Register under lolmsv modid for more efficient use of dependency
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.tryBuild(MoreShieldVariants.MOD_ID, shieldName), shieldItem);
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.tryBuild(MoreExtraShieldVariants.MOD_ID, platedShieldName), platedShieldItem);
        more_extra_shields.add(shieldItem);
        more_extra_shields.add(platedShieldItem);
    }

    private static void registerExtraShieldVariantItem(Item shieldItem, Item platedShieldItem) {
        String materialModifier = registerPlating(shieldItem, platedShieldItem);
        String shieldName = ((MoreExtraShieldVariantItem) shieldItem).mesvWoodType + materialModifier + "_shield";
        String platedShieldName = ((MoreExtraShieldVariantItem) platedShieldItem).mesvWoodType + materialModifier + "_plated_shield";
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.tryBuild(MoreExtraShieldVariants.MOD_ID, shieldName), shieldItem);
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.tryBuild(MoreExtraShieldVariants.MOD_ID, platedShieldName), platedShieldItem);
        more_extra_shields.add(shieldItem);
        more_extra_shields.add(platedShieldItem);
    }

    private static String registerPlating(Item shieldItem, Item platedShieldItem) {
        String materialModifierV = ((MoreExtraShieldVariantItem) shieldItem).getMaterialModifier();
        String materialModifier = !materialModifierV.isEmpty() ? "_" + materialModifierV : "";
        switch (materialModifierV){
            case "copper" -> more_copper_shields.put(shieldItem, platedShieldItem);
            case "gold" -> more_gold_shields.put(shieldItem, platedShieldItem);
            case "diamond" -> more_diamond_shields.put(shieldItem, platedShieldItem);
            case "netherite" -> more_netherite_shields.put(shieldItem, platedShieldItem);
            default -> more_iron_shields.put(shieldItem, platedShieldItem);
        }
        return materialModifier;
    }
}
