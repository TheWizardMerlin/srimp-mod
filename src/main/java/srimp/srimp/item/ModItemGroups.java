package srimp.srimp.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import srimp.srimp.Srimp;
import srimp.srimp.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup SRIMP_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Srimp.MOD_ID, "srimp_items"),
            FabricItemGroup.builder().icon(() ->new ItemStack(ModItems.SRIMP_ITEM))
                    .displayName(Text.translatable("itemgroup.srimp.srimp_items"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.SRIMP_ITEM);
                        entries.add(ModItems.COOKED_SRIMP);
                        entries.add(ModItems.COOKED_COOKED_SRIMP);
                        entries.add(ModItems.ASH);
                        entries.add(ModItems.SRIMP_UNFRIED_RICE);
                        entries.add(ModItems.SRIMP_FRIED_RICE);


                        entries.add(ModBlocks.SRIMP_BLOCK);
                        entries.add(ModBlocks.COOKED_SRIMP_BLOCK);
                        entries.add(ModBlocks.COOKED_COOKED_SRIMP_BLOCK);



                        entries.add(ModBlocks.SRIMP_STAIRS);
                        entries.add(ModBlocks.SRIMP_SLAB);
                        entries.add(ModBlocks.SRIMP_DOOR);
                        entries.add(ModBlocks.SRIMP_TRAPDOOR);
                        entries.add(ModBlocks.SRIMP_FENCE);
                        entries.add(ModBlocks.SRIMP_FENCE_GATE);
                        entries.add(ModBlocks.SRIMP_WALL);
                        entries.add(ModBlocks.SRIMP_PRESSURE_PLATE);
                        entries.add(ModBlocks.SRIMP_BUTTON);

                        entries.add(ModBlocks.SRIMP_LAMP);

                        entries.add(ModItems.SRIMP_SWORD);
                        entries.add(ModItems.SRIMP_PICKAXE);
                        entries.add(ModItems.SRIMP_SHOVEL);
                        entries.add(ModItems.SRIMP_AXE);
                        entries.add(ModItems.SRIMP_HOE);

                        entries.add(ModItems.SRIMP_HAMMER_TEST);

                        entries.add(ModItems.SRIMP_HELMET);
                        entries.add(ModItems.SRIMP_CHESTPLATE);
                        entries.add(ModItems.SRIMP_LEGGINGS);
                        entries.add(ModItems.SRIMP_BOOTS);

                        entries.add(ModItems.SRIMP_SPAWN_EGG);

                    }).build());



    public static void registerItemgroups() {
        Srimp.LOGGER.info("Registering Item Groups for " + Srimp.MOD_ID);
    }
}
