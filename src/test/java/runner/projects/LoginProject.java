package runner.projects;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;

public class LoginProject {
    private String url, token;

    public void setUrl(){
        url = "https://demoqa.com/Account/v1/User";
        token = "45ac4fb2-9476-47ed-9810-7331b5ed9fce";
    }
    public JSONObject bodyCreateProject(){
        JSONObject body = new JSONObject();
        body.put("username", "alwi");
        body.put("password", "Password123!");
        return body;
    }

    public void requestWithUsernameAndPassword(){
        given().header("accept"," application/json")
                .header("Content-Type"," application/json")
                .body(bodyCreateProject());
    }
}
