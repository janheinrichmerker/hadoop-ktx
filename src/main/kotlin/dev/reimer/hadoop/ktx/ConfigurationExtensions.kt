package dev.reimer.hadoop.ktx

import org.apache.hadoop.conf.Configurable
import org.apache.hadoop.conf.Configuration

var Configurable.configuration: Configuration
    get() = conf
    set(value) {
        conf = value
    }
