package com.github.nimasfl.samplejetbrainplugin.services

import com.intellij.openapi.project.Project
import com.github.nimasfl.samplejetbrainplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
