package moze_intel.projecte.gameObjs.tiles;

import javax.annotation.Nonnull;
import moze_intel.projecte.gameObjs.EnumRelayTier;
import moze_intel.projecte.gameObjs.container.RelayMK3Container;
import moze_intel.projecte.gameObjs.registries.PEBlocks;
import moze_intel.projecte.gameObjs.registries.PETileEntityTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class RelayMK3Tile extends RelayMK1Tile {

	public RelayMK3Tile() {
		super(PETileEntityTypes.RELAY_MK3.get(), 21, EnumRelayTier.MK3);
	}

	@Nonnull
	@Override
	public Container createMenu(int windowId, @Nonnull PlayerInventory playerInventory, @Nonnull PlayerEntity player) {
		return new RelayMK3Container(windowId, playerInventory, this);
	}

	@Nonnull
	@Override
	public ITextComponent getDisplayName() {
		return new TranslationTextComponent(PEBlocks.RELAY_MK3.getBlock().getTranslationKey());
	}

	@Override
	protected double getBonusToAdd() {
		return 0.5;
	}
}