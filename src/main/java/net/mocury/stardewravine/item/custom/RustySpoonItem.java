package net.mocury.stardewravine.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class RustySpoonItem extends Item {
    public RustySpoonItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        user.getItemCooldownManager().set(this, 250);

        if (!world.isClient) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 250, 1));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 100, 1));
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }
}
