$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/CucumberReport/cucumberReport.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# new feature"
    },
    {
      "line": 2,
      "value": "# Tags: optional"
    }
  ],
  "line": 3,
  "name": "Place the bet and assert the odds and returns offered",
  "description": "",
  "id": "place-the-bet-and-assert-the-odds-and-returns-offered",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Open the WH\u0027s website, choose Premier League, place the bet, assert the odds and return offered",
  "description": "",
  "id": "place-the-bet-and-assert-the-odds-and-returns-offered;open-the-wh\u0027s-website,-choose-premier-league,-place-the-bet,-assert-the-odds-and-return-offered",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I open the William Hill website",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I choose to search the website",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I enter the look-up text",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I select the Premier League",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I choose the first home team to win",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I place the bet \"0.05\"",
  "keyword": "And "
});
formatter.match({
  "location": "cucumberReport.openBrowser()"
});
formatter.result({
  "duration": 4363719255,
  "status": "passed"
});
formatter.match({
  "location": "cucumberReport.A_openWebPage()"
});
formatter.result({
  "duration": 21710721861,
  "status": "passed"
});
formatter.match({
  "location": "cucumberReport.B_openSearchWindow()"
});
formatter.result({
  "duration": 142632748,
  "status": "passed"
});
formatter.match({
  "location": "cucumberReport.C_enterRequiredText()"
});
formatter.result({
  "duration": 268031711,
  "status": "passed"
});
formatter.match({
  "location": "cucumberReport.D_selectRequiredLeague()"
});
formatter.result({
  "duration": 13020005143,
  "status": "passed"
});
formatter.match({
  "location": "cucumberReport.E_selectHomeTeamToWin()"
});
formatter.result({
  "duration": 5124722222,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0.05",
      "offset": 17
    }
  ],
  "location": "cucumberReport.F_clickBettingWindow(String)"
});
formatter.result({
  "duration": 278319912,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Asserting the return offered",
  "description": "",
  "id": "place-the-bet-and-assert-the-odds-and-returns-offered;asserting-the-return-offered",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "Return offered should be \"2.1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberReport.I_assertTheReturnsOffered()"
});
formatter.result({
  "duration": 41542732,
  "error_message": "java.lang.AssertionError: expected:\u003c2.0\u003e but was:\u003c0.13\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:553)\r\n\tat org.junit.Assert.assertEquals(Assert.java:683)\r\n\tat CucumberReport.cucumberReport.I_assertTheReturnsOffered(cucumberReport.java:83)\r\n\tat ✽.Then Return offered should be \"2.1\"(src/test/java/CucumberReport/cucumberReport.feature:23)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 25,
  "name": "Asserting the odds",
  "description": "",
  "id": "place-the-bet-and-assert-the-odds-and-returns-offered;asserting-the-odds",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "Odds should be \"2/1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberReport.H_assertTheOdds()"
});
formatter.result({
  "duration": 42429646,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[2/1]\u003e but was:\u003c[7/2]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat CucumberReport.cucumberReport.H_assertTheOdds(cucumberReport.java:77)\r\n\tat ✽.Then Odds should be \"2/1\"(src/test/java/CucumberReport/cucumberReport.feature:27)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 29,
  "name": "Closing the browser",
  "description": "",
  "id": "place-the-bet-and-assert-the-odds-and-returns-offered;closing-the-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberReport.closeTheBrowser()"
});
formatter.result({
  "duration": 1530302235,
  "status": "passed"
});
});