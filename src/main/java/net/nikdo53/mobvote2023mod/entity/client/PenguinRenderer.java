package net.nikdo53.mobvote2023mod.entity.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.nikdo53.mobvote2023mod.MobVote2023Mod;
import net.nikdo53.mobvote2023mod.entity.custom.PenguinEntity;

public class PenguinRenderer extends MobRenderer<PenguinEntity, PenguinModel<PenguinEntity>> {
    public PenguinRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new PenguinModel<>(pContext.bakeLayer(ModModelLayers.PENGUIN_LAYER)), 0.4F);
    }

    @Override
    public ResourceLocation getTextureLocation(PenguinEntity pEntity) {
        return new ResourceLocation(MobVote2023Mod.MOD_ID, "textures/entity/penguin.png");
    }

}
