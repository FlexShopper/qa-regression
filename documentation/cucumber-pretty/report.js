$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/pp3/BankingInfoScreen.feature");
formatter.feature({
  "name": "As user I should be able to land on the Banking Info Screen",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@BankingInfo"
    }
  ]
});
formatter.scenarioOutline({
  "name": "The user can see the bank of the routing number entered",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters a valid routing number: \"\u003croutingNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user sees the name of the bank: \"\u003cbankName\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "routingNumber",
        "bankName"
      ]
    },
    {
      "cells": [
        "325070760",
        "JPMorgan Chase"
      ]
    },
    {
      "cells": [
        "026009593",
        "Bank of America N.A."
      ]
    },
    {
      "cells": [
        "042000398",
        "PNC Bank"
      ]
    },
    {
      "cells": [
        "022000020",
        "HSBC Bank USA, N.A"
      ]
    },
    {
      "cells": [
        "122105155",
        "US Bank"
      ]
    },
    {
      "cells": [
        "063107513",
        "Wells Fargo"
      ]
    },
    {
      "cells": [
        "221172610",
        "Citibank"
      ]
    },
    {
      "cells": [
        "061000104",
        "SunTrust"
      ]
    }
  ]
});
formatter.scenario({
  "name": "The user can see the bank of the routing number entered",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@BankingInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid routing number: \"325070760\"",
  "keyword": "When "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAValidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees the name of the bank: \"JPMorgan Chase\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BankingInfoSteps.theUserSeesTheNameOfTheBank(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user can see the bank of the routing number entered",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@BankingInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid routing number: \"026009593\"",
  "keyword": "When "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAValidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees the name of the bank: \"Bank of America N.A.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BankingInfoSteps.theUserSeesTheNameOfTheBank(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user can see the bank of the routing number entered",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@BankingInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid routing number: \"042000398\"",
  "keyword": "When "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAValidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees the name of the bank: \"PNC Bank\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BankingInfoSteps.theUserSeesTheNameOfTheBank(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user can see the bank of the routing number entered",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@BankingInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid routing number: \"022000020\"",
  "keyword": "When "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAValidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees the name of the bank: \"HSBC Bank USA, N.A\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BankingInfoSteps.theUserSeesTheNameOfTheBank(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user can see the bank of the routing number entered",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@BankingInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid routing number: \"122105155\"",
  "keyword": "When "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAValidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees the name of the bank: \"US Bank\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BankingInfoSteps.theUserSeesTheNameOfTheBank(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user can see the bank of the routing number entered",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@BankingInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid routing number: \"063107513\"",
  "keyword": "When "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAValidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees the name of the bank: \"Wells Fargo\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BankingInfoSteps.theUserSeesTheNameOfTheBank(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user can see the bank of the routing number entered",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@BankingInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid routing number: \"221172610\"",
  "keyword": "When "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAValidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees the name of the bank: \"Citibank\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BankingInfoSteps.theUserSeesTheNameOfTheBank(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user can see the bank of the routing number entered",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@BankingInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid routing number: \"061000104\"",
  "keyword": "When "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAValidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees the name of the bank: \"SunTrust\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BankingInfoSteps.theUserSeesTheNameOfTheBank(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "The user cannot enter a routing number with less than 9 characters",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters an invalid routing number: \"\u003croutingNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user should see the validation message: \"\u003cvalidationMsg\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "routingNumber",
        "validationMsg"
      ]
    },
    {
      "cells": [
        "222",
        "Must be 9 characters"
      ]
    },
    {
      "cells": [
        "12345",
        "Must be 9 characters"
      ]
    },
    {
      "cells": [
        "12345678",
        "Must be 9 characters"
      ]
    }
  ]
});
formatter.scenario({
  "name": "The user cannot enter a routing number with less than 9 characters",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@BankingInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid routing number: \"222\"",
  "keyword": "When "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAnInvalidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"Must be 9 characters\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user cannot enter a routing number with less than 9 characters",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@BankingInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid routing number: \"12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAnInvalidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"Must be 9 characters\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user cannot enter a routing number with less than 9 characters",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@BankingInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid routing number: \"12345678\"",
  "keyword": "When "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAnInvalidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"Must be 9 characters\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "The user cannot submit the agreement without entering a valid Routing Number",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters an invalid routing number: \"\u003croutingNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user should see the validation message: \"\u003cvalidationMsg\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "routingNumber",
        "validationMsg"
      ]
    },
    {
      "cells": [
        "000000000",
        "We do not accept this bank. Please try a different bank"
      ]
    },
    {
      "cells": [
        "084009519",
        "We do not accept this bank. Please try a different bank"
      ]
    }
  ]
});
formatter.scenario({
  "name": "The user cannot submit the agreement without entering a valid Routing Number",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@BankingInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid routing number: \"000000000\"",
  "keyword": "When "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAnInvalidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"We do not accept this bank. Please try a different bank\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user cannot submit the agreement without entering a valid Routing Number",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@BankingInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid routing number: \"084009519\"",
  "keyword": "When "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAnInvalidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"We do not accept this bank. Please try a different bank\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "After a Routing is rejected, the user can enter a valid one",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters an invalid routing number: \"\u003croutingNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user should see the validation message: \"\u003cvalidationMsg\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user enters a valid routing number: \"\u003cvalidRoutingNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user should not see the validation message: \"\u003cvalidationMsg\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "routingNumber",
        "validationMsg",
        "validRoutingNumber"
      ]
    },
    {
      "cells": [
        "000000000",
        "We do not accept this bank. Please try a different bank",
        "325070760"
      ]
    },
    {
      "cells": [
        "084009519",
        "We do not accept this bank. Please try a different bank",
        "021000021"
      ]
    }
  ]
});
formatter.scenario({
  "name": "After a Routing is rejected, the user can enter a valid one",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@BankingInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid routing number: \"000000000\"",
  "keyword": "And "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAnInvalidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"We do not accept this bank. Please try a different bank\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid routing number: \"325070760\"",
  "keyword": "When "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAValidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should not see the validation message: \"We do not accept this bank. Please try a different bank\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BankingInfoSteps.theUserShouldNotSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "After a Routing is rejected, the user can enter a valid one",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@BankingInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid routing number: \"084009519\"",
  "keyword": "And "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAnInvalidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"We do not accept this bank. Please try a different bank\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid routing number: \"021000021\"",
  "keyword": "When "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAValidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should not see the validation message: \"We do not accept this bank. Please try a different bank\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BankingInfoSteps.theUserShouldNotSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "The user cannot entering an Account Number under 4 characters long",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters an invalid account number: \"\u003caccountNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user should see the validation message: \"\u003cvalidationMsg\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "accountNumber",
        "validationMsg"
      ]
    },
    {
      "cells": [
        "23",
        "4 characters or more"
      ]
    },
    {
      "cells": [
        "123",
        "4 characters or more"
      ]
    }
  ]
});
formatter.scenario({
  "name": "The user cannot entering an Account Number under 4 characters long",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@BankingInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid account number: \"23\"",
  "keyword": "When "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAnInvalidAccountNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"4 characters or more\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user cannot entering an Account Number under 4 characters long",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@BankingInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid account number: \"123\"",
  "keyword": "When "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAnInvalidAccountNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"4 characters or more\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "The user cannot submit the agreement if the Account Number and the Confirm Account Number provided are not a match",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters a valid account number: \"\u003caccountNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user enters a non matching account number: \"\u003cconfirmAccNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user should see the validation message: \"\u003cvalidationMsg\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "accountNumber",
        "confirmAccNumber",
        "validationMsg"
      ]
    },
    {
      "cells": [
        "3333333333",
        "9876543210",
        "Mismatched Account Number"
      ]
    }
  ]
});
formatter.scenario({
  "name": "The user cannot submit the agreement if the Account Number and the Confirm Account Number provided are not a match",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@BankingInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid account number: \"3333333333\"",
  "keyword": "When "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAValidAccountNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a non matching account number: \"9876543210\"",
  "keyword": "And "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersANonMatchingAccountNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"Mismatched Account Number\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "The user can enter a matching Account Number after the first Confirm Account Number provided is not a match",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters a valid account number: \"\u003caccountNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user enters a non matching account number: \"\u003cnotMatchingAccNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user should see the validation message: \"\u003cvalidationMsg\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user enters a matching account number: \"\u003cconfirmAccNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user should not see the validation message: \"\u003cvalidationMsg\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "accountNumber",
        "notMatchingAccNumber",
        "validationMsg",
        "confirmAccNumber"
      ]
    },
    {
      "cells": [
        "3333333333",
        "9876543210",
        "Mismatched Account Number",
        "3333333333"
      ]
    }
  ]
});
formatter.scenario({
  "name": "The user can enter a matching Account Number after the first Confirm Account Number provided is not a match",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@BankingInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid account number: \"3333333333\"",
  "keyword": "And "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAValidAccountNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a non matching account number: \"9876543210\"",
  "keyword": "And "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersANonMatchingAccountNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"Mismatched Account Number\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a matching account number: \"3333333333\"",
  "keyword": "When "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAMatchingAccountNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should not see the validation message: \"Mismatched Account Number\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BankingInfoSteps.theUserShouldNotSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/pp3/DecisionScreen.feature");
formatter.feature({
  "name": "As user I should be able to apply for a lease/loan and land on the decision screen",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@Decision"
    }
  ]
});
formatter.scenarioOutline({
  "name": "The user should land on the Decision Screen with an approval decision",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters a valid routing number: \"\u003croutingNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user enters a valid account number: \"\u003caccountNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user enters a matching account number: \"\u003cconfirmAccNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on the button: \"Submit Application\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user lands on the Decision Screen with decision: \"\u003cdecision\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "routingNumber",
        "accountNumber",
        "confirmAccNumber",
        "decision"
      ]
    },
    {
      "cells": [
        "325070760",
        "3333333333",
        "3333333333",
        "You were approved for a spending limit of"
      ]
    },
    {
      "cells": [
        "021000021",
        "9876543210",
        "9876543210",
        "You were approved for a spending limit of"
      ]
    },
    {
      "cells": [
        "011401533",
        "1357924680",
        "1357924680",
        "You were approved for a spending limit of"
      ]
    },
    {
      "cells": [
        "011401533",
        "1234567890",
        "1234567890",
        "You were approved for a spending limit of"
      ]
    }
  ]
});
formatter.scenario({
  "name": "The user should land on the Decision Screen with an approval decision",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@Decision"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid routing number: \"325070760\"",
  "keyword": "And "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAValidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid account number: \"3333333333\"",
  "keyword": "And "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAValidAccountNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a matching account number: \"3333333333\"",
  "keyword": "And "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAMatchingAccountNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Submit Application\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Decision Screen with decision: \"You were approved for a spending limit of\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DecisionSteps.theUserLandsOnTheDecisionScreenWithDecision(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user should land on the Decision Screen with an approval decision",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@Decision"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid routing number: \"021000021\"",
  "keyword": "And "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAValidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid account number: \"9876543210\"",
  "keyword": "And "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAValidAccountNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a matching account number: \"9876543210\"",
  "keyword": "And "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAMatchingAccountNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Submit Application\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Decision Screen with decision: \"You were approved for a spending limit of\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DecisionSteps.theUserLandsOnTheDecisionScreenWithDecision(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user should land on the Decision Screen with an approval decision",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@Decision"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid routing number: \"011401533\"",
  "keyword": "And "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAValidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid account number: \"1357924680\"",
  "keyword": "And "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAValidAccountNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a matching account number: \"1357924680\"",
  "keyword": "And "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAMatchingAccountNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Submit Application\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Decision Screen with decision: \"You were approved for a spending limit of\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DecisionSteps.theUserLandsOnTheDecisionScreenWithDecision(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user should land on the Decision Screen with an approval decision",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@Decision"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Banking Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BankingInfoSteps.theUserIsOnTheBankingInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid routing number: \"011401533\"",
  "keyword": "And "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAValidRoutingNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid account number: \"1234567890\"",
  "keyword": "And "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAValidAccountNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a matching account number: \"1234567890\"",
  "keyword": "And "
});
formatter.match({
  "location": "BankingInfoSteps.theUserEntersAMatchingAccountNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Submit Application\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Decision Screen with decision: \"You were approved for a spending limit of\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DecisionSteps.theUserLandsOnTheDecisionScreenWithDecision(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "The user should be able to apply whit different pay frequencies",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Personal Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user completes the Personal Info screen with pay frequency: \"\u003cpayFrequency\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user completes the Banking Info screen",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on the button: \"Submit Application\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user lands on the Decision Screen with decision: \"\u003cdecision\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "payFrequency",
        "decision"
      ]
    },
    {
      "cells": [
        "Weekly",
        "You were approved for a spending limit of"
      ]
    },
    {
      "cells": [
        "Bi-Weekly",
        "You were approved for a spending limit of"
      ]
    },
    {
      "cells": [
        "Semi-Monthly",
        "You were approved for a spending limit of"
      ]
    },
    {
      "cells": [
        "Monthly",
        "You were approved for a spending limit of"
      ]
    }
  ]
});
formatter.scenario({
  "name": "The user should be able to apply whit different pay frequencies",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@Decision"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Personal Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserIsOnThePersonalInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user completes the Personal Info screen with pay frequency: \"Weekly\"",
  "keyword": "And "
});
formatter.match({
  "location": "DecisionSteps.theUserCompletesThePersonalInfoScreenWithPayFrequency(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user completes the Banking Info screen",
  "keyword": "And "
});
formatter.match({
  "location": "DecisionSteps.theUserCompletesTheBankingInfoScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Submit Application\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for condition (element to be clickable: [[ChromeDriver: chrome on WINDOWS (e88583d317604652d5b8e851c9ce490d)] -\u003e id: formSubmitButton]) to be refreshed (tried for 20 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027REM-XPS-ANAVAS\u0027, ip: \u002710.0.0.131\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_345\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 107.0.5304.108, chrome: {chromedriverVersion: 107.0.5304.62 (1eec40d3a576..., userDataDir: C:\\Users\\ANTONI~1.NAV\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:59726}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: e88583d317604652d5b8e851c9ce490d\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat utils.helpers.WebElementHelpers.webClickJSExecutor(WebElementHelpers.java:60)\r\n\tat pages.pp3.EmailPage.clickOnContinueBtn(EmailPage.java:170)\r\n\tat stepdefinitions.pp3.EmailSteps.theUserClicksOnTheButton(EmailSteps.java:37)\r\n\tat ✽.the user clicks on the button: \"Submit Application\"(file:src/test/java/features/pp3/DecisionScreen.feature:22)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the user lands on the Decision Screen with decision: \"You were approved for a spending limit of\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DecisionSteps.theUserLandsOnTheDecisionScreenWithDecision(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user should be able to apply whit different pay frequencies",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@Decision"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Personal Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserIsOnThePersonalInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user completes the Personal Info screen with pay frequency: \"Bi-Weekly\"",
  "keyword": "And "
});
formatter.match({
  "location": "DecisionSteps.theUserCompletesThePersonalInfoScreenWithPayFrequency(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user completes the Banking Info screen",
  "keyword": "And "
});
formatter.match({
  "location": "DecisionSteps.theUserCompletesTheBankingInfoScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Submit Application\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for condition (element to be clickable: [[ChromeDriver: chrome on WINDOWS (52e7568df672f0d1bcb16a6416ce9a2d)] -\u003e id: formSubmitButton]) to be refreshed (tried for 20 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027REM-XPS-ANAVAS\u0027, ip: \u002710.0.0.131\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_345\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 107.0.5304.108, chrome: {chromedriverVersion: 107.0.5304.62 (1eec40d3a576..., userDataDir: C:\\Users\\ANTONI~1.NAV\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:61129}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 52e7568df672f0d1bcb16a6416ce9a2d\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat utils.helpers.WebElementHelpers.webClickJSExecutor(WebElementHelpers.java:60)\r\n\tat pages.pp3.EmailPage.clickOnContinueBtn(EmailPage.java:170)\r\n\tat stepdefinitions.pp3.EmailSteps.theUserClicksOnTheButton(EmailSteps.java:37)\r\n\tat ✽.the user clicks on the button: \"Submit Application\"(file:src/test/java/features/pp3/DecisionScreen.feature:22)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the user lands on the Decision Screen with decision: \"You were approved for a spending limit of\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DecisionSteps.theUserLandsOnTheDecisionScreenWithDecision(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user should be able to apply whit different pay frequencies",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@Decision"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Personal Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserIsOnThePersonalInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user completes the Personal Info screen with pay frequency: \"Semi-Monthly\"",
  "keyword": "And "
});
formatter.match({
  "location": "DecisionSteps.theUserCompletesThePersonalInfoScreenWithPayFrequency(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user completes the Banking Info screen",
  "keyword": "And "
});
formatter.match({
  "location": "DecisionSteps.theUserCompletesTheBankingInfoScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Submit Application\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for condition (element to be clickable: [[ChromeDriver: chrome on WINDOWS (572618f2ee4f51271f34e66aafb00355)] -\u003e id: formSubmitButton]) to be refreshed (tried for 20 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027REM-XPS-ANAVAS\u0027, ip: \u002710.0.0.131\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_345\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 107.0.5304.108, chrome: {chromedriverVersion: 107.0.5304.62 (1eec40d3a576..., userDataDir: C:\\Users\\ANTONI~1.NAV\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:62280}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 572618f2ee4f51271f34e66aafb00355\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat utils.helpers.WebElementHelpers.webClickJSExecutor(WebElementHelpers.java:60)\r\n\tat pages.pp3.EmailPage.clickOnContinueBtn(EmailPage.java:170)\r\n\tat stepdefinitions.pp3.EmailSteps.theUserClicksOnTheButton(EmailSteps.java:37)\r\n\tat ✽.the user clicks on the button: \"Submit Application\"(file:src/test/java/features/pp3/DecisionScreen.feature:22)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the user lands on the Decision Screen with decision: \"You were approved for a spending limit of\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DecisionSteps.theUserLandsOnTheDecisionScreenWithDecision(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user should be able to apply whit different pay frequencies",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@Decision"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Personal Info screen with email: \"decisionscreen@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserIsOnThePersonalInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user completes the Personal Info screen with pay frequency: \"Monthly\"",
  "keyword": "And "
});
formatter.match({
  "location": "DecisionSteps.theUserCompletesThePersonalInfoScreenWithPayFrequency(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user completes the Banking Info screen",
  "keyword": "And "
});
formatter.match({
  "location": "DecisionSteps.theUserCompletesTheBankingInfoScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Submit Application\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for condition (element to be clickable: [[ChromeDriver: chrome on WINDOWS (27a9e21fad7f5c90dceeab7b5cad8738)] -\u003e id: formSubmitButton]) to be refreshed (tried for 20 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027REM-XPS-ANAVAS\u0027, ip: \u002710.0.0.131\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_345\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 107.0.5304.108, chrome: {chromedriverVersion: 107.0.5304.62 (1eec40d3a576..., userDataDir: C:\\Users\\ANTONI~1.NAV\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:63183}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 27a9e21fad7f5c90dceeab7b5cad8738\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\r\n\tat utils.helpers.WebElementHelpers.webClickJSExecutor(WebElementHelpers.java:60)\r\n\tat pages.pp3.EmailPage.clickOnContinueBtn(EmailPage.java:170)\r\n\tat stepdefinitions.pp3.EmailSteps.theUserClicksOnTheButton(EmailSteps.java:37)\r\n\tat ✽.the user clicks on the button: \"Submit Application\"(file:src/test/java/features/pp3/DecisionScreen.feature:22)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the user lands on the Decision Screen with decision: \"You were approved for a spending limit of\"",
  "keyword": "Then "
});
formatter.match({
  "location": "DecisionSteps.theUserLandsOnTheDecisionScreenWithDecision(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/pp3/EmailScreen.feature");
formatter.feature({
  "name": "As a customer I should be able to enter the email in the login email",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@Email"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Existing Customer lands on the Password screen",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Email screen",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters a valid existing email address: \"\u003cemail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user lands on the Password screen",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "nann40547@gmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Existing Customer lands on the Password screen",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@Email"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Email screen",
  "keyword": "Given "
});
formatter.match({
  "location": "EmailSteps.theUserIsOnTheEmailScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid existing email address: \"nann40547@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserEntersAValidExistingEmailAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Password screen",
  "keyword": "Then "
});
formatter.match({
  "location": "EmailSteps.theUserLandsOnThePasswordScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "New Customer lands on the Profile Info screen",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Email screen",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters a valid no-registered email address: \"\u003cemail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user lands on the Profile Info screen",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "flexshopper1017@gmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "New Customer lands on the Profile Info screen",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@Email"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Email screen",
  "keyword": "Given "
});
formatter.match({
  "location": "EmailSteps.theUserIsOnTheEmailScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid no-registered email address: \"flexshopper1017@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserEntersAValidNoRegisteredEmailAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Profile Info screen",
  "keyword": "Then "
});
formatter.match({
  "location": "EmailSteps.theUserLandsOnTheProfileInfoScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User cannot log in with an invalid email address",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Email screen",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters an invalid email address: \"\u003cemail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user sees the following validation message: \"\u003cvalidationMsg\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "validationMsg"
      ]
    },
    {
      "cells": [
        "abcde@flexshopper",
        "Invalid email address"
      ]
    },
    {
      "cells": [
        "a.abcde@flexshopper",
        "Invalid email address"
      ]
    },
    {
      "cells": [
        "Abcde@flexshopper.c",
        "Invalid email address"
      ]
    },
    {
      "cells": [
        "",
        "Invalid email address"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User cannot log in with an invalid email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@Email"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Email screen",
  "keyword": "Given "
});
formatter.match({
  "location": "EmailSteps.theUserIsOnTheEmailScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid email address: \"abcde@flexshopper\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserEntersAnInvalidEmailAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees the following validation message: \"Invalid email address\"",
  "keyword": "Then "
});
formatter.match({
  "location": "EmailSteps.theUserSeesTheFollowingValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User cannot log in with an invalid email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@Email"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Email screen",
  "keyword": "Given "
});
formatter.match({
  "location": "EmailSteps.theUserIsOnTheEmailScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid email address: \"a.abcde@flexshopper\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserEntersAnInvalidEmailAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees the following validation message: \"Invalid email address\"",
  "keyword": "Then "
});
formatter.match({
  "location": "EmailSteps.theUserSeesTheFollowingValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User cannot log in with an invalid email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@Email"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Email screen",
  "keyword": "Given "
});
formatter.match({
  "location": "EmailSteps.theUserIsOnTheEmailScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid email address: \"Abcde@flexshopper.c\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserEntersAnInvalidEmailAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees the following validation message: \"Invalid email address\"",
  "keyword": "Then "
});
formatter.match({
  "location": "EmailSteps.theUserSeesTheFollowingValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User cannot log in with an invalid email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@Email"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Email screen",
  "keyword": "Given "
});
formatter.match({
  "location": "EmailSteps.theUserIsOnTheEmailScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid email address: \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserEntersAnInvalidEmailAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees the following validation message: \"Invalid email address\"",
  "keyword": "Then "
});
formatter.match({
  "location": "EmailSteps.theUserSeesTheFollowingValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User cannot log in with a bad constructed email address",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Email screen",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters an invalid email address: \"\u003cemail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user sees the following HTML validation message: \"\u003cvalidationMsg\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "validationMsg"
      ]
    },
    {
      "cells": [
        "a",
        "Please include an \u0027@\u0027 in the email address."
      ]
    },
    {
      "cells": [
        "@",
        "Please enter a part followed by \u0027@\u0027."
      ]
    },
    {
      "cells": [
        "@aa",
        "Please enter a part followed by \u0027@\u0027."
      ]
    },
    {
      "cells": [
        "@aa.com",
        "Please enter a part followed by \u0027@\u0027."
      ]
    }
  ]
});
formatter.scenario({
  "name": "User cannot log in with a bad constructed email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@Email"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Email screen",
  "keyword": "Given "
});
formatter.match({
  "location": "EmailSteps.theUserIsOnTheEmailScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid email address: \"a\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserEntersAnInvalidEmailAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees the following HTML validation message: \"Please include an \u0027@\u0027 in the email address.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "EmailSteps.theUserSeesTheFollowingHTMLValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User cannot log in with a bad constructed email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@Email"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Email screen",
  "keyword": "Given "
});
formatter.match({
  "location": "EmailSteps.theUserIsOnTheEmailScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid email address: \"@\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserEntersAnInvalidEmailAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees the following HTML validation message: \"Please enter a part followed by \u0027@\u0027.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "EmailSteps.theUserSeesTheFollowingHTMLValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User cannot log in with a bad constructed email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@Email"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Email screen",
  "keyword": "Given "
});
formatter.match({
  "location": "EmailSteps.theUserIsOnTheEmailScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid email address: \"@aa\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserEntersAnInvalidEmailAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees the following HTML validation message: \"Please enter a part followed by \u0027@\u0027.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "EmailSteps.theUserSeesTheFollowingHTMLValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User cannot log in with a bad constructed email address",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@Email"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Email screen",
  "keyword": "Given "
});
formatter.match({
  "location": "EmailSteps.theUserIsOnTheEmailScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid email address: \"@aa.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserEntersAnInvalidEmailAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees the following HTML validation message: \"Please enter a part followed by \u0027@\u0027.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "EmailSteps.theUserSeesTheFollowingHTMLValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/pp3/ForgotPasswordScreen.feature");
formatter.feature({
  "name": "As user I should be able to change the password",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Chrome"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@ForgotPassword"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User with full information in the profile can see the email and the phone number provided",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Forgot Password screen with email: \"\u003cemail\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user should see the email: \"\u003cemail\u003e\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "the user should see the phone number: \"\u003cphoneNumber\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "phoneNumber"
      ]
    },
    {
      "cells": [
        "startdrift@gmail.com",
        "xxx-xxx-2917"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User with full information in the profile can see the email and the phone number provided",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Chrome"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@ForgotPassword"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Forgot Password screen with email: \"startdrift@gmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserIsOnTheForgotPasswordScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the email: \"startdrift@gmail.com\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserShouldSeeTheEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the phone number: \"xxx-xxx-2917\"",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserShouldSeeThePhoneNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User is able to return to the Email screen",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Forgot Password screen with email: \"\u003cemail\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user clicks on the link: \"Return to Password Sign In\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user lands on the Email screen",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "startdrift@gmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User is able to return to the Email screen",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Chrome"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@ForgotPassword"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Forgot Password screen with email: \"startdrift@gmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserIsOnTheForgotPasswordScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the link: \"Return to Password Sign In\"",
  "keyword": "When "
});
formatter.match({
  "location": "PasswordSteps.theUserClicksOnTheLink(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Email screen",
  "keyword": "Then "
});
formatter.match({
  "location": "PasswordSteps.theUserLandsOnTheEmailScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User with email information in the profile should see the \"Verification Code\" screen",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Forgot Password screen with email: \"\u003cemail\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the Send Email radio button is selected",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user lands on the Verification Code screen",
  "keyword": "Then "
});
formatter.step({
  "name": "the user should see the email: \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "startdrift@gmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User with email information in the profile should see the \"Verification Code\" screen",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Chrome"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@ForgotPassword"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Forgot Password screen with email: \"startdrift@gmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserIsOnTheForgotPasswordScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Send Email radio button is selected",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPasswordSteps.theSendEmailRadioButtonIsSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Verification Code screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserLandsOnTheVerificationCodeScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the email: \"startdrift@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserShouldSeeTheEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User with phone information in the profile should see the \"Verification Code\" screen",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Forgot Password screen with email: \"\u003cemail\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the Send SMS radio button is selected",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user lands on the Verification Code screen",
  "keyword": "Then "
});
formatter.step({
  "name": "the user should see the phone number: \"\u003cphoneNumber\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "phoneNumber"
      ]
    },
    {
      "cells": [
        "startdrift@gmail.com",
        "xxx-xxx-2917"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User with phone information in the profile should see the \"Verification Code\" screen",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Chrome"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@ForgotPassword"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Forgot Password screen with email: \"startdrift@gmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserIsOnTheForgotPasswordScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Send SMS radio button is selected",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPasswordSteps.theSendSMSRadioButtonIsSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Verification Code screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserLandsOnTheVerificationCodeScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the phone number: \"xxx-xxx-2917\"",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserShouldSeeThePhoneNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User should be able to click on the \"No code received?\" link when the Verification Code is not received in the email",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Forgot Password screen with email: \"\u003cemail\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the Send Email radio button is selected",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user lands on the Verification Code screen",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on the link: \"No Code received?\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user lands on the Forgot Password screen",
  "keyword": "Then "
});
formatter.step({
  "name": "the user should see the email: \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "startdrift@gmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should be able to click on the \"No code received?\" link when the Verification Code is not received in the email",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Chrome"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@ForgotPassword"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Forgot Password screen with email: \"startdrift@gmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserIsOnTheForgotPasswordScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Send Email radio button is selected",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPasswordSteps.theSendEmailRadioButtonIsSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Verification Code screen",
  "keyword": "When "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserLandsOnTheVerificationCodeScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the link: \"No Code received?\"",
  "keyword": "And "
});
formatter.match({
  "location": "PasswordSteps.theUserClicksOnTheLink(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Forgot Password screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserLandsOnTheForgotPasswordScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the email: \"startdrift@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserShouldSeeTheEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User should be able to click on the \"No code received?\" link when the Verification Code is not received on the phone",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Forgot Password screen with email: \"\u003cemail\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the Send SMS radio button is selected",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user lands on the Verification Code screen",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on the button: \"No Code received?\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user lands on the Forgot Password screen",
  "keyword": "Then "
});
formatter.step({
  "name": "the user should see the email: \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user should see the phone number: \"\u003cphoneNumber\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "phoneNumber"
      ]
    },
    {
      "cells": [
        "startdrift@gmail.com",
        "xxx-xxx-2917"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should be able to click on the \"No code received?\" link when the Verification Code is not received on the phone",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Chrome"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@ForgotPassword"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Forgot Password screen with email: \"startdrift@gmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserIsOnTheForgotPasswordScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Send SMS radio button is selected",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPasswordSteps.theSendSMSRadioButtonIsSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Verification Code screen",
  "keyword": "When "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserLandsOnTheVerificationCodeScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"No Code received?\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Forgot Password screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserLandsOnTheForgotPasswordScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the email: \"startdrift@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserShouldSeeTheEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the phone number: \"xxx-xxx-2917\"",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserShouldSeeThePhoneNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User should be able to retrieve the verification code from an email message",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Forgot Password screen with email: \"\u003cemail\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the Send Email radio button is selected",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user lands on the Verification Code screen",
  "keyword": "And "
});
formatter.step({
  "name": "the user enters the Verification Code in the field",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on the button: \"Submit\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user lands on the Change Password screen",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "FlexShopperAutomation@gmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should be able to retrieve the verification code from an email message",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Chrome"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@ForgotPassword"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Forgot Password screen with email: \"FlexShopperAutomation@gmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserIsOnTheForgotPasswordScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Send Email radio button is selected",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPasswordSteps.theSendEmailRadioButtonIsSelected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Verification Code screen",
  "keyword": "And "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserLandsOnTheVerificationCodeScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters the Verification Code in the field",
  "keyword": "When "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserEntersTheVerificationCodeInTheField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Submit\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Change Password screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ForgotPasswordSteps.theUserLandsOnTheChangePasswordScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/pp3/PasswordScreen.feature");
formatter.feature({
  "name": "As an existing customer I should be able to enter the password in the password screen",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@Password"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Existing Customer lands on the Homepage as logged in user",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Password screen with email: \"startdrift@gmail.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters a valid password: \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on the button: \"Sign In\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user lands on the Homepage as logged in user: \"\u003cuser\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "password",
        "user"
      ]
    },
    {
      "cells": [
        "test123",
        "stanislav kuleshov"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Existing Customer lands on the Homepage as logged in user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@Password"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Password screen with email: \"startdrift@gmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PasswordSteps.theUserIsOnThePasswordScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid password: \"test123\"",
  "keyword": "When "
});
formatter.match({
  "location": "PasswordSteps.theUserEntersAValidPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Sign In\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Homepage as logged in user: \"stanislav kuleshov\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PasswordSteps.theUserLandsOnTheHomepageAsLoggedInUser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User is able to return to the Email screen",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Password screen with email: \"\u003cemail\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user clicks on the link: \"Not You?\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user lands on the Email screen",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "startdrift@gmail.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User is able to return to the Email screen",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@Password"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Password screen with email: \"startdrift@gmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PasswordSteps.theUserIsOnThePasswordScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the link: \"Not You?\"",
  "keyword": "When "
});
formatter.match({
  "location": "PasswordSteps.theUserClicksOnTheLink(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Email screen",
  "keyword": "Then "
});
formatter.match({
  "location": "PasswordSteps.theUserLandsOnTheEmailScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Existing Customer cannot log in with an invalid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Password screen with email: \"nann40547@gmail.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters an invalid password: \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on the button: \"Sign In\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user should see the validation error message: \"\u003cerrorMsg\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "password",
        "errorMsg"
      ]
    },
    {
      "cells": [
        "test",
        "Invalid email or password: please check your details and try again"
      ]
    },
    {
      "cells": [
        "123test",
        "Invalid email or password: please check your details and try again"
      ]
    },
    {
      "cells": [
        "a_B%%%%%%%%as",
        "Invalid email or password: please check your details and try again"
      ]
    },
    {
      "cells": [
        "a.a@abc@abc@ab",
        "Invalid email or password: please check your details and try again"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Existing Customer cannot log in with an invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@Password"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Password screen with email: \"nann40547@gmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PasswordSteps.theUserIsOnThePasswordScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid password: \"test\"",
  "keyword": "When "
});
formatter.match({
  "location": "PasswordSteps.theUserEntersAnInvalidPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Sign In\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation error message: \"Invalid email or password: please check your details and try again\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PasswordSteps.theUserShouldSeeTheValidationErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Existing Customer cannot log in with an invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@Password"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Password screen with email: \"nann40547@gmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PasswordSteps.theUserIsOnThePasswordScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid password: \"123test\"",
  "keyword": "When "
});
formatter.match({
  "location": "PasswordSteps.theUserEntersAnInvalidPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Sign In\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation error message: \"Invalid email or password: please check your details and try again\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PasswordSteps.theUserShouldSeeTheValidationErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Existing Customer cannot log in with an invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@Password"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Password screen with email: \"nann40547@gmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PasswordSteps.theUserIsOnThePasswordScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid password: \"a_B%%%%%%%%as\"",
  "keyword": "When "
});
formatter.match({
  "location": "PasswordSteps.theUserEntersAnInvalidPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Sign In\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation error message: \"Invalid email or password: please check your details and try again\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PasswordSteps.theUserShouldSeeTheValidationErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Existing Customer cannot log in with an invalid password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@Password"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Password screen with email: \"nann40547@gmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PasswordSteps.theUserIsOnThePasswordScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid password: \"a.a@abc@abc@ab\"",
  "keyword": "When "
});
formatter.match({
  "location": "PasswordSteps.theUserEntersAnInvalidPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Sign In\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation error message: \"Invalid email or password: please check your details and try again\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PasswordSteps.theUserShouldSeeTheValidationErrorMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Existing Customer cannot log in without a password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Password screen with email: \"nann40547@gmail.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters blank: \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on the button: \"Sign In\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user should see the required validation message: \"\u003cerrorMsg\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "password",
        "errorMsg"
      ]
    },
    {
      "cells": [
        "",
        "Required"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Existing Customer cannot log in without a password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@Password"
    },
    {
      "name": "@PP3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Password screen with email: \"nann40547@gmail.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PasswordSteps.theUserIsOnThePasswordScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters blank: \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "PasswordSteps.theUserEntersBlank(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Sign In\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the required validation message: \"Required\"",
  "keyword": "Then "
});
formatter.match({
  "location": "PasswordSteps.theUserShouldSeeTheRequiredValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/pp3/PersonalInfoScreen.feature");
formatter.feature({
  "name": "As user I should be able to land on the Personal Info Screen",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@PersonalInfo"
    }
  ]
});
formatter.scenarioOutline({
  "name": "The user cannot enter an invalid date of birth",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Personal Info screen with email: \"personalinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters an invalid DOB: \"\u003cDOB\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user should see the validation message: \"\u003cvalidationMsg\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "DOB",
        "validationMsg"
      ]
    },
    {
      "cells": [
        "00000000",
        "Invalid date"
      ]
    },
    {
      "cells": [
        "13102000",
        "Invalid date"
      ]
    },
    {
      "cells": [
        "12322000",
        "Invalid date"
      ]
    }
  ]
});
formatter.scenario({
  "name": "The user cannot enter an invalid date of birth",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@PersonalInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Personal Info screen with email: \"personalinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserIsOnThePersonalInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid DOB: \"00000000\"",
  "keyword": "When "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserEntersAnInvalidDOB(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"Invalid date\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user cannot enter an invalid date of birth",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@PersonalInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Personal Info screen with email: \"personalinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserIsOnThePersonalInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid DOB: \"13102000\"",
  "keyword": "When "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserEntersAnInvalidDOB(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"Invalid date\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user cannot enter an invalid date of birth",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@PersonalInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Personal Info screen with email: \"personalinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserIsOnThePersonalInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid DOB: \"12322000\"",
  "keyword": "When "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserEntersAnInvalidDOB(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"Invalid date\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "The user cannot enter less than 9 characters in the SSN",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Personal Info screen with email: \"personalinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters an invalid SSN: \"\u003cSSN\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user should see the validation message: \"\u003cvalidationMsg\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "SSN",
        "validationMsg"
      ]
    },
    {
      "cells": [
        "12345678",
        "Must be 9 characters"
      ]
    },
    {
      "cells": [
        "1234",
        "Must be 9 characters"
      ]
    }
  ]
});
formatter.scenario({
  "name": "The user cannot enter less than 9 characters in the SSN",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@PersonalInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Personal Info screen with email: \"personalinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserIsOnThePersonalInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid SSN: \"12345678\"",
  "keyword": "When "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserEntersAnInvalidSSN(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"Must be 9 characters\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user cannot enter less than 9 characters in the SSN",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@PersonalInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Personal Info screen with email: \"personalinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserIsOnThePersonalInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid SSN: \"1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserEntersAnInvalidSSN(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"Must be 9 characters\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "The user should land on Banking info screen",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Personal Info screen with email: \"personalinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters a valid date of birth: \"\u003cDOB\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user enters a valid SSN: \"\u003cSSN\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user enters a valid gross income: \"\u003cincome\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user selects a valid pay frequency: \"\u003cpayFrequency\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on the agreement button",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user lands on the Banking Info Screen",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "DOB",
        "SSN",
        "income",
        "payFrequency"
      ]
    },
    {
      "cells": [
        "01011971",
        "362563215",
        "1000",
        "Weekly"
      ]
    },
    {
      "cells": [
        "01011980",
        "078051120",
        "2500",
        "Bi-Weekly"
      ]
    },
    {
      "cells": [
        "01012000",
        "666051120",
        "3500",
        "Semi-Monthly"
      ]
    },
    {
      "cells": [
        "01011951",
        "999051120",
        "5000",
        "Monthly"
      ]
    },
    {
      "cells": [
        "01012002",
        "357002345",
        "8000",
        "Monthly"
      ]
    }
  ]
});
formatter.scenario({
  "name": "The user should land on Banking info screen",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@PersonalInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Personal Info screen with email: \"personalinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserIsOnThePersonalInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid date of birth: \"01011971\"",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserEntersAValidDateOfBirth(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid SSN: \"362563215\"",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserEntersAValidSSN(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid gross income: \"1000\"",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserEntersAValidGrossIncome(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects a valid pay frequency: \"Weekly\"",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserSelectsAValidPayFrequency(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the agreement button",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserClicksOnTheAgreementButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Banking Info Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserLandsOnTheBankingInfoScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user should land on Banking info screen",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@PersonalInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Personal Info screen with email: \"personalinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserIsOnThePersonalInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid date of birth: \"01011980\"",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserEntersAValidDateOfBirth(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid SSN: \"078051120\"",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserEntersAValidSSN(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid gross income: \"2500\"",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserEntersAValidGrossIncome(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects a valid pay frequency: \"Bi-Weekly\"",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserSelectsAValidPayFrequency(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the agreement button",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserClicksOnTheAgreementButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Banking Info Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserLandsOnTheBankingInfoScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user should land on Banking info screen",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@PersonalInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Personal Info screen with email: \"personalinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserIsOnThePersonalInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid date of birth: \"01012000\"",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserEntersAValidDateOfBirth(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid SSN: \"666051120\"",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserEntersAValidSSN(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid gross income: \"3500\"",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserEntersAValidGrossIncome(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects a valid pay frequency: \"Semi-Monthly\"",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserSelectsAValidPayFrequency(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the agreement button",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserClicksOnTheAgreementButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Banking Info Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserLandsOnTheBankingInfoScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user should land on Banking info screen",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@PersonalInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Personal Info screen with email: \"personalinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserIsOnThePersonalInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid date of birth: \"01011951\"",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserEntersAValidDateOfBirth(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid SSN: \"999051120\"",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserEntersAValidSSN(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid gross income: \"5000\"",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserEntersAValidGrossIncome(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects a valid pay frequency: \"Monthly\"",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserSelectsAValidPayFrequency(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the agreement button",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserClicksOnTheAgreementButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Banking Info Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserLandsOnTheBankingInfoScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user should land on Banking info screen",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@PersonalInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Personal Info screen with email: \"personalinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserIsOnThePersonalInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid date of birth: \"01012002\"",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserEntersAValidDateOfBirth(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid SSN: \"357002345\"",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserEntersAValidSSN(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid gross income: \"8000\"",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserEntersAValidGrossIncome(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects a valid pay frequency: \"Monthly\"",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserSelectsAValidPayFrequency(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the agreement button",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserClicksOnTheAgreementButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "When "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Banking Info Screen",
  "keyword": "Then "
});
formatter.match({
  "location": "PersonalInfoSteps.theUserLandsOnTheBankingInfoScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/pp3/ProfileInfoScreen.feature");
formatter.feature({
  "name": "As user I should be able to land on the Profile Info Screen",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@ProfileInfo"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User can navigate back to the Email screen if the email shown is not his",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"\u003cemail\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the email address shown is not his: \"\u003cexpectedEmail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on the link: \"Not You?\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user lands on the Email screen",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "profileinfo@flexshopper.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User can navigate back to the Email screen if the email shown is not his",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@ProfileInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserIsOnTheProfileInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the email address shown is not his: \"\u003cexpectedEmail\u003e\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theEmailAddressShownIsNotHis(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the link: \"Not You?\"",
  "keyword": "When "
});
formatter.match({
  "location": "PasswordSteps.theUserClicksOnTheLink(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Email screen",
  "keyword": "Then "
});
formatter.match({
  "location": "PasswordSteps.theUserLandsOnTheEmailScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User should see additional fields when the user clicks on the \"Enter Address Manually\" link",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"\u003cemail\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user clicks on the link: \"Enter Address Manually\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user should see the hidden address fields",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "profileinfo@flexshopper.com"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should see additional fields when the user clicks on the \"Enter Address Manually\" link",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@ProfileInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserIsOnTheProfileInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the link: \"Enter Address Manually\"",
  "keyword": "When "
});
formatter.match({
  "location": "PasswordSteps.theUserClicksOnTheLink(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the hidden address fields",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheHiddenAddressFields()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User cannot enter special characters in the First Name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters an invalid first name: \"\u003cfirstName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user should see the validation message: \"\u003cvalidationMsg\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstName",
        "validationMsg"
      ]
    },
    {
      "cells": [
        "Flex@",
        "No special characters"
      ]
    },
    {
      "cells": [
        "12345",
        "No special characters"
      ]
    },
    {
      "cells": [
        "",
        "No special characters"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User cannot enter special characters in the First Name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@ProfileInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserIsOnTheProfileInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid first name: \"Flex@\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAnInvalidFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"No special characters\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User cannot enter special characters in the First Name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@ProfileInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserIsOnTheProfileInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid first name: \"12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAnInvalidFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"No special characters\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User cannot enter special characters in the First Name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@ProfileInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserIsOnTheProfileInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid first name: \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAnInvalidFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"No special characters\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User cannot enter special characters in the Last Name",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters an invalid last name: \"\u003clastName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user should see the validation message: \"\u003cvalidationMsg\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "lastName",
        "validationMsg"
      ]
    },
    {
      "cells": [
        "Flex@",
        "No special characters"
      ]
    },
    {
      "cells": [
        "12345",
        "No special characters"
      ]
    },
    {
      "cells": [
        "",
        "No special characters"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User cannot enter special characters in the Last Name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@ProfileInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserIsOnTheProfileInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid last name: \"Flex@\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAnInvalidLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"No special characters\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User cannot enter special characters in the Last Name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@ProfileInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserIsOnTheProfileInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid last name: \"12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAnInvalidLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"No special characters\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User cannot enter special characters in the Last Name",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@ProfileInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserIsOnTheProfileInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid last name: \"\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAnInvalidLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"No special characters\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User cannot enter less than 10 characters in the Mobile Number",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters an invalid mobile number: \"\u003cmobileNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user should see the validation message: \"\u003cvalidationMsg\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "mobileNumber",
        "validationMsg"
      ]
    },
    {
      "cells": [
        "12345",
        "Must be 10 characters"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User cannot enter less than 10 characters in the Mobile Number",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@ProfileInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserIsOnTheProfileInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid mobile number: \"12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAnInvalidMobileNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"Must be 10 characters\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User cannot enter less than 5 characters in the Zip Code",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user clicks on the link: \"Enter Address Manually\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user enters an invalid zip code: \"\u003czipCode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user should see the validation message: \"\u003cvalidationMsg\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "zipCode",
        "validationMsg"
      ]
    },
    {
      "cells": [
        "1234",
        "Must be 5 characters"
      ]
    },
    {
      "cells": [
        "1",
        "Must be 5 characters"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User cannot enter less than 5 characters in the Zip Code",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@ProfileInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserIsOnTheProfileInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the link: \"Enter Address Manually\"",
  "keyword": "When "
});
formatter.match({
  "location": "PasswordSteps.theUserClicksOnTheLink(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid zip code: \"1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAnInvalidZipCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"Must be 5 characters\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User cannot enter less than 5 characters in the Zip Code",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@ProfileInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserIsOnTheProfileInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the link: \"Enter Address Manually\"",
  "keyword": "When "
});
formatter.match({
  "location": "PasswordSteps.theUserClicksOnTheLink(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid zip code: \"1\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAnInvalidZipCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the validation message: \"Must be 5 characters\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeTheValidationMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User can select a valid matching address from the address suggestions list",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters a valid address: \"\u003cpartialAddress\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user should see address suggestions",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "partialAddress",
        "withText"
      ]
    },
    {
      "cells": [
        "2700 N Military Trl",
        "33409"
      ]
    },
    {
      "cells": [
        "6503 N Military Trl",
        "Apt 2700"
      ]
    },
    {
      "cells": [
        "901 Yama",
        "SC"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User can select a valid matching address from the address suggestions list",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@ProfileInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserIsOnTheProfileInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid address: \"2700 N Military Trl\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAValidAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see address suggestions",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeAddressSuggestions()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User can select a valid matching address from the address suggestions list",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@ProfileInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserIsOnTheProfileInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid address: \"6503 N Military Trl\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAValidAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see address suggestions",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeAddressSuggestions()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User can select a valid matching address from the address suggestions list",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@ProfileInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserIsOnTheProfileInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid address: \"901 Yama\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAValidAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see address suggestions",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldSeeAddressSuggestions()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User cannot see address suggestions is an invalid address is entered",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters an invalid address: \"\u003cinvalidAddress\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user should not see address suggestions",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "invalidAddress"
      ]
    },
    {
      "cells": [
        "801 POOH RD"
      ]
    },
    {
      "cells": [
        "901 Yamato Rd"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User cannot see address suggestions is an invalid address is entered",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@ProfileInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserIsOnTheProfileInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid address: \"801 POOH RD\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAnInvalidAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should not see address suggestions",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldNotSeeAddressSuggestions()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User cannot see address suggestions is an invalid address is entered",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@ProfileInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"profileinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserIsOnTheProfileInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters an invalid address: \"901 Yamato Rd\"",
  "keyword": "When "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAnInvalidAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should not see address suggestions",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserShouldNotSeeAddressSuggestions()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User should land on the Personal Info screen when the address is entered manually",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"personalinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters a valid first name: \"\u003cfirstName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user enters a valid last name: \"\u003clastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user enters a valid mobile number: \"\u003cmobileNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user enters a valid address: \"\u003caddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on the link: \"Enter Address Manually\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user enters a valid unit number: \"\u003cunit\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user enters a valid city: \"\u003ccity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user selects a valid state: \"\u003cstate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user enters a valid zip code: \"\u003czipCode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user lands on the Personal Info screen",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "mobileNumber",
        "address",
        "unit",
        "city",
        "state",
        "zipCode"
      ]
    },
    {
      "cells": [
        "PersonalInfo",
        "User",
        "18553539289",
        "901 Yamato Rd",
        "260",
        "Boca Raton",
        "FL",
        "33431"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should land on the Personal Info screen when the address is entered manually",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@ProfileInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"personalinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserIsOnTheProfileInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid first name: \"PersonalInfo\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAValidFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid last name: \"User\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAValidLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid mobile number: \"18553539289\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAValidMobileNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid address: \"901 Yamato Rd\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAValidAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the link: \"Enter Address Manually\"",
  "keyword": "When "
});
formatter.match({
  "location": "PasswordSteps.theUserClicksOnTheLink(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid unit number: \"260\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAValidUnitNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid city: \"Boca Raton\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAValidCity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects a valid state: \"FL\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserSelectsAValidState(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid zip code: \"33431\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAValidZipCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Personal Info screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserLandsOnThePersonalInfoScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User should land on Personal Info screen when Sign me up is not checked",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"personalinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters a valid first name: \"\u003cfirstName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user enters a valid last name: \"\u003clastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user enters a valid mobile number: \"\u003cmobileNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user enters a valid address: \"\u003caddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on the link: \"Enter Address Manually\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user enters a valid unit number: \"\u003cunit\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user enters a valid city: \"\u003ccity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user selects a valid state: \"\u003cstate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user enters a valid zip code: \"\u003czipCode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on the Sign me up checkbox",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user lands on the Personal Info screen",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "mobileNumber",
        "address",
        "unit",
        "city",
        "state",
        "zipCode"
      ]
    },
    {
      "cells": [
        "PersonalInfo",
        "User",
        "18553539289",
        "901 Yamato Rd",
        "260",
        "Boca Raton",
        "FL",
        "33431"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should land on Personal Info screen when Sign me up is not checked",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Web"
    },
    {
      "name": "@PP3"
    },
    {
      "name": "@ProfileInfo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Profile Info screen with email: \"personalinfo@flexshopper.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserIsOnTheProfileInfoScreenWithEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid first name: \"PersonalInfo\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAValidFirstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid last name: \"User\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAValidLastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid mobile number: \"18553539289\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAValidMobileNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid address: \"901 Yamato Rd\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAValidAddress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the link: \"Enter Address Manually\"",
  "keyword": "When "
});
formatter.match({
  "location": "PasswordSteps.theUserClicksOnTheLink(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid unit number: \"260\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAValidUnitNumber(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid city: \"Boca Raton\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAValidCity(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects a valid state: \"FL\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserSelectsAValidState(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a valid zip code: \"33431\"",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserEntersAValidZipCode(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the Sign me up checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserClicksOnTheSignMeUpCheckbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the button: \"Continue\"",
  "keyword": "And "
});
formatter.match({
  "location": "EmailSteps.theUserClicksOnTheButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user lands on the Personal Info screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileInfoSteps.theUserLandsOnThePersonalInfoScreen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});