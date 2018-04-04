package common.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class UserPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println 'This is a plugin for common user.'
        project.task('task-user').doFirst {
            println 'This is a task-user task created by zhouyou.'
        }
    }
}