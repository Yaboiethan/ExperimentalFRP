package com.idtech.structures;

import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class StructureMod
{
    @SubscribeEvent
    public static void registerStructures(RegistryEvent.Register<Structure<?>> event)
    {
        event.getRegistry().register(TowerStructure.INSTANCE);
    }
}

