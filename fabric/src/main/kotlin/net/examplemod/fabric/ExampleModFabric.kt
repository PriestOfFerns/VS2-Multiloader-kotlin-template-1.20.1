package net.examplemod.fabric

import net.examplemod.ExampleMod
import net.fabricmc.api.ModInitializer


object ExampleModFabric: ModInitializer {
    override fun onInitialize() {
        ExampleMod.init()
    }
}
