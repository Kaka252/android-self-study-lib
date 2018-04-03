package common.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class UserPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        System.out.println("========================");
        System.out.println("hello gradle plugin!");
    }
}