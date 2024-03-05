[![GitHub Actions](https://img.shields.io/github/actions/workflow/status/heinrichreimer/hadoop-ktx/ci.yml?branch=master&style=flat-square)](https://github.com/heinrichreimer/hadoop-ktx/actions/workflows/ci.yml)
[![JitPack](https://img.shields.io/jitpack/v/github/heinrichreimer/hadoop-ktx?style=flat-square)](https://jitpack.io/#dev.reimer/hadoop-ktx)

# 💾 hadoop-ktx<sup>[α](#status-α)</sup>

Kotlin extensions for [Apache Hadoop](https://hadoop.apache.org/) (unofficial).

## Gradle Dependency

This library is available on [**jitpack.io**](https://jitpack.io/#dev.reimer/hadoop-ktx).  
Add this in your `build.gradle.kts` or `build.gradle` file:

<details open><summary>Kotlin</summary>

```kotlin
repositories {
    maven("https://jitpack.io")
}

dependencies {
    implementation("dev.reimer:hadoop-ktx:<version>")
}
```

</details>

<details><summary>Groovy</summary>

```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'dev.reimer:hadoop-ktx:<version>'
}
```

</details>

## Status α

⚠️ _Warning:_ This project is in an experimental alpha stage:
- The API may be changed at any time without further notice.
- Development still happens on `master`.
- Pull Requests are highly appreciated!
