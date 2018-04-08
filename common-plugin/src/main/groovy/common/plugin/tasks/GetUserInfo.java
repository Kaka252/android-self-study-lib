package common.plugin.tasks;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class GetUserInfo extends DefaultTask {

    private String userName;
    private String userAge;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAge() {
        return userAge;
    }

    @TaskAction
    public void getUserInfo() {
        System.out.printf("%s, %s!\n", getUserName(), getUserAge());
    }
}
