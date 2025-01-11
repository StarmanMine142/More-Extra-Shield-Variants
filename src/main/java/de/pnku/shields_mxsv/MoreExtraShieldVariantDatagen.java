package de.pnku.shields_mxsv;

import de.pnku.shields_mxsv.datagen.MoreExtraShieldVariantRecipeGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MoreExtraShieldVariantDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(MoreExtraShieldVariantRecipeGenerator::new);
    }
}
