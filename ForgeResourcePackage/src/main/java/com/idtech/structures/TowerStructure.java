package com.idtech.structures;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class TowerStructure extends Structure<NoFeatureConfig>
{
    public static Structure INSTANCE = new TowerStructure(new Codec() {
        @Override
        public DataResult<Pair> decode(DynamicOps ops, Object input) {
            return null;
        }

        @Override
        public DataResult encode(Object input, DynamicOps ops, Object prefix) {
            return null;
        }
    }).setRegistryName("tower");

    public TowerStructure(Codec p_i231997_1_) {
        super(p_i231997_1_);
    }

    @Override
    public IStartFactory getStartFactory()
    {
        return TowerStructure.Start::new;
    }

    @Override
    public String getStructureName()
    {
        return "tower";
    }

    public static class Start extends StructureStart<NoFeatureConfig> {

        public Start(Structure<NoFeatureConfig> p_i225806_1_, int p_i225806_2_, int p_i225806_3_, MutableBoundingBox p_i225806_4_, int p_i225806_5_, long p_i225806_6_) {
            super(p_i225806_1_, p_i225806_2_, p_i225806_3_, p_i225806_4_, p_i225806_5_, p_i225806_6_);
        }

        @Override
        public void func_230364_a_(ChunkGenerator p_230364_1_, TemplateManager p_230364_2_, int p_230364_3_, int p_230364_4_, Biome p_230364_5_, NoFeatureConfig p_230364_6_) {

            this.recalculateStructureSize();
        }
    }
}
