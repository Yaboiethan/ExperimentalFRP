package com.idtech.entity;

import com.idtech.BaseMod;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class TRexRenderer extends MobRenderer<TRexEntity, TRexModel<TRexEntity>>
{

    public TRexRenderer(EntityRendererManager manager) {
        super(manager, new TRexModel<TRexEntity>(), 1.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(TRexEntity entity) {
        return new ResourceLocation(BaseMod.MODID, "textures/entity/trex_texture.png");
    }

    /*
    This method scales the mob by 5 times and is not required for standard instruction
     */
    @Override
    protected void preRenderCallback(TRexEntity entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
        matrixStackIn.scale(5,5,5);
        this.shadowSize = 10f;
    }
}
