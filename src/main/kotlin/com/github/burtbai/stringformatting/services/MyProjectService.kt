package com.github.burtbai.stringformatting.services

import com.intellij.openapi.project.Project
import com.github.burtbai.stringformatting.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
