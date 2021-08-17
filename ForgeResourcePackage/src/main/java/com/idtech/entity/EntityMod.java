package com.idtech.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class EntityMod {

    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event){

        event.getRegistry().register(ExampleBlockBenchEntity.TYPE);
        GlobalEntityTypeAttributes.put(ExampleBlockBenchEntity.TYPE, ExampleBlockBenchEntity.setupAttributes().func_233813_a_());
    }

    @SubscribeEvent
    public static void registerEntityEggs(final RegistryEvent.Register<Item> event){

    event.getRegistry().register(ExampleBlockBenchEntity.EGG);

    }

    public static void entityRenderers(){

        RenderingRegistry.registerEntityRenderingHandler(ExampleBlockBenchEntity.TYPE, ExampleBlockBenchRenderFactory.INSTANCE);
    }

}
