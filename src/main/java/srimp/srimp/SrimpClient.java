package srimp.srimp;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.model.EntityModelLayer;

import net.minecraft.util.Identifier;
import srimp.srimp.block.ModBlocks;
import srimp.srimp.client.model.SrimpEntityModel;
import srimp.srimp.client.renderer.SrimpEntityRenderer;

@Environment(EnvType.CLIENT)


public class SrimpClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_SRIMP_LAYER = new EntityModelLayer
            (Identifier.of("srimp", "srimp_entity"), "main");
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(Srimp.SRIMP_ENTITY, SrimpEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_SRIMP_LAYER, SrimpEntityModel::getTexturedModelData);
        //i wasn't paying attention when i was writing the mob code, and it kept crashing on me because i forgot this ONE
        //FUCKING LINE


        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SRIMP_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SRIMP_TRAPDOOR, RenderLayer.getCutout());

    }
}
