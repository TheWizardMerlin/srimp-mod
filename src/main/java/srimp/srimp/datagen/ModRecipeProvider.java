package srimp.srimp.datagen;

import com.google.common.collect.Lists;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Util;
import org.intellij.lang.annotations.Identifier;
import srimp.srimp.block.ModBlocks;
import srimp.srimp.item.ModItems;


import java.util.List;
import java.util.concurrent.CompletableFuture;



public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }



    @Override
    public void generate(RecipeExporter exporter) {



        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SRIMP_ITEM, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SRIMP_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COOKED_SRIMP, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COOKED_SRIMP_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COOKED_COOKED_SRIMP, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COOKED_COOKED_SRIMP_BLOCK);








    }
}
