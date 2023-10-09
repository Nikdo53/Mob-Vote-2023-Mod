package net.nikdo53.mobvote2023mod.entity.client;// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import net.nikdo53.mobvote2023mod.entity.custom.ArmadilloEntity;

public class ArmadilloModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
//	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(MoreSnifferFlowers.MOD_ID, "textures/entity/armadillo.png"), "main");
	private final ModelPart armadillo;

	public ArmadilloModel(ModelPart root) {
		this.armadillo = root.getChild("armadillo");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition armadillo = partdefinition.addOrReplaceChild("armadillo", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = armadillo.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition legs = body.addOrReplaceChild("legs", CubeListBuilder.create().texOffs(32, 12).addBox(-4.0F, -2.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(16, 31).addBox(-4.0F, -2.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(28, 17).addBox(2.0F, -2.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(24, 13).addBox(2.0F, -2.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -3.9F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(8, 26).addBox(-1.5F, -1.7778F, -2.7724F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -4.4645F, -8.4853F, -0.7854F, 0.0F, 0.0F));

		PartDefinition ear = body.addOrReplaceChild("ear", CubeListBuilder.create().texOffs(0, 13).addBox(-1.0149F, -4.0468F, -3.1892F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7649F, -7.7987F, -6.1F, 0.5672F, 0.0F, 0.5236F));

		PartDefinition ear2 = body.addOrReplaceChild("ear2", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0149F, -5.5468F, -2.1892F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7649F, -7.7987F, -6.1F, 0.5672F, 0.0F, -0.5236F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, -9.3754F, -4.6348F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.5F, 13.0F, 0.829F, 0.0F, 0.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 13).mirror().addBox(-5.0F, -11.0F, 1.1F, 10.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(25, 23).addBox(-5.0F, -11.0F, -1.9F, 10.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(28, 0).addBox(-5.0F, -11.0F, -4.9F, 10.0F, 9.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).mirror().addBox(-5.0F, -11.0F, -8.9F, 10.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		armadillo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return armadillo;
	}
}