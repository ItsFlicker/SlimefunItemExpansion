plugins {
    java
    id("io.izzel.taboolib") version "1.27"
    id("org.jetbrains.kotlin.jvm") version "1.5.10"
}

taboolib {
    description {
        contributors {
            name("wlys")
        }
        dependencies {
            name("Slimefun")
        }
    }
    install("common", "common-5")
    install("module-configuration")
    install("module-lang")
    install("platform-bukkit")
    classifier = null
    version = "6.0.3-2"
}

repositories {
    maven { url = uri("https://jitpack.io") }
    mavenCentral()
    mavenLocal()
}

dependencies {
    compileOnly("com.github.Slimefun:Slimefun4:RC-26")
    compileOnly("ink.ptms.core:v11701:11701:mapped")
    compileOnly("ink.ptms.core:v11701:11701:universal")
    compileOnly(kotlin("stdlib"))
    compileOnly(fileTree("libs"))
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}