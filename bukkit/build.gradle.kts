dependencies {
    implementation(projects.viaversionBukkitLegacy)
    implementation(libs.viabackwardsCommon)
    implementation(libs.viarewindCommon)
    implementation(projects.viaversionCommon)
    compileOnly(libs.paper) {
        exclude("junit", "junit")
        exclude("com.google.code.gson", "gson")
        exclude("javax.persistence", "persistence-api")
    }
}
