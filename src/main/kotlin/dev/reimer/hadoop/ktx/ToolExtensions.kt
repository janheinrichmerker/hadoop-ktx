package dev.reimer.hadoop.ktx

import org.apache.hadoop.util.Tool
import org.apache.hadoop.util.ToolRunner

fun Tool.runInCurrentContext(arguments: Array<String>) = ToolRunner.run(this, arguments)

inline val <reified T : Tool> T.containingJar: String?
    get() = T::class.containingJar
