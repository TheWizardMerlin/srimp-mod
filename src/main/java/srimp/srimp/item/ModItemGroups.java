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
                        entries.add(ModBlocks.SRIMP_BLOCK);
                        entries.add(ModBlocks.COOKED_SRIMP_BLOCK);
                        entries.add(ModBlocks.COOKED_COOKED_SRIMP_BLOCK);
                        entries.add(ModItems.COOKED_SRIMP);
                        entries.add(ModItems.COOKED_COOKED_SRIMP);

                    }).build());



    public static void registerItemgroups() {
        Srimp.LOGGER.info("Registering Item Groups for " + Srimp.MOD_ID);
    }
}
