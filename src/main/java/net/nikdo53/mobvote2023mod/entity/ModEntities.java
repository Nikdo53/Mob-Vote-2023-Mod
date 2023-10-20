package net.nikdo53.mobvote2023mod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nikdo53.mobvote2023mod.MobVote2023Mod;
import net.nikdo53.mobvote2023mod.entity.custom.ArmadilloEntity;
import net.nikdo53.mobvote2023mod.entity.custom.CrabEntity;
import net.nikdo53.mobvote2023mod.entity.custom.PenguinEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MobVote2023Mod.MOD_ID);

    public static final RegistryObject<EntityType<ArmadilloEntity>> ARMADILLO =
          ENTITY_TYPES.register("armadillo", () -> EntityType.Builder.of(ArmadilloEntity::new, MobCategory.CREATURE)
                  .sized(0.7f, 0.7f).build("armadillo"));

    public static final RegistryObject<EntityType<CrabEntity>> CRAB =
            ENTITY_TYPES.register("crab", () -> EntityType.Builder.of(CrabEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.4f).build("crab"));

    public static final RegistryObject<EntityType<PenguinEntity>> PENGUIN =
            ENTITY_TYPES.register("penguin", () -> EntityType.Builder.of(PenguinEntity::new, MobCategory.CREATURE)
                    .sized(0.4f, 1.0f).build("penguin"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
