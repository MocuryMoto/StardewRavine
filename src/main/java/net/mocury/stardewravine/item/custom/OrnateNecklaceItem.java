package net.mocury.stardewravine.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class OrnateNecklaceItem extends Item {
    public OrnateNecklaceItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        user.getItemCooldownManager().set(this, 250);

        if (!world.isClient) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK, 250, 0));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 100, 2));
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 150, 0));
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }
}
