package srimp.srimp.entity;

import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.brain.Activity;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.WaterCreatureEntity;
import net.minecraft.entity.passive.FishEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import srimp.srimp.item.ModItems;
import srimp.srimp.sound.ModSounds;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SrimpEntity extends FishEntity {
    public SrimpEntity(EntityType<? extends FishEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createSrimpAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 5);

    };

    @Override
    protected SoundEvent getFlopSound() {
        return null;
    }

    public static final Activity SWIM = new Activity("swim");

    @Override
    public ItemStack getBucketItem() {
        return null;
    }

    @Override
    public <A> @Nullable A getAttached(AttachmentType<A> type) {
        return super.getAttached(type);
    }

    @Override
    public <A> A getAttachedOrThrow(AttachmentType<A> type) {
        return super.getAttachedOrThrow(type);
    }

    @Override
    public <A> A getAttachedOrSet(AttachmentType<A> type, A defaultValue) {
        return super.getAttachedOrSet(type, defaultValue);
    }

    @Override
    public <A> A getAttachedOrCreate(AttachmentType<A> type, Supplier<A> initializer) {
        return super.getAttachedOrCreate(type, initializer);
    }

    @Override
    public <A> A getAttachedOrCreate(AttachmentType<A> type) {
        return super.getAttachedOrCreate(type);
    }

    @Override
    public <A> A getAttachedOrElse(AttachmentType<A> type, @Nullable A defaultValue) {
        return super.getAttachedOrElse(type, defaultValue);
    }

    @Override
    public <A> A getAttachedOrGet(AttachmentType<A> type, Supplier<A> defaultValue) {
        return super.getAttachedOrGet(type, defaultValue);
    }

    @Override
    public <A> @Nullable A setAttached(AttachmentType<A> type, @Nullable A value) {
        return super.setAttached(type, value);
    }

    @Override
    public boolean hasAttached(AttachmentType<?> type) {
        return super.hasAttached(type);
    }

    @Override
    public <A> @Nullable A removeAttached(AttachmentType<A> type) {
        return super.removeAttached(type);
    }

    @Override
    public <A> @Nullable A modifyAttached(AttachmentType<A> type, UnaryOperator<A> modifier) {
        return super.modifyAttached(type, modifier);
    }

    @Override
    public void setEquipmentFromTable(EquipmentTable equipmentTable, LootContextParameterSet parameters) {
        super.setEquipmentFromTable(equipmentTable, parameters);
    }

    @Override
    public void setEquipmentFromTable(RegistryKey<LootTable> lootTable, LootContextParameterSet parameters, Map<EquipmentSlot, Float> slotDropChances) {
        super.setEquipmentFromTable(lootTable, parameters, slotDropChances);
    }

    @Override
    public void setEquipmentFromTable(RegistryKey<LootTable> lootTable, LootContextParameterSet parameters, long seed, Map<EquipmentSlot, Float> slotDropChances) {
        super.setEquipmentFromTable(lootTable, parameters, seed, slotDropChances);
    }

    @Override
    public @Nullable EquipmentSlot getSlotForStack(ItemStack stack, List<EquipmentSlot> slotBlacklist) {
        return super.getSlotForStack(stack, slotBlacklist);
    }

    @Override
    public boolean isLeashed() {
        return super.isLeashed();
    }

    @Override
    public boolean mightBeLeashed() {
        return super.mightBeLeashed();
    }

    @Override
    public boolean canLeashAttachTo() {
        return super.canLeashAttachTo();
    }

    @Override
    public void setUnresolvedLeashHolderId(int unresolvedLeashHolderId) {
        super.setUnresolvedLeashHolderId(unresolvedLeashHolderId);
    }

    @Override
    public @Nullable LeashData readLeashDataFromNbt(NbtCompound nbt) {
        return super.readLeashDataFromNbt(nbt);
    }

    @Override
    public void writeLeashDataToNbt(NbtCompound nbt, @Nullable Leashable.LeashData leashData) {
        super.writeLeashDataToNbt(nbt, leashData);
    }

    @Override
    public void applyLeashElasticity(Entity leashHolder, float distance) {
        super.applyLeashElasticity(leashHolder, distance);
    }

    @Override
    public void attachLeash(Entity leashHolder, boolean sendPacket) {
        super.attachLeash(leashHolder, sendPacket);
    }

    @Override
    public @Nullable Entity getLeashHolder() {
        return super.getLeashHolder();
    }

    @Override
    public Text getStyledDisplayName() {
        return super.getStyledDisplayName();
    }

    @Override
    public boolean cannotBeSilenced() {
        return super.cannotBeSilenced();
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new TemptGoal(this, 1f, Ingredient.ofItems(ModItems.SRIMP_ITEM), false));
        this.goalSelector.add(1, new SwimAroundGoal(this, 2, 2));
        this.goalSelector.add(2, new LookAtEntityGoal(this, PlayerEntity.class, 4f));
        this.goalSelector.add(3, new LookAroundGoal(this));
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return ModSounds.ENTITY_SRIMP_AMBIENT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return ModSounds.ENTITY_SRIMP_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return ModSounds.ENTITY_SRIMP_HURT;
    }
}
