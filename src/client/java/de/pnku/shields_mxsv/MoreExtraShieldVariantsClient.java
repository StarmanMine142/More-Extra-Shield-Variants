package de.pnku.shields_mxsv;

import de.pnku.shields_mxsv.item.MoreExtraShieldVariantItemGroups;
import de.pnku.shields_mxsv.item.MoreExtraShieldVariantModelPredicateProvider;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;


@Environment(value = EnvType.CLIENT)
public class MoreExtraShieldVariantsClient implements ClientModInitializer {

    
    @Override
    public void onInitializeClient() {
        MoreExtraShieldVariantModelPredicateProvider.registerMxsvItemModelPredicates();
        MoreExtraShieldVariantItemGroups.registerMxsvItemGroups();
    }
    
}
