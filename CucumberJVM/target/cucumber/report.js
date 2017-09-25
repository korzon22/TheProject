$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/CucumberReport/cucumberReport.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Here we\u0027ve got 4 scenarios - first for placing the bet,"
    },
    {
      "line": 2,
      "value": "#second one for asserting the return offered, third one for asserting the odds."
    },
    {
      "line": 3,
      "value": "#4th scenario makes sure that browser is closed after the test."
    },
    {
      "line": 4,
      "value": "# Test report is available - check target/file directory - it\u0027s called index.html"
    }
  ],
  "line": 6,
  "name": "Place the bet and assert the odds and returns offered",
  "description": "",
  "id": "place-the-bet-and-assert-the-odds-and-returns-offered",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "Open the WH\u0027s website, choose Premier League, place the bet, assert the odds and return offered",
  "description": "",
  "id": "place-the-bet-and-assert-the-odds-and-returns-offered;open-the-wh\u0027s-website,-choose-premier-league,-place-the-bet,-assert-the-odds-and-return-offered",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I open the William Hill website",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I choose to search the website",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I enter the look-up text",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I select the Premier League",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I choose the first home team to win",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I place the bet \"0.05\"",
  "keyword": "And "
});
formatter.match({
  "location": "cucumberReport.openBrowser()"
});
formatter.result({
  "duration": 4288534237,
  "status": "passed"
});
formatter.match({
  "location": "cucumberReport.A_openWebPage()"
});
formatter.result({
  "duration": 12944312077,
  "status": "passed"
});
formatter.match({
  "location": "cucumberReport.B_openSearchWindow()"
});
formatter.result({
  "duration": 138948795,
  "status": "passed"
});
formatter.match({
  "location": "cucumberReport.C_enterRequiredText()"
});
formatter.result({
  "duration": 218703494,
  "status": "passed"
});
formatter.match({
  "location": "cucumberReport.D_selectRequiredLeague()"
});
formatter.result({
  "duration": 12551702737,
  "status": "passed"
});
formatter.match({
  "location": "cucumberReport.E_selectHomeTeamToWin()"
});
formatter.result({
  "duration": 5137646277,
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
  "duration": 271497984,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Asserting the return offered",
  "description": "",
  "id": "place-the-bet-and-assert-the-odds-and-returns-offered;asserting-the-return-offered",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "Return offered should be \"2.1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberReport.I_assertTheReturnsOffered()"
});
formatter.result({
  "duration": 41509547,
  "error_message": "java.lang.AssertionError: expected:\u003c2.0\u003e but was:\u003c0.06\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:553)\r\n\tat org.junit.Assert.assertEquals(Assert.java:683)\r\n\tat CucumberReport.cucumberReport.I_assertTheReturnsOffered(cucumberReport.java:86)\r\n\tat ✽.Then Return offered should be \"2.1\"(src/test/java/CucumberReport/cucumberReport.feature:26)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 28,
  "name": "Asserting the odds",
  "description": "",
  "id": "place-the-bet-and-assert-the-odds-and-returns-offered;asserting-the-odds",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "Odds should be \"2/1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberReport.H_assertTheOdds()"
});
formatter.result({
  "duration": 38929398,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[2/1]\u003e but was:\u003c[1/3]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat CucumberReport.cucumberReport.H_assertTheOdds(cucumberReport.java:80)\r\n\tat ✽.Then Odds should be \"2/1\"(src/test/java/CucumberReport/cucumberReport.feature:30)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 32,
  "name": "Closing the browser",
  "description": "",
  "id": "place-the-bet-and-assert-the-odds-and-returns-offered;closing-the-browser",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberReport.closeTheBrowser()"
});
formatter.result({
  "duration": 1576456129,
  "status": "passed"
});
});