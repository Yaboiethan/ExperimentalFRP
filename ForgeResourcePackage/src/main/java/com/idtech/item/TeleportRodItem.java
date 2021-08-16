package com.idtech.item;

import com.idtech.Utils;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import net.minecraft.item.Item.Properties;

public class TeleportRodItem extends Item {

    private static Item.Properties properties = new Item.Properties().group(ItemGroup.MISC);
    public static Item INSTANCE = new TeleportRodItem(properties).setRegistryName("teleportrod");

    public TeleportRodItem(Properties properties)
    {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        ItemStack itemStack = playerIn.getHeldItem(handIn); // Get the item held by the player
        BlockPos pos = Utils.getBlockAtCursor(playerIn, 50.0d, false); // Finding position/location of block you are looking at

        if (pos != null) {
            playerIn.setPosition(pos.getX(), pos.getY(), pos.getZ()); // Teleports the player
            return ActionResult.resultSuccess(itemStack);
        }
        else {
            return ActionResult.resultFail(itemStack);
        }

    }
}
