package srimp.srimp.client.renderer;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import srimp.srimp.SrimpClient;
import srimp.srimp.client.model.SrimpEntityModel;
import srimp.srimp.entity.SrimpEntity;

public class SrimpEntityRenderer extends MobEntityRenderer<SrimpEntity, SrimpEntityModel> {
    public SrimpEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new SrimpEntityModel(context.getPart(SrimpClient.MODEL_SRIMP_LAYER)), 0.3f);
    }

    @Override
    public Identifier getTexture(SrimpEntity entity) {
        return Identifier.of("srimp", "textures/entity/srimp_entity.png");
    }
}
