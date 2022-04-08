package tech.icedlab.advagri;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricMaterialBuilder;
import net.minecraft.block.Material;

public class AdvAgriMaterials {

    public static final FabricMaterialBuilder ADV_AGRI_MATERIALS_WOOD;

    public static final FabricMaterialBuilder ADV_AGRI_MATERIALS_STONE;

    static {
        ADV_AGRI_MATERIALS_WOOD = new FabricMaterialBuilder(Material.WOOD.getColor());
        ADV_AGRI_MATERIALS_STONE = new FabricMaterialBuilder(Material.STONE.getColor());
    }
}
