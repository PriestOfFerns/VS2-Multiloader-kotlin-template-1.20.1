architectury {
    common(rootProject.property("enabled_platforms").toString().split(","))
}

loom {
    accessWidenerPath.set(file("src/main/resources/examplemod.accesswidener"))
}



dependencies {
    // We depend on fabric loader here to use the fabric @Environment annotations and get the mixin dependencies
    // Do NOT use other classes from fabric loader
    modImplementation("net.fabricmc:fabric-loader:${rootProject.property("fabric_loader_version")}")
    // Remove the next line if you don't want to depend on the API
    modApi("dev.architectury:architectury:${rootProject.property("architectury_version")}")


    // Valkyrien Skies 2
    modApi("org.valkyrienskies:valkyrienskies-120-common:${rootProject.property("vs2_version")}")
    implementation("org.valkyrienskies.core:api:${rootProject.property("vscore_version")}") {
        exclude("org.joml", "")
    }
    implementation("org.valkyrienskies.core:impl:${rootProject.property("vscore_version")}") {
        exclude("org.joml", "")
    }
    implementation("org.valkyrienskies.core:api-game:${rootProject.property("vscore_version")}") {
        exclude("org.joml", "")
    }
}