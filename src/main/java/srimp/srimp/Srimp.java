package srimp.srimp;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import srimp.srimp.block.ModBlocks;
import srimp.srimp.item.ModItemGroups;
import srimp.srimp.item.ModItems;

public class Srimp implements ModInitializer {
	public static final String MOD_ID = "srimp";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemgroups();

		FuelRegistry.INSTANCE.add(ModItems.COOKED_COOKED_SRIMP, 12800);
		FuelRegistry.INSTANCE.add(ModBlocks.COOKED_COOKED_SRIMP_BLOCK, 115200);
	}
}