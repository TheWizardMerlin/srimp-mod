package srimp.srimp.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent COOKED_SRIMP = new FoodComponent.Builder().nutrition(10).saturationModifier(1.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 200),0.5f).build();

}
