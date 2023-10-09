package net.nikdo53.mobvote2023mod.entity.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.nikdo53.mobvote2023mod.MobVote2023Mod;
import net.nikdo53.mobvote2023mod.entity.custom.ArmadilloEntity;

public class ArmadilloRenderer extends MobRenderer<ArmadilloEntity, ArmadilloModel<ArmadilloEntity>> {
    public ArmadilloRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ArmadilloModel<>(pContext.bakeLayer(ModModelLayers.ARMADILLO_LAYER)), 0.4F);
    }

    @Override
    public ResourceLocation getTextureLocation(ArmadilloEntity pEntity) {
        return new ResourceLocation(MobVote2023Mod.MOD_ID, "textures/entity/armadillo.png");
    }

}
