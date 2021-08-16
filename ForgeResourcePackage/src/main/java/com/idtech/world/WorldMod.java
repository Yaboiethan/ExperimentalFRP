package com.idtech.world;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;

public class WorldMod {
    public static void registerBiomes(final RegistryEvent.Register<Biome> event)
    {
        event.getRegistry().register(AncientForestBiome.INSTANCE);
    }
    public static void setupBiomes()
    {
        BiomeDictionary.addTypes(AncientForestBiome.INSTANCE, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.OVERWORLD);
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(AncientForestBiome.INSTANCE, 9000));
        BiomeManager.addSpawnBiome(AncientForestBiome.INSTANCE);
    }
}

