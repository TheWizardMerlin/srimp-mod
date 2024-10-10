package srimp.srimp;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import srimp.srimp.block.ModBlocks;
import srimp.srimp.entity.SrimpEntity;
import srimp.srimp.item.ModItemGroups;
import srimp.srimp.item.ModItems;
import srimp.srimp.sound.ModSounds;
import srimp.srimp.util.HammerUsageEvent;

public class Srimp implements ModInitializer {
	public static final EntityType<SrimpEntity> SRIMP_ENTITY = Registry.register(
			Registries.ENTITY_TYPE,
			Identifier.of("srimp", "srimp_entity"),
			EntityType.Builder.create(SrimpEntity::new, SpawnGroup.WATER_CREATURE)
					.dimensions(0.5f, 0.5f).build("srimp_entity")
	);

	public static final String MOD_ID = "srimp";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemgroups();

		FuelRegistry.INSTANCE.add(ModItems.COOKED_COOKED_SRIMP, 12800);
		FuelRegistry.INSTANCE.add(ModBlocks.COOKED_COOKED_SRIMP_BLOCK, 115200);

		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());
		ModSounds.registerSounds();


		FabricDefaultAttributeRegistry.register(SRIMP_ENTITY, SrimpEntity.createSrimpAttributes());
	}
}

