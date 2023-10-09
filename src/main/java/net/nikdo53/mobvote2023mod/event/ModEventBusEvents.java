package net.nikdo53.mobvote2023mod.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.nikdo53.mobvote2023mod.MobVote2023Mod;
import net.nikdo53.mobvote2023mod.entity.ModEntities;
import net.nikdo53.mobvote2023mod.entity.custom.ArmadilloEntity;
import net.nikdo53.mobvote2023mod.entity.custom.CrabEntity;
import net.nikdo53.mobvote2023mod.entity.custom.PenguinEntity;

@Mod.EventBusSubscriber(modid = MobVote2023Mod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.ARMADILLO.get(), ArmadilloEntity.createAttributes().build());
        event.put(ModEntities.CRAB.get(), CrabEntity.createAttributes().build());
        event.put(ModEntities.PENGUIN.get(), PenguinEntity.createAttributes().build());
    }
}
