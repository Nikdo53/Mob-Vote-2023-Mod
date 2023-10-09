package net.nikdo53.mobvote2023mod.entity.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.nikdo53.mobvote2023mod.MobVote2023Mod;
import net.nikdo53.mobvote2023mod.entity.custom.CrabEntity;

public class CrabRender extends MobRenderer<CrabEntity, CrabModel<CrabEntity>> {
    public CrabRender(EntityRendererProvider.Context pContext) {
        super(pContext, new CrabModel<>(pContext.bakeLayer(ModModelLayers.CRAB_LAYER)), 0.4F);
    }

    @Override
    public ResourceLocation getTextureLocation(CrabEntity pEntity) {
        return new ResourceLocation(MobVote2023Mod.MOD_ID, "textures/entity/crab.png");
    }

}
