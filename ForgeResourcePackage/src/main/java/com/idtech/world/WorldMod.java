package com.idtech.world;

import com.idtech.block.BlockMod;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;

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

    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event)
    {
        //CountRangeConfig object that has: number of veins, offset from bottom of biome (y=0), offset from top of biome, and max height above bottomOffset
        CountRangeConfig configCR = new CountRangeConfig(5,16,0,32);

        int veinSize = 5;
        //Get all ores we're adding
        BlockState[] oresToAdd = {Blocks.COAL_ORE.getDefaultState(), BlockMod.CASTLE_WALL.getDefaultState(), Blocks.EMERALD_ORE.getDefaultState()};

        //Actually start spawning
        for(BlockState block: oresToAdd)
        {
            OreFeatureConfig feature = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, block, veinSize);
            ConfiguredPlacement placement = Placement.COUNT_RANGE.configure(configCR);
            //Add feature to biome
            AncientForestBiome.INSTANCE.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(placement));
        }
    }
}

