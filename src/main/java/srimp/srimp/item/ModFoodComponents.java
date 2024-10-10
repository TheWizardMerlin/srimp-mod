package srimp.srimp.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent COOKED_SRIMP = new FoodComponent.Builder().nutrition(6).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 200),0.5f).build();

    public static final FoodComponent SRIMP_FRIED_RICE = new FoodComponent.Builder().nutrition(10).saturationModifier(2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 100), 1).build();

    public static final FoodComponent SRIMP_UNFRIED_RICE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.2f)
            .build();

}
