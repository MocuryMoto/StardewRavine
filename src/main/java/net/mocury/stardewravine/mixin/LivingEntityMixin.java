package net.mocury.stardewravine.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.SlimeEntity;
import net.mocury.stardewravine.effect.ModEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

//@Mixin(LivingEntity.class)
//public abstract class LivingEntityMixin {
//    @Inject(method = "damage", at = @At(value = "HEAD"))
//    private void isImmuneToEntity(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
//    LivingEntity entity = (LivingEntity) (Object) this;
//        if (entity.getAttacker() instanceof SlimeEntity slimeEntity && entity.hasStatusEffect(ModEffects.SLIME_CHARMER)) {
//
//        }
//    }
//}