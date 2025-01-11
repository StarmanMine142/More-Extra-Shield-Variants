package de.pnku.shields_mxsv.datagen;

import de.pnku.shields_mxsv.item.MoreExtraShieldVariantItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import static de.pnku.shields_mxsv.item.MoreExtraShieldVariantItems.*;

public class MoreExtraShieldVariantRecipeGenerator extends FabricRecipeProvider {
    public MoreExtraShieldVariantRecipeGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput recipeOutput) {
        List<Item> unplated_extra_shields = Stream.of(
                more_copper_shields.keySet(),
                more_gold_shields.keySet(),
                more_diamond_shields.keySet(),
                more_netherite_shields.keySet()
        ).flatMap(Set::stream).toList();
        for (Item shieldItem : unplated_extra_shields) {
            Item planksItem = getPlanks(((MoreExtraShieldVariantItem) shieldItem).mesvWoodType);
            Item craftingIngredient = ((MoreExtraShieldVariantItem) shieldItem).repairIngredient;
            String shieldMaterialName = ((MoreExtraShieldVariantItem) shieldItem).repairIngredient.getDescriptionId().replace("item.minecraft.", "").replace("_ingot", "");
            if (craftingIngredient.equals(Items.COPPER_INGOT)) {
                ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, shieldItem)
                        .define('C', craftingIngredient)
                        .define('H', Items.HONEYCOMB)
                        .define('W', planksItem)
                        .pattern("WCW")
                        .pattern("WHW")
                        .pattern(" W ")
                        .group(shieldMaterialName + "_shield")
                        .unlockedBy("has_planks", has(planksItem))
                        .save(recipeOutput);
            } else if (!craftingIngredient.equals(Items.NETHERITE_INGOT)){
                ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, shieldItem)
                        .define('C', craftingIngredient)
                        .define('W', planksItem)
                        .pattern("WCW")
                        .pattern("WWW")
                        .pattern(" W ")
                        .group(shieldMaterialName + "_shield")
                        .unlockedBy("has_planks", has(planksItem))
                        .save(recipeOutput);
            } else {
                List<Item> diamondShieldsList = new ArrayList<>(more_diamond_shields.keySet());
                List<Item> netheriteShieldsList = new ArrayList<>(more_netherite_shields.keySet());
                diamondShieldsList.sort(Comparator.comparing(Item::getDescriptionId));
                netheriteShieldsList.sort(Comparator.comparing(Item::getDescriptionId));

                int index = netheriteShieldsList.indexOf(shieldItem);
                Item diamondShield = diamondShieldsList.get(index);

                netheriteSmithing(recipeOutput, diamondShield, RecipeCategory.COMBAT, shieldItem);
            }
        }
    }

    public Item getPlanks(String woodType){
        switch (woodType){
            case "acacia" -> {return Items.ACACIA_PLANKS;}
            case "birch" -> {return Items.BIRCH_PLANKS;}
            case "bamboo" -> {return Items.BAMBOO_PLANKS;}
            case "cherry" -> {return Items.CHERRY_PLANKS;}
            case "crimson" -> {return Items.CRIMSON_PLANKS;}
            case "dark_oak" -> {return Items.DARK_OAK_PLANKS;}
            case "jungle" -> {return Items.JUNGLE_PLANKS;}
            case "mangrove" -> {return Items.MANGROVE_PLANKS;}
            case "oak" -> {return Items.OAK_PLANKS;}
            case "warped" -> {return Items.WARPED_PLANKS;}
            default -> throw new RuntimeException("Unknown woodType: " + woodType);
        }
    }
}
