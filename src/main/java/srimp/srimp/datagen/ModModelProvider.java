package srimp.srimp.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import srimp.srimp.block.ModBlocks;
import srimp.srimp.block.custom.SrimpLampBlock;
import srimp.srimp.item.ModItems;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool srimpBlockPool =
                blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SRIMP_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COOKED_SRIMP_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COOKED_COOKED_SRIMP_BLOCK);


        srimpBlockPool.stairs(ModBlocks.SRIMP_STAIRS);
        srimpBlockPool.slab(ModBlocks.SRIMP_SLAB);
        srimpBlockPool.wall(ModBlocks.SRIMP_WALL);
        srimpBlockPool.fence(ModBlocks.SRIMP_FENCE);
        srimpBlockPool.fenceGate(ModBlocks.SRIMP_FENCE_GATE);
        srimpBlockPool.button(ModBlocks.SRIMP_BUTTON);
        srimpBlockPool.pressurePlate(ModBlocks.SRIMP_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.SRIMP_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.SRIMP_TRAPDOOR);


        Identifier lampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.SRIMP_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.SRIMP_LAMP, "_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.SRIMP_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(SrimpLampBlock.CLICKED, lampOnIdentifier, lampOffIdentifier)));

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SRIMP_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_SRIMP, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_COOKED_SRIMP, Models.GENERATED);
        itemModelGenerator.register(ModItems.SRIMP_FRIED_RICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SRIMP_UNFRIED_RICE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ASH, Models.GENERATED);

        itemModelGenerator.register(ModItems.SRIMP_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SRIMP_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SRIMP_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SRIMP_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SRIMP_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SRIMP_HAMMER_TEST, Models.HANDHELD);
        
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SRIMP_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SRIMP_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SRIMP_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SRIMP_BOOTS));



    }
}
