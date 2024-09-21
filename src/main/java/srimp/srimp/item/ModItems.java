package srimp.srimp.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.ai.brain.task.BreezeShootIfStuckTask;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import srimp.srimp.Srimp;
import srimp.srimp.item.custom.SrimpItem;

import java.util.List;

public class ModItems {

    public static final Item SRIMP_ITEM = registerItem("srimp_item", new SrimpItem(new Item.Settings()));
    public static final Item COOKED_SRIMP = registerItem("cooked_srimp", new Item(new Item.Settings().food(ModFoodComponents.COOKED_SRIMP)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.srimp.cooked_srimp"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item COOKED_COOKED_SRIMP = registerItem("cooked_cooked_srimp", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.srimp.cooked_cooked_srimp"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Srimp.MOD_ID, name), item);
    }
    public static void registerModItems(){
        Srimp.LOGGER.info("Registering Mod Items for" + Srimp.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(SRIMP_ITEM);
            entries.add(COOKED_SRIMP);
        });
    }
}
