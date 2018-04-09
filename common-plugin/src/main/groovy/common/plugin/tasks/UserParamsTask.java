package common.plugin.tasks;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

/**
 * Author: ZhouYou
 * Date: 2018/4/9.
 */
public class UserParamsTask extends DefaultTask {

    private String userName;
    private String position;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @TaskAction
    public void printUserParams() {
        System.out.println(userName + "的工作是" + position);
    }
}
