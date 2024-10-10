package srimp.srimp.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import srimp.srimp.Srimp;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static final RegistryEntry<ArmorMaterial> SRIMP_ARMOR_MATERIAL = registerArmorMaterial("srimp", () ->
            new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 1);
                map.put(ArmorItem.Type.CHESTPLATE, 3);
                map.put(ArmorItem.Type.LEGGINGS, 2);
                map.put(ArmorItem.Type.HELMET, 2);
                map.put(ArmorItem.Type.BODY, 3);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA, () -> Ingredient.ofItems(ModItems.SRIMP_ITEM),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Srimp.MOD_ID, "srimp"))), 0, 0));
//"i" is enchantability, "f" is toughness, and "g" is knockback resistance

        public static final RegistryEntry<ArmorMaterial> SRIMP_ALLOY_ARMOR_MATERIAL = registerArmorMaterial("srimp_alloy", () ->
            new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 6);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, () -> Ingredient.ofItems(ModItems.SRIMP_ALLOY),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Srimp.MOD_ID, "srimp_alloy"))), 0, 0.5f));

//"i" is enchantability, "f" is toughness, and "g" is knockback resistance
            public static final RegistryEntry<ArmorMaterial> SRIMPIUM_ARMOR_MATERIAL = registerArmorMaterial("srimpium", () ->
            new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 6);
                map.put(ArmorItem.Type.LEGGINGS, 8);
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }), 5, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.SRIMPIUM),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Srimp.MOD_ID, "srimpium"))), 3.5f, 0.7f));
//"i" is enchantability, "f" is toughness, and "g" is knockback resistance


    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material){
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(Srimp.MOD_ID, name), material.get());
    }
}
