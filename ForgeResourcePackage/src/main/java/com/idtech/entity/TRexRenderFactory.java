package com.idtech.entity;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class TRexRenderFactory implements IRenderFactory<TRexEntity>
{
    public static TRexRenderFactory INSTANCE = new TRexRenderFactory();

    @Override
    public EntityRenderer<TRexEntity> createRenderFor(EntityRendererManager manager) {
        return new TRexRenderer(manager);
    }
}
