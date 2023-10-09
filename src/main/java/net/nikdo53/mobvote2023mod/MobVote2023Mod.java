package net.nikdo53.mobvote2023mod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nikdo53.mobvote2023mod.entity.ModEntities;
import net.nikdo53.mobvote2023mod.entity.client.ArmadilloRenderer;
import net.nikdo53.mobvote2023mod.entity.client.CrabRender;
import net.nikdo53.mobvote2023mod.entity.client.PenguinRenderer;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MobVote2023Mod.MOD_ID)
public class MobVote2023Mod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "mobvote2023mod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public MobVote2023Mod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        ModEntities.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        EntityRenderers.register(ModEntities.ARMADILLO.get(), ArmadilloRenderer::new);
        EntityRenderers.register(ModEntities.CRAB.get(), CrabRender::new);
        EntityRenderers.register(ModEntities.PENGUIN.get(), PenguinRenderer::new);


    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
