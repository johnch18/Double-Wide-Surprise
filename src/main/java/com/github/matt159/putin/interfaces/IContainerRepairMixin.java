package com.github.matt159.putin.interfaces;

import net.minecraft.inventory.IInventory;

public interface IContainerRepairMixin {
    IInventory getInputSlots();
    IInventory getOutputSlot();

    int getXPos();
    int getYPos();
    int getZPos();
}
