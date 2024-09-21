package srimp.srimp.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import srimp.srimp.block.ModBlocks;
import srimp.srimp.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SRIMP_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COOKED_SRIMP_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COOKED_COOKED_SRIMP_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SRIMP_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_SRIMP, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_COOKED_SRIMP, Models.GENERATED);

    }
}
