package srimp.srimp.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import srimp.srimp.block.ModBlocks;
import srimp.srimp.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.COOKED_COOKED_SRIMP_BLOCK);


        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.SRIMP_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.SRIMP_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.SRIMP_WALL);

        getOrCreateTagBuilder(BlockTags.DOORS).add(ModBlocks.SRIMP_DOOR);
        getOrCreateTagBuilder(BlockTags.TRAPDOORS).add(ModBlocks.SRIMP_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.COOKED_COOKED_SRIMP_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_SRIMP_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);







    }
}
