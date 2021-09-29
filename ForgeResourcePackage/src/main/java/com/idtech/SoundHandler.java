package com.idtech;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class SoundHandler
{
    //Register all sounds here
    public static SoundEvent roar;

    static {
        roar = addSoundInfo("roar");
    }
    //This method lets us easily add new sounds and correctly set their registry name and location.
    private static SoundEvent addSoundInfo(String soundPath) {
        ResourceLocation location = new ResourceLocation(BaseMod.MODID, soundPath);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(location);
        return event;
    }

    @SubscribeEvent
    public void registerSounds(RegistryEvent.Register<SoundEvent> event)
    {
        //More sounds can be added with commas
        event.getRegistry().registerAll(roar);
    }
}
