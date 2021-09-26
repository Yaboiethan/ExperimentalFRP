package com.idtech.entity;

import com.idtech.BaseMod;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.GiantEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.item.Item;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class TRexEntity extends MonsterEntity
{
    public static EntityType<? extends TRexEntity> TYPE = (EntityType<TRexEntity>)EntityType.Builder.create(TRexEntity::new, EntityClassification.MONSTER).build("trex").setRegistryName(BaseMod.MODID, "trex");
    public static Item EGG = EntityUtils.buildEntitySpawnEgg(TYPE, 0x4b4a48, 0xe5450f);

    protected TRexEntity(EntityType<? extends MonsterEntity> type, World worldIn)
    {
        super(type, worldIn);
        //TODO: Still working on bounding boxes
    }

    public static AttributeModifierMap.MutableAttribute setupAttributes() {
        return MonsterEntity.func_234295_eP_().func_233815_a_(Attributes.field_233818_a_, 100.0D).func_233815_a_(Attributes.field_233821_d_, 0.5D).func_233815_a_(Attributes.field_233823_f_, 50.0D);
    }


    /*
    I suspect this is the best place to mess with the mob's hitboxes though this is still in testing
     */
    @Nullable
    @Override
    public ILivingEntityData onInitialSpawn(IWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason, @Nullable ILivingEntityData spawnDataIn, @Nullable CompoundNBT dataTag)
    {
        return super.onInitialSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
    }
}
