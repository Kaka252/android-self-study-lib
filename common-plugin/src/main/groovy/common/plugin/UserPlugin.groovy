package common.plugin

import common.plugin.extensions.UserParamExtension
import common.plugin.tasks.GetUserInfo
import common.plugin.tasks.UserParamsTask
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
        }).doLast(new Action<Task>() {
            @Override
            void execute(Task task) {
                println '===This is a demo of get user info task==='

                UserParamExtension userParamExtension = project.extensions.create("userParams", UserParamExtension.class)
                project.afterEvaluate(new Action<Project>() {
                    @Override
                    void execute(Project aProject) {
                        aProject.tasks.create("user-params-print-task", UserParamsTask.class, new Action<UserParamsTask>() {
                            @Override
                            void execute(UserParamsTask userParamsTask) {
                                userParamsTask.userName = userParamExtension.userName
                                userParamsTask.position = userParamExtension.position
                            }
                        })
                    }
                })
            }
        })
    }
}