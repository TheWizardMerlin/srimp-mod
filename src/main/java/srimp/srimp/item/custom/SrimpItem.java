package srimp.srimp.item.custom;


import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.*;
import net.minecraft.world.World;

import java.util.List;


public class SrimpItem extends Item {
    public SrimpItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.srimp.srimp_item"));

        super.appendTooltip(stack, context, tooltip, type);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.playSound(SoundEvents.ITEM_HONEY_BOTTLE_DRINK);
        return super.use(world, user, hand);

    }
}

//player.playSound(SoundEvents.ITEM_HONEY_BOTTLE_DRINK);