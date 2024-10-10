package srimp.srimp.block;

import com.sun.source.tree.LambdaExpressionTree;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
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
import srimp.srimp.block.custom.SrimpLampBlock;

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


    public static final Block SRIMP_LAMP = registerBlock("srimp_lamp",
            new SrimpLampBlock(AbstractBlock.Settings.create()
                    .breakInstantly().luminance(state -> state.get(SrimpLampBlock.CLICKED) ? 15 : 0)
                    .sounds(BlockSoundGroup.HONEY)));


    public static final Block SRIMP_STAIRS = registerBlock("srimp_stairs", new StairsBlock(ModBlocks.SRIMP_BLOCK.getDefaultState(),
            AbstractBlock.Settings.create().breakInstantly().sounds(BlockSoundGroup.HONEY)));
    public static final Block SRIMP_SLAB = registerBlock("srimp_slab", new SlabBlock
            (AbstractBlock.Settings.create().breakInstantly().sounds(BlockSoundGroup.HONEY)));

    public static final Block SRIMP_BUTTON = registerBlock("srimp_button", new ButtonBlock(BlockSetType.WARPED, 6,
            AbstractBlock.Settings.create().breakInstantly().sounds(BlockSoundGroup.HONEY)));
    public static final Block SRIMP_PRESSURE_PLATE = registerBlock("srimp_pressure_plate",
            new PressurePlateBlock(BlockSetType.WARPED,
            AbstractBlock.Settings.create().breakInstantly().sounds(BlockSoundGroup.HONEY)));

    public static final Block SRIMP_FENCE = registerBlock("srimp_fence",
            new FenceBlock(AbstractBlock.Settings.create().breakInstantly().sounds(BlockSoundGroup.HONEY)));
    public static final Block SRIMP_FENCE_GATE = registerBlock("srimp_fence_gate",
            new FenceGateBlock(WoodType.WARPED,
            AbstractBlock.Settings.create().breakInstantly().sounds(BlockSoundGroup.HONEY)));
    public static final Block SRIMP_WALL = registerBlock("srimp_wall",
            new WallBlock(AbstractBlock.Settings.create().breakInstantly().sounds(BlockSoundGroup.HONEY)));

     public static final Block SRIMP_DOOR = registerBlock("srimp_door",
             new DoorBlock(BlockSetType.WARPED,
            AbstractBlock.Settings.create().breakInstantly().nonOpaque().sounds(BlockSoundGroup.HONEY)));
    public static final Block SRIMP_TRAPDOOR = registerBlock("srimp_trapdoor",
            new TrapdoorBlock(BlockSetType.WARPED,
            AbstractBlock.Settings.create().breakInstantly().nonOpaque().sounds(BlockSoundGroup.HONEY)));





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
