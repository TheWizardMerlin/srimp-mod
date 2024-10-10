package srimp.srimp.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.ai.brain.task.BreezeShootIfStuckTask;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import srimp.srimp.Srimp;
import srimp.srimp.entity.SrimpEntity;
import srimp.srimp.item.custom.HammerItem;
import srimp.srimp.item.custom.SrimpItem;

import java.util.List;

public class ModItems {

    public static final Item SRIMP_ITEM = registerItem("srimp_item", new SrimpItem(new Item.Settings()));

    public static final Item ASH = registerItem("ash", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            super.appendTooltip(stack, context, tooltip, type); {
                tooltip.add(Text.translatable("tooltip.srimp.ash"));

            }
        }
    });

    public static final Item SRIMP_UNFRIED_RICE = registerItem("srimp_unfried_rice", new Item(new Item.Settings().food(ModFoodComponents.SRIMP_UNFRIED_RICE)));

    public static final Item SRIMP_FRIED_RICE = registerItem("srimp_fried_rice", new Item(new Item.Settings().food(ModFoodComponents.SRIMP_FRIED_RICE)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.srimp.srimp_fried_rice"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

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

    public static final Item SRIMP_SWORD = registerItem("srimp_sword", new
            SwordItem(ModToolMaterials.SRIMP, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SRIMP,
                    3, -2.4f))));

    public static final Item SRIMP_PICKAXE = registerItem("srimp_pickaxe",
            new PickaxeItem(ModToolMaterials.SRIMP, new Item.Settings()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.SRIMP,
                    1, -2.8f))));

    public static final Item SRIMP_SHOVEL = registerItem("srimp_shovel", new
            ShovelItem(ModToolMaterials.SRIMP, new Item.Settings()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.SRIMP,
                    1.5f, -3.0f))));

    public static final Item SRIMP_AXE = registerItem("srimp_axe", new
            AxeItem(ModToolMaterials.SRIMP, new Item.Settings()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.SRIMP,
                    6, -3.2f))));

    public static final Item SRIMP_HOE = registerItem("srimp_hoe", new
            HoeItem(ModToolMaterials.SRIMP, new Item.Settings()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.SRIMP,
                    0, -3.0f))));


    public static final Item SRIMP_HAMMER_TEST = registerItem("srimp_hammer_test",
            new HammerItem(ModToolMaterials.SRIMP, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.SRIMP,
                            8, -3.0f))){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.srimp.srimp_hammer_test"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });


    public static final Item SRIMP_HELMET = registerItem("srimp_helmet",
            new ArmorItem(ModArmorMaterials.SRIMP_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))
            ));
    public static final Item SRIMP_CHESTPLATE = registerItem("srimp_chestplate",
            new ArmorItem(ModArmorMaterials.SRIMP_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))
            ));
    public static final Item SRIMP_LEGGINGS = registerItem("srimp_leggings",
            new ArmorItem(ModArmorMaterials.SRIMP_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))
            ));
    public static final Item SRIMP_BOOTS = registerItem("srimp_boots",
            new ArmorItem(ModArmorMaterials.SRIMP_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))
            ));

    public static final Item SRIMP_ALLOY = registerItem("srimp_alloy", new Item(new Item.Settings()));
    public static final Item SRIMPIUM = registerItem("srimpium", new Item(new Item.Settings()));


    public static final Item SRIMP_SPAWN_EGG =registerItem("srimp_spawn_egg",
            new SpawnEggItem(Srimp.SRIMP_ENTITY, 0xffaa98, 0xf59eea, new Item.Settings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Srimp.MOD_ID, name), item);
    }
    public static void registerModItems(){
        Srimp.LOGGER.info("Registering Mod Items for" + Srimp.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(COOKED_SRIMP);
            entries.add(SRIMP_FRIED_RICE);
        });
    }
}
