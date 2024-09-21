package srimp.srimp.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import srimp.srimp.block.ModBlocks;
import srimp.srimp.item.ModItems;


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

        offerCompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SRIMP_BLOCK, ModItems.SRIMP_ITEM);
        offerCompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COOKED_SRIMP_BLOCK, ModItems.COOKED_SRIMP);
        offerCompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COOKED_COOKED_SRIMP_BLOCK, ModItems.COOKED_COOKED_SRIMP);



    }
}
