package com.idtech.entity;

import com.idtech.BaseMod;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Objects;

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
        return MobEntity.func_233666_p_().func_233815_a_(Attributes.field_233818_a_, 8.0D).func_233815_a_(Attributes.field_233821_d_, 0.5D);
    }
}
