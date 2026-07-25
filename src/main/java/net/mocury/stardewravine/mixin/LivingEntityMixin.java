package net.mocury.stardewravine.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.*;
import net.minecraft.entity.projectile.ShulkerBulletEntity;
import net.mocury.stardewravine.effect.ModEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
    @Inject(method = "damage", at = @At(value = "HEAD"), cancellable = true)
    private void isImmuneToEntity(DamageSource source, float amount, CallbackInfoReturnable<Boolean> cir) {
    LivingEntity entity = (LivingEntity) (Object) this;
        if (source.getAttacker() instanceof SlimeEntity && entity.hasStatusEffect(ModEffects.SLIME_CHARMER)) {
            cir.setReturnValue(false);
        } else if (source.getAttacker() instanceof MagmaCubeEntity && entity.hasStatusEffect(ModEffects.SLIME_CHARMER)) {
            cir.setReturnValue(false);
        } else if (source.getAttacker() instanceof EndermanEntity && entity.hasStatusEffect(ModEffects.OPALESCENT)) {
            cir.setReturnValue(false);
        } else if (source.getAttacker() instanceof EndermiteEntity && entity.hasStatusEffect(ModEffects.OPALESCENT)) {
            cir.setReturnValue(false);
        } else if (source.getAttacker() instanceof ShulkerBulletEntity && entity.hasStatusEffect(ModEffects.OPALESCENT)) {
            cir.setReturnValue(false);
        } else if (source.getAttacker() instanceof ShulkerEntity && entity.hasStatusEffect(ModEffects.OPALESCENT)) {
            cir.setReturnValue(false);
        } else if (source.getAttacker() instanceof PiglinEntity && entity.hasStatusEffect(ModEffects.GILDED)) {
            cir.setReturnValue(false);
        } else if (source.getAttacker() instanceof PiglinBruteEntity && entity.hasStatusEffect(ModEffects.GILDED)) {
            cir.setReturnValue(false);
        } else if (source.getAttacker() instanceof ZombieEntity && entity.hasStatusEffect(ModEffects.CRUSADER)) {
            cir.setReturnValue(false);
        } else if (source.getAttacker() instanceof SkeletonEntity && entity.hasStatusEffect(ModEffects.CRUSADER)) {
            cir.setReturnValue(false);
        } else if (source.getAttacker() instanceof HuskEntity && entity.hasStatusEffect(ModEffects.CRUSADER)) {
            cir.setReturnValue(false);
        } else if (source.getAttacker() instanceof StrayEntity && entity.hasStatusEffect(ModEffects.CRUSADER)) {
            cir.setReturnValue(false);
        } else if (source.getAttacker() instanceof WitherSkeletonEntity && entity.hasStatusEffect(ModEffects.CRUSADER)) {
            cir.setReturnValue(false);
        } else if (source.getAttacker() instanceof BoggedEntity && entity.hasStatusEffect(ModEffects.CRUSADER)) {
            cir.setReturnValue(false);
        } else if (source.getAttacker() instanceof DrownedEntity && entity.hasStatusEffect(ModEffects.CRUSADER)) {
            cir.setReturnValue(false);
        } else if (source.getAttacker() instanceof ZombieVillagerEntity && entity.hasStatusEffect(ModEffects.CRUSADER)) {
            cir.setReturnValue(false);
        } else if (source.getAttacker() instanceof ZombifiedPiglinEntity && entity.hasStatusEffect(ModEffects.CRUSADER)) {
            cir.setReturnValue(false);
        }
    }
}