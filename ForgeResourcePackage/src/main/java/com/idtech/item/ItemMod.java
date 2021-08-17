package com.idtech.item;

import com.idtech.ModTab;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ItemMod {

    //BASIC ITEMS
    public static final Item STRUCTURE_GEL = ItemUtils.buildBasicItem("structuregel", ModTab.INSTANCE);
    public static final Item GEL_ORE = ItemUtils.buildBasicItem("gelore", ModTab.INSTANCE);

    //FOODS
    public static Food yummyFood = (new Food.Builder()).hunger(3).saturation(1.4f).effect(new EffectInstance(Effects.SPEED, 400, 1), 1.0F).setAlwaysEdible().build();
    public static Item yummyFoodItem = ItemUtils.buildFoodItem("yummyfood", yummyFood);
    public static Food cookedYummyFood = (new Food.Builder()).hunger(7).saturation(1.4f).effect(new EffectInstance(Effects.SPEED, 400, 2), 1.0f).setAlwaysEdible().build();
    public static Item cookedYummyFoodItem = ItemUtils.buildFoodItem("cookedyummyfood", cookedYummyFood);


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        //BASIC ITEMS
        event.getRegistry().register(STRUCTURE_GEL);
        event.getRegistry().register(GEL_ORE);

        // ITEMS
        event.getRegistry().register(TeleportRodItem.INSTANCE);

        // TOOLS

        // FOOD
        event.getRegistry().register(yummyFoodItem);
        event.getRegistry().register(cookedYummyFoodItem);

        // ARMOR
        //event.getRegistry().register(CustomArmorItem.HELM);

    }
}
