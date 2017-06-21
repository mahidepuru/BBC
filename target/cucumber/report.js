$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("commentregistration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration page",
  "description": "",
  "id": "registration-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2038221199,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Comment on BBC Test Article",
  "description": "",
  "id": "registration-page;comment-on-bbc-test-article",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@commentsreg"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Navigated to BBC NewsArticlePage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on CommentButton",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on Registration Button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User completes registration",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User login as existing user",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User comments on Test Article",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.i_am_in_Registration_page()"
});
formatter.result({
  "duration": 5535137279,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.User_clicks_on_CommentButtonS()"
});
formatter.result({
  "duration": 125950575,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.userclicksonRegistrationButton()"
});
formatter.result({
  "duration": 1214757737,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.completeRegistration()"
});
formatter.result({
  "duration": 7819777521,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_login_as_existing_user_to_comment()"
});
formatter.result({
  "duration": 2398921751,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.ThenUsercommentson_Test_Article()"
});
formatter.result({
  "duration": 85815744009,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"submit_new_comment\"]/textarea\"}\n  (Session info: chrome\u003d58.0.3029.110)\n  (Driver info: chromedriver\u003d2.30.477690 (c53f4ad87510ee97b5c3425a14c0e79780cdf262),platform\u003dMac OS X 10.12.5 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 80.04 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027Mahidhars-MacBook-Pro.local\u0027, ip: \u0027192.168.250.22\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.5\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.30.477690 (c53f4ad87510ee97b5c3425a14c0e79780cdf262), userDataDir\u003d/var/folders/13/l9n7lzdd76s1d_dyf_g4ls700000gn/T/.org.chromium.Chromium.6Zhm6G}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d58.0.3029.110, platform\u003dMAC, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: e0e5945db55f070941bfd1c772b4b140\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"submit_new_comment\"]/textarea}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\n\tat Registration_Page.commentinArtcile(Registration_Page.java:57)\n\tat Stepdefinition.ThenUsercommentson_Test_Article(Stepdefinition.java:75)\n\tat ✽.Then User comments on Test Article(commentregistration.feature:16)\n",
  "status": "failed"
});
});