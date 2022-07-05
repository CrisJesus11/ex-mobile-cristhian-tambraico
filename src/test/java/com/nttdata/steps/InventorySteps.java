package com.nttdata.steps;

import com.nttdata.screens.InventoryScreen;
import net.thucydides.core.annotations.Step;

public class InventorySteps {

    InventoryScreen inventoryScreen;

    @Step("Obtiene el titulo")
    public String getTitle(){
        return inventoryScreen.getTitle();
    }
}
