package com.idtech.entity;

import com.idtech.BaseMod;
import com.idtech.SoundHandler;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

import javax.annotation.Nullable;


public class TRexEntity extends MonsterEntity
{
    //FINALLY: Size has to be set in the builder
    public static EntityType<? extends TRexEntity> TYPE = (EntityType<TRexEntity>)EntityType.Builder
            .create(TRexEntity::new, EntityClassification.MONSTER)
            .immuneToFire()
            .size(6,5)
            .build("trex")
            .setRegistryName(BaseMod.MODID, "trex");
    public static Item EGG = EntityUtils.buildEntitySpawnEgg(TYPE, 0x4b4a48, 0xe5450f);

    protected TRexEntity(EntityType<? extends MonsterEntity> type, World worldIn)
    {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute setupAttributes() {
        return MonsterEntity.func_234295_eP_().func_233815_a_(Attributes.field_233818_a_, 100.0D).func_233815_a_(Attributes.field_233821_d_, 0.5D).func_233815_a_(Attributes.field_233823_f_, 50.0D);
    }

    /*
    This acts as some sort of update function
     */
    @Override
    public void livingTick()
    {
        super.livingTick();
    }

    //SFX Overwriting with custom destinations

    @Nullable
    @Override
    protected SoundEvent getAmbientSound()
    {
        System.out.println("Getting TRex sound !!");
        return SoundHandler.roar;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return super.getHurtSound(damageSourceIn);
    }

    @Override
    protected SoundEvent getDeathSound() {
        return super.getDeathSound();
    }
}
