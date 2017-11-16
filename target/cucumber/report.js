$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OrderTShirt.feature");
formatter.feature({
  "line": 1,
  "name": "Test to Order a TShirt \u0026 Verify the Order in order history",
  "description": "",
  "id": "test-to-order-a-tshirt-\u0026-verify-the-order-in-order-history",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Order a TShirt and Verify item exist in Order History",
  "description": "",
  "id": "test-to-order-a-tshirt-\u0026-verify-the-order-in-order-history;order-a-tshirt-and-verify-item-exist-in-order-history",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user clicks on sign in",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters userName as \"\u003cUserName\u003e\" and password as \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on T-Shirts",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user selects a T-Shirt",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on AddToCart",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user clicks on Proceed to checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user accepts terms and conditions",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user clicks on Proceed to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "select payment type as PayByCheck",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user confirms the order",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user clicks on my orders",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user clicks on order reference",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "verity the \"\u003cItem\u003e\" exist in order history",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "test-to-order-a-tshirt-\u0026-verify-the-order-in-order-history;order-a-tshirt-and-verify-item-exist-in-order-history;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password",
        "Item"
      ],
      "line": 22,
      "id": "test-to-order-a-tshirt-\u0026-verify-the-order-in-order-history;order-a-tshirt-and-verify-item-exist-in-order-history;;1"
    },
    {
      "cells": [
        "automation.practice@gmail.com",
        "Automation123",
        "Faded Short Sleeve T-shirts - Color : Orange, Size : S"
      ],
      "line": 23,
      "id": "test-to-order-a-tshirt-\u0026-verify-the-order-in-order-history;order-a-tshirt-and-verify-item-exist-in-order-history;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 90404804843,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "prerequisite",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user enters the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "OrderTShirtStepDefinition.user_enters_the_URL()"
});
formatter.result({
  "duration": 8960018103,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Order a TShirt and Verify item exist in Order History",
  "description": "",
  "id": "test-to-order-a-tshirt-\u0026-verify-the-order-in-order-history;order-a-tshirt-and-verify-item-exist-in-order-history;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user clicks on sign in",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters userName as \"automation.practice@gmail.com\" and password as \"Automation123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on T-Shirts",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user selects a T-Shirt",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on AddToCart",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user clicks on Proceed to checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user accepts terms and conditions",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user clicks on Proceed to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "select payment type as PayByCheck",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user confirms the order",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user clicks on my orders",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user clicks on order reference",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "verity the \"Faded Short Sleeve T-shirts - Color : Orange, Size : S\" exist in order history",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "OrderTShirtStepDefinition.user_clicks_on_signin()"
});
formatter.result({
  "duration": 9136105831,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "automation.practice@gmail.com",
      "offset": 25
    },
    {
      "val": "Automation123",
      "offset": 73
    }
  ],
  "location": "OrderTShirtStepDefinition.user_enters_userName_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 3827924216,
  "status": "passed"
});
formatter.match({
  "location": "OrderTShirtStepDefinition.user_clicks_on_T_Shirts()"
});
formatter.result({
  "duration": 2343668302,
  "status": "passed"
});
formatter.match({
  "location": "OrderTShirtStepDefinition.user_selects_a_T_Shirt()"
});
formatter.result({
  "duration": 3636358629,
  "status": "passed"
});
formatter.match({
  "location": "OrderTShirtStepDefinition.user_clicks_on_AddToCart()"
});
formatter.result({
  "duration": 373220134,
  "status": "passed"
});
formatter.match({
  "location": "OrderTShirtStepDefinition.user_clicks_on_Proceed_to_checkout_button()"
});
formatter.result({
  "duration": 5331357814,
  "status": "passed"
});
formatter.match({
  "location": "OrderTShirtStepDefinition.user_accepts_terms_and_conditions()"
});
formatter.result({
  "duration": 370032278,
  "status": "passed"
});
formatter.match({
  "location": "OrderTShirtStepDefinition.user_clicks_on_Proceed_to_checkout()"
});
formatter.result({
  "duration": 1106981080,
  "status": "passed"
});
formatter.match({
  "location": "OrderTShirtStepDefinition.select_payment_type_as()"
});
formatter.result({
  "duration": 1228535344,
  "status": "passed"
});
formatter.match({
  "location": "OrderTShirtStepDefinition.user_confirms_the_order()"
});
formatter.result({
  "duration": 1974401732,
  "status": "passed"
});
formatter.match({
  "location": "OrderTShirtStepDefinition.user_clicks_on_my_orders()"
});
formatter.result({
  "duration": 1492817680,
  "status": "passed"
});
formatter.match({
  "location": "OrderTShirtStepDefinition.user_clicks_on_order_reference()"
});
formatter.result({
  "duration": 394625641,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Faded Short Sleeve T-shirts - Color : Orange, Size : S",
      "offset": 12
    }
  ],
  "location": "OrderTShirtStepDefinition.verity_the_exist_in_order_history(String)"
});
formatter.result({
  "duration": 598160964,
  "status": "passed"
});
formatter.after({
  "duration": 6024829071,
  "status": "passed"
});
formatter.uri("UpdatePersonalInformation.feature");
formatter.feature({
  "line": 1,
  "name": "Update Personal Information(FirstName) in My Account. \u0026 Further verify FirstName field appears updated.",
  "description": "",
  "id": "update-personal-information(firstname)-in-my-account.-\u0026-further-verify-firstname-field-appears-updated.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Test to update personal information",
  "description": "",
  "id": "update-personal-information(firstname)-in-my-account.-\u0026-further-verify-firstname-field-appears-updated.;test-to-update-personal-information",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user clicks on sign in",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters userName as \"\u003cUserName\u003e\" and password as \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on my personal information",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user updates first name as \"\u003cFirstName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enters current password as \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks on save button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user clicks on back to your account",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user clicks on my personal information",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "verify first name field appears updated as \"\u003cFirstName\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "update-personal-information(firstname)-in-my-account.-\u0026-further-verify-firstname-field-appears-updated.;test-to-update-personal-information;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password",
        "FirstName"
      ],
      "line": 18,
      "id": "update-personal-information(firstname)-in-my-account.-\u0026-further-verify-firstname-field-appears-updated.;test-to-update-personal-information;;1"
    },
    {
      "cells": [
        "automation.practice@gmail.com",
        "Automation123",
        "Peter"
      ],
      "line": 19,
      "id": "update-personal-information(firstname)-in-my-account.-\u0026-further-verify-firstname-field-appears-updated.;test-to-update-personal-information;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 84842044545,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "prerequisite",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user enters the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "OrderTShirtStepDefinition.user_enters_the_URL()"
});
formatter.result({
  "duration": 3813786890,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Test to update personal information",
  "description": "",
  "id": "update-personal-information(firstname)-in-my-account.-\u0026-further-verify-firstname-field-appears-updated.;test-to-update-personal-information;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user clicks on sign in",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters userName as \"automation.practice@gmail.com\" and password as \"Automation123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on my personal information",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user updates first name as \"Peter\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enters current password as \"Automation123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user clicks on save button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user clicks on back to your account",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user clicks on my personal information",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "verify first name field appears updated as \"Peter\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "OrderTShirtStepDefinition.user_clicks_on_signin()"
});
formatter.result({
  "duration": 1831106047,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "automation.practice@gmail.com",
      "offset": 25
    },
    {
      "val": "Automation123",
      "offset": 73
    }
  ],
  "location": "OrderTShirtStepDefinition.user_enters_userName_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 1881812792,
  "status": "passed"
});
formatter.match({
  "location": "UpdatePersonalInformationStepDefinition.user_clicks_on_my_personal_information()"
});
formatter.result({
  "duration": 1431227466,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Peter",
      "offset": 28
    }
  ],
  "location": "UpdatePersonalInformationStepDefinition.user_updates_first_name_as(String)"
});
formatter.result({
  "duration": 143722949,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Automation123",
      "offset": 33
    }
  ],
  "location": "UpdatePersonalInformationStepDefinition.user_enters_current_password(String)"
});
formatter.result({
  "duration": 81448572,
  "status": "passed"
});
formatter.match({
  "location": "UpdatePersonalInformationStepDefinition.user_clicks_on_save_button()"
});
formatter.result({
  "duration": 1573333901,
  "status": "passed"
});
formatter.match({
  "location": "UpdatePersonalInformationStepDefinition.user_clicks_on_back_to_your_account()"
});
formatter.result({
  "duration": 940916391,
  "status": "passed"
});
formatter.match({
  "location": "UpdatePersonalInformationStepDefinition.user_clicks_on_my_personal_information()"
});
formatter.result({
  "duration": 1094806331,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Peter",
      "offset": 44
    }
  ],
  "location": "UpdatePersonalInformationStepDefinition.verfy_firstName_field(String)"
});
formatter.result({
  "duration": 94066597,
  "status": "passed"
});
formatter.after({
  "duration": 986385935,
  "status": "passed"
});
});