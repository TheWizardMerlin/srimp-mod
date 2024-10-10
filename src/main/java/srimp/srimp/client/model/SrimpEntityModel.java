package srimp.srimp.client.model;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;
import srimp.srimp.entity.SrimpEntity;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

public class SrimpEntityModel extends EntityModel<SrimpEntity> {
    private final ModelPart bone;
    public SrimpEntityModel(ModelPart root) {
        this.bone = root.getChild("bone");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData bone = modelPartData.addChild("bone", ModelPartBuilder.create().uv(8, 11).cuboid(-1.0F, -4.0F, 5.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, -4.0F));

        ModelPartData cube_r1 = bone.addChild("cube_r1", ModelPartBuilder.create().uv(1, 13).cuboid(-1.0F, 1.0F, -1.0F, 2.0F, 0.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

        ModelPartData tendril4_r1 = bone.addChild("tendril4_r1", ModelPartBuilder.create().uv(7, 4).cuboid(-2.0F, -1.0F, -1.0F, 0.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -3.0F, -1.0F, -0.1183F, -0.446F, 2.1549F));

        ModelPartData tendril3_r1 = bone.addChild("tendril3_r1", ModelPartBuilder.create().uv(7, 5).cuboid(-2.0F, -1.0F, -1.0F, 0.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -2.0F, -3.0F, 0.0871F, -0.064F, 1.0482F));

        ModelPartData tendril2_r1 = bone.addChild("tendril2_r1", ModelPartBuilder.create().uv(7, 6).cuboid(-2.0F, -1.0F, -1.0F, 0.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -4.0F, -3.0F, 0.1745F, 0.0F, 0.0F));

        ModelPartData leg4_r1 = bone.addChild("leg4_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -1.0F, -1.0F, 0.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 1).cuboid(-3.0F, -1.0F, -1.0F, 0.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 2).cuboid(-2.0F, -1.0F, -1.0F, 0.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -2.0F, 5.0F, -0.0873F, 0.0F, 0.0F));

        ModelPartData leg3_r1 = bone.addChild("leg3_r1", ModelPartBuilder.create().uv(0, 3).cuboid(-1.0F, -1.0F, -1.0F, 0.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(10, 2).cuboid(-2.0F, -1.0F, -1.0F, 0.0F, 1.0F, 2.0F, new Dilation(0.0F))
                .uv(10, 3).cuboid(-3.0F, -1.0F, -1.0F, 0.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -1.0F, 5.0F, 0.2182F, 0.0F, 0.0F));

        ModelPartData cube_r2 = bone.addChild("cube_r2", ModelPartBuilder.create().uv(10, 0).cuboid(-1.0F, -2.0F, -2.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 3.0F, 3.0F, -0.1745F, 0.0F, 0.0F));

        ModelPartData cube_r3 = bone.addChild("cube_r3", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.0F, 6.0F, 0.0873F, 0.0F, 0.0F));

        ModelPartData head_r1 = bone.addChild("head_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -2.0F, -5.0F, 2.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -4.0F, 4.0F, 0.0436F, 0.0F, 0.0F));

        ModelPartData cube_r4 = bone.addChild("cube_r4", ModelPartBuilder.create().uv(0, 8).cuboid(-1.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.0F, 5.0F, 0.9599F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 32, 32);
    }

    @Override
    public void setAngles(SrimpEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }


    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
        bone.render(matrices, vertices, light, overlay, color);
    }

}