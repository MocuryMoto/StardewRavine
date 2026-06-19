package net.mocury.stardewravine.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class DwarvenTiaraItem extends Item {
    public DwarvenTiaraItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        user.getItemCooldownManager().set(this, 300);

        if (!world.isClient) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 100, 4));
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }
}
