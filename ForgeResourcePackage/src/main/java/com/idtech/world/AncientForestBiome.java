package com.idtech.world;

import com.idtech.entity.TRexEntity;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.MoodSoundAmbience;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class AncientForestBiome extends Biome {
    public static Biome INSTANCE = new AncientForestBiome(new Builder()
            .surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.AIR.getDefaultState(), Blocks.GRASS_BLOCK.getDefaultState(), Blocks.STONE.getDefaultState()))
            .precipitation(RainType.RAIN)
            .category(Category.FOREST)
            .depth(1f)
            .scale(0.2f)
            .temperature(2.0f)
            .downfall(0.4f)
            //this is water color, fog color, tuunes, n other ambiance things
            .func_235097_a_((new BiomeAmbience.Builder()).func_235246_b_(4159204).func_235248_c_(329011).func_235239_a_(12638463).func_235243_a_(MoodSoundAmbience.field_235027_b_).func_235238_a_()).parent((String) null)
    ).setRegistryName("ancient_forest");

    protected AncientForestBiome(Builder biomeBuilder)
    {
        super(biomeBuilder);
        DefaultBiomeFeatures.addGiantSpruceTaigaTrees(this);
        DefaultBiomeFeatures.addTallGrass(this);
        DefaultBiomeFeatures.addDoubleFlowers(this);
        DefaultBiomeFeatures.addDenseGrass(this);
        DefaultBiomeFeatures.addForestTrees(this);
        DefaultBiomeFeatures.addHugeMushrooms(this);
        DefaultBiomeFeatures.addCarvers(this);
        //Mobs
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ZOMBIE, 25, 1, 3));
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.CREEPER, 15, 1, 1));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.PARROT, 30, 2, 6));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.BEE, 27, 2, 3));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.COW, 50, 2, 4));
    }
}

