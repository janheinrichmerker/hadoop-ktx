package dev.reimer.hadoop.ktx

import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.create

fun DependencyHandler.hadoop(module: String, version: String? = null): Any = create(
    group = "org.apache.hadoop",
    name = "hadoop-${module.removePrefix("hadoop-")}",
    version = version
)
