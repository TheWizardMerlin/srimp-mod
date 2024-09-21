package srimp.srimp.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import srimp.srimp.block.ModBlocks;
import srimp.srimp.item.ModItems;
import srimp.srimp.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.SRIMP_ITEMS)
                .add(ModItems.SRIMP_ITEM)
                .add(ModItems.COOKED_SRIMP)
                .add(ModItems.COOKED_COOKED_SRIMP);

    }
}
