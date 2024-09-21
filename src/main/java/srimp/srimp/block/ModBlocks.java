package srimp.srimp.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import srimp.srimp.Srimp;

import java.util.List;

public class ModBlocks {
    public static final Block SRIMP_BLOCK = registerBlock("srimp_block",
            new Block(AbstractBlock.Settings.create().breakInstantly().sounds(BlockSoundGroup.HONEY)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.srimp.srimp_block"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            });

    public static final Block COOKED_SRIMP_BLOCK = registerBlock("cooked_srimp_block",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.SPONGE)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.srimp.cooked_srimp_block"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            });

    public static final Block COOKED_COOKED_SRIMP_BLOCK = registerBlock("cooked_cooked_srimp_block",
            new Block(AbstractBlock.Settings.create().requiresTool().strength(3f).sounds(BlockSoundGroup.BASALT)){
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.srimp.cooked_cooked_srimp_block"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            });




    private static Block registerBlock (String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Srimp.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Srimp.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Srimp.LOGGER.info("Registering mod blocks  " + Srimp.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.SRIMP_BLOCK);
        });
    }
}
