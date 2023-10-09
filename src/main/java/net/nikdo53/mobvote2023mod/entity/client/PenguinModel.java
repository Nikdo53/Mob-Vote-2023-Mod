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

public class PenguinModel<T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart penguin;

	public PenguinModel(ModelPart root) {
		this.penguin = root.getChild("penguin");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition penguin = partdefinition.addOrReplaceChild("penguin", CubeListBuilder.create().texOffs(19, 11).addBox(-8.0F, -12.0F, -4.0F, 1.0F, 12.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.0F, -12.0F, -4.0F, 5.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(24, 32).addBox(-7.0F, -11.0F, 5.0F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 8).addBox(-7.0F, -11.0F, -5.0F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 25).addBox(-7.5F, -17.0F, -3.0F, 5.0F, 5.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(19, 4).addBox(-6.0F, -1.0F, 1.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(19, 0).addBox(-6.0F, -1.0F, -3.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 23).addBox(-2.5F, -15.0F, -0.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-2.0F, -19.0F, 1.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(30, 17).addBox(-7.0F, -18.0F, 5.0F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-2.0F, -19.0F, -4.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(8, 20).addBox(-7.0F, -18.0F, -4.0F, 5.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 24.0F, -4.0F, 0.0F, 1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		penguin.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return penguin;
	}
}