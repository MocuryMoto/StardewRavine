package net.mocury.stardewravine.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class SilverSpoonItem extends Item {
    public SilverSpoonItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        user.getItemCooldownManager().set(this, 250);

        if (!world.isClient) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 250, 2));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 250, 1));
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }
}
