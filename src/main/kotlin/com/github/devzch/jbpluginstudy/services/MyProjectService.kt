package com.github.devzch.jbpluginstudy.services

import com.github.devzch.jbpluginstudy.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
