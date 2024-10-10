package srimp.srimp.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import srimp.srimp.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SRIMP_BLOCK);
        addDrop(ModBlocks.COOKED_SRIMP_BLOCK);
        addDrop(ModBlocks.COOKED_COOKED_SRIMP_BLOCK);

        addDrop(ModBlocks.SRIMP_FENCE);
        addDrop(ModBlocks.SRIMP_FENCE_GATE);
        addDrop(ModBlocks.SRIMP_DOOR, doorDrops(ModBlocks.SRIMP_DOOR));
        addDrop(ModBlocks.SRIMP_TRAPDOOR);
        addDrop(ModBlocks.SRIMP_BUTTON);
        addDrop(ModBlocks.SRIMP_PRESSURE_PLATE);
        addDrop(ModBlocks.SRIMP_STAIRS);
        addDrop(ModBlocks.SRIMP_WALL);
        addDrop(ModBlocks.SRIMP_LAMP);

        addDrop(ModBlocks.SRIMP_SLAB, slabDrops(ModBlocks.SRIMP_SLAB));

    }
}
