package common.plugin

import org.gradle.api.Action
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task

class UserPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.tasks.create("get-user-info-task", GetUserInfo.class, new Action<GetUserInfo>() {

            @Override
            void execute(GetUserInfo info) {
                info.setUserAge('28岁')
                info.setUserName('郭峰')
            }
        }).doFirst(new Action<Task>() {
            @Override
            void execute(Task task) {
                println '===This is a demo of get user info task==='
            }
        }).doLast(new Action<FileGenerateTask>() {
            @Override
            void execute(FileGenerateTask task) {
                fileGenerateTask.dir = "common-plugin"
                fileGenerateTask.fileName = "generated-file.properties"
            }
        })
    }
}