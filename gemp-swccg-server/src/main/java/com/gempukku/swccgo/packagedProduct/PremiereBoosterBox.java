package com.gempukku.swccgo.packagedProduct;

import com.gempukku.swccgo.game.CardCollection;
import com.gempukku.swccgo.game.SwccgCardBlueprintLibrary;

import java.util.LinkedList;
import java.util.List;

/**
 * Defines a Premiere booster box.
 */
public class PremiereBoosterBox extends BasePackagedCardProduct {

    /**
     * Creates a Premiere booster box.
     * @param library the blueprint library
     */
    public PremiereBoosterBox(SwccgCardBlueprintLibrary library) {
        super(library);
    }

    /**
     * Gets the name of the product.
     * @return the name of the product.
     */
    @Override
    public String getProductName() {
        return ProductName.PREMIERE_BOOSTER_BOX;
    }

    /**
     * Gets the price of the product.
     * @return the price of the product.
     */
    @Override
    public float getProductPrice() {
        return ProductPrice.PREMIERE_BOOSTER_BOX;
    }

    /**
     * Opens the packaged card product.
     * @return the card collection items contained in the packaged card product.
     */
    @Override
    public List<CardCollection.Item> openPackage() {
        List<CardCollection.Item> result = new LinkedList<CardCollection.Item>();
        addProducts(result, ProductName.PREMIERE_BOOSTER_PACK, 36);
        return result;
    }
}
