package net.nikdo53.mobvote2023mod.entity.client;// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class CrabModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart crab;

	public CrabModel(ModelPart root) {
		this.crab = root.getChild("crab");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition crab = partdefinition.addOrReplaceChild("crab", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 24.0F, -3.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition body = crab.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -5.0F, -4.0F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 1).addBox(1.1F, -6.0F, 2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 3).mirror().addBox(1.1F, -6.0F, -3.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(4, 2).addBox(1.1F, -5.0F, 1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 2).addBox(1.1F, -5.0F, -1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -3.0F));

		PartDefinition smallclaw = crab.addOrReplaceChild("smallclaw", CubeListBuilder.create().texOffs(20, 13).addBox(-1.0F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, -1.5F, -6.5F, 0.4363F, 0.5236F, 1.6144F));

		PartDefinition claw = crab.addOrReplaceChild("claw", CubeListBuilder.create().texOffs(10, 15).addBox(-1.15F, 0.625F, -2.875F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -2.625F, -0.125F, 0.6404F, -0.284F, -0.2058F));

		PartDefinition claw_top = claw.addOrReplaceChild("claw_top", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, 1.1667F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(3, 6).addBox(-1.0F, 0.0F, -2.8333F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 13).addBox(-1.0F, -2.0F, -2.8333F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.475F, 0.0583F, -0.0873F, 0.0F, 0.0F));

		PartDefinition right_legs = crab.addOrReplaceChild("right_legs", CubeListBuilder.create().texOffs(6, 3).addBox(3.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 13).addBox(-0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(2, 13).addBox(-4.5F, -1.5F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -1.5F, -7.7F, -0.4363F, 0.0F, 0.0F));

		PartDefinition left_legs = crab.addOrReplaceChild("left_legs", CubeListBuilder.create().texOffs(12, 13).addBox(0.0F, -3.0F, 5.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(10, 13).addBox(-8.0F, -3.0F, 5.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(4, 13).addBox(-4.0F, -3.0F, 5.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -1.25F, 0.4363F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		crab.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return crab;
	}
}