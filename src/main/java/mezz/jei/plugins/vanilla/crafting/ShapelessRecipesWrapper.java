package mezz.jei.plugins.vanilla.crafting;

import javax.annotation.Nonnull;
import java.util.Collections;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapelessRecipes;

import mezz.jei.api.recipe.wrapper.ICraftingRecipeWrapper;

public class ShapelessRecipesWrapper implements ICraftingRecipeWrapper {

	@Nonnull
	private final ShapelessRecipes recipe;

	public ShapelessRecipesWrapper(@Nonnull Object recipe) {
		this.recipe = (ShapelessRecipes) recipe;
	}

	@Nonnull
	@Override
	public List getInputs() {
		return recipe.recipeItems;
	}

	@Nonnull
	@Override
	public List<ItemStack> getOutputs() {
		return Collections.singletonList(recipe.getRecipeOutput());
	}

	@Override
	public void drawInfo(@Nonnull Minecraft minecraft) {

	}
}
