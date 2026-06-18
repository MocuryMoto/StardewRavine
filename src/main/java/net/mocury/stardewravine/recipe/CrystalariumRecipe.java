package net.mocury.stardewravine.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

public record CrystalariumRecipe(Ingredient inputItem, ItemStack output) implements Recipe<CrystalariumRecipeInput> {

    @Override
    public DefaultedList<Ingredient> getIngredients() {
        DefaultedList<Ingredient> list = DefaultedList.of();
        list.add(this.inputItem);
        return list;
    }



    @Override
    public boolean matches(CrystalariumRecipeInput input, World world) {
        if(world.isClient()) {
            return false;
        }

        return inputItem.test(input.getStackInSlot(0));
    }

    @Override
    public ItemStack craft(CrystalariumRecipeInput input, RegistryWrapper.WrapperLookup lookup) {
        return output.copy();
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getResult(RegistryWrapper.WrapperLookup registriesLookup) {
        return output;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.CRYSTALARIUM_SERIALIZER;
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.CRYSTALARIUM_TYPE;
    }

    public static class Serializer implements RecipeSerializer<CrystalariumRecipe> {
        public static final MapCodec<CrystalariumRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                Ingredient.DISALLOW_EMPTY_CODEC.fieldOf("ingredient").forGetter(CrystalariumRecipe::inputItem),
                ItemStack.CODEC.fieldOf("result").forGetter(CrystalariumRecipe::output)
        ).apply(inst, CrystalariumRecipe::new));

        public static final PacketCodec<RegistryByteBuf, CrystalariumRecipe> STREAM_CODEC =
                PacketCodec.tuple(
                        Ingredient.PACKET_CODEC, CrystalariumRecipe::inputItem,
                        ItemStack.PACKET_CODEC, CrystalariumRecipe::output,
                        CrystalariumRecipe::new);

        @Override
        public MapCodec<CrystalariumRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, CrystalariumRecipe> packetCodec() {
            return STREAM_CODEC;
        }
    }
}
