package common.plugin

import org.gradle.api.Action
import org.gradle.api.Plugin
import org.gradle.api.Project

class UserPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println '===This is a demo of get user info task==='
        project.getTasks().create("get-user-info-task", GetUserInfo.class, new Action<GetUserInfo>() {

            @Override
            void execute(GetUserInfo info) {
                info.setUserAge('28岁')
                info.setUserName('郭峰')
            }
        })
        println 'This is a plugin for common user.'
        project.task('get-user-info-task').doFirst {
            println 'This is a get user info task created by zhouyou.'
        }
    }
}