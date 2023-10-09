package net.nikdo53.mobvote2023mod.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.nikdo53.mobvote2023mod.MobVote2023Mod;
import net.nikdo53.mobvote2023mod.entity.client.ArmadilloModel;
import net.nikdo53.mobvote2023mod.entity.client.CrabModel;
import net.nikdo53.mobvote2023mod.entity.client.ModModelLayers;
import net.nikdo53.mobvote2023mod.entity.client.PenguinModel;

@Mod.EventBusSubscriber(modid = MobVote2023Mod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.ARMADILLO_LAYER, ArmadilloModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.CRAB_LAYER, CrabModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.PENGUIN_LAYER, PenguinModel::createBodyLayer);


    }
}
