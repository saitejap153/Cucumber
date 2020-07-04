$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:project.feature");
formatter.feature({
  "name": "Practiseautomation testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@practiseautomation"
    }
  ]
});
formatter.scenario({
  "name": "Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@practiseautomation"
    },
    {
      "name": "@TC_01"
    }
  ]
});
formatter.step({
  "name": "User on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.step.Stepdefinition.user_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User on login page",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.step.Stepdefinition.user_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username and password",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.step.Stepdefinition.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.cts.step.Stepdefinition.user_clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User lands on homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.step.Stepdefinition.user_lands_on_homepage()"
});
formatter.result({
  "status": "passed"
});
});