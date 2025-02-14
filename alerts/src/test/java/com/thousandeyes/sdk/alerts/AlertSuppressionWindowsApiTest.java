/*
 * Alerts API
 * You can manage the following alert functionalities on the ThousandEyes platform using the Alerts API:  * **Alerts**: Retrieve alert details. Alerts are assigned to tests through alert rules.  * **Alert Rules**: Conditions that you configure in order to highlight or be notified of events of interest in your ThousandEyes tests. When an alert rule’s conditions are met, the associated alert is triggered and the alert becomes active. It remains active until the alert is cleared. Alert rules are reusable across multiple tests..  * **Alert Suppression Windows**: Suppress alerts for tests during periods such as planned maintenance. Windows can be one-time events or recurring events to handle periodic occurrences such as monthly downtime for maintenance.  For more information about the alerts, see [Alerts](https://docs.thousandeyes.com/product-documentation/alerts). 
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes.sdk.alerts;

import com.thousandeyes.sdk.alerts.model.AlertSuppressionWindowDetail;
import com.thousandeyes.sdk.alerts.model.AlertSuppressionWindowRequest;
import com.thousandeyes.sdk.alerts.model.AlertSuppressionWindows;
import com.thousandeyes.sdk.alerts.model.Error;
import com.thousandeyes.sdk.alerts.model.ExpandAlertTestOptions;
import java.net.URI;
import com.thousandeyes.sdk.alerts.model.UnauthorizedError;
import com.thousandeyes.sdk.alerts.model.ValidationError;
import static com.thousandeyes.sdk.serialization.JSON.getDefault;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * Request and Response model deserialization tests for AlertSuppressionWindowsApi
 */
public class AlertSuppressionWindowsApiTest {
    // private final AlertSuppressionWindowsApi api = new AlertSuppressionWindowsApi();
    private final ObjectMapper mapper = getDefault()
            .getMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
    
    /**
     * Create alert suppression window
     * <p>
     * Creates a new alert suppression window in ThousandEyes, using the  provided POST data. Only Account Admins can create alert suppression windows.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void createAlertSuppressionWindowRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "duration" : 0,
                  "alertSuppressionWindowId" : "2411",
                  "tests" : [ "71687", "71687" ],
                  "isEnabled" : false,
                  "repeat" : {
                    "intervalType" : "day",
                    "intervalLength" : 2,
                    "type" : "week",
                    "daysOfWeek" : [ "sun", "sun" ]
                  },
                  "endRepeat" : {
                    "date" : "2017-07-01",
                    "count" : 3,
                    "type" : "never"
                  },
                  "name" : "Monthly maintenance",
                  "startDate" : "2017-07-01T05:00:00Z",
                  "status" : "ended"
                }
                                 """;
        AlertSuppressionWindowRequest mappedRequest = 
                mapper.readValue(requestBodyJson, AlertSuppressionWindowRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "duration" : 0,
                  "alertSuppressionWindowId" : "2411",
                  "tests" : [ {
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                      } ],
                      "self" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      }
                    },
                    "liveShare" : false,
                    "savedEvent" : true,
                    "description" : "ThousandEyes Test",
                    "type" : "agent-to-server",
                    "enabled" : true,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 60,
                    "modifiedBy" : "user@user.com",
                    "testId" : "281474976710706",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test"
                  }, {
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                      } ],
                      "self" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      }
                    },
                    "liveShare" : false,
                    "savedEvent" : true,
                    "description" : "ThousandEyes Test",
                    "type" : "agent-to-server",
                    "enabled" : true,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 60,
                    "modifiedBy" : "user@user.com",
                    "testId" : "281474976710706",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test"
                  } ],
                  "_links" : {
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "isEnabled" : false,
                  "repeat" : {
                    "intervalType" : "day",
                    "intervalLength" : 2,
                    "type" : "week",
                    "daysOfWeek" : [ "sun", "sun" ]
                  },
                  "endRepeat" : {
                    "date" : "2017-07-01",
                    "count" : 3,
                    "type" : "never"
                  },
                  "name" : "Monthly maintenance",
                  "startDate" : "2017-07-01T05:00:00Z",
                  "status" : "ended"
                }
                                  """;
        AlertSuppressionWindowDetail mappedResponse = 
                mapper.readValue(responseBodyJson, AlertSuppressionWindowDetail.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Delete alert suppression window
     * <p>
     * Deletes an alert suppression window.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    @Disabled
    @Test
    public void deleteAlertSuppressionWindowRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

    }
    
    /**
     * Retrieve alert suppression window
     * <p>
     * Returns detailed information about an alert suppression window configured in your account group.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getAlertSuppressionWindowRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "duration" : 0,
                  "alertSuppressionWindowId" : "2411",
                  "tests" : [ {
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                      } ],
                      "self" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      }
                    },
                    "liveShare" : false,
                    "savedEvent" : true,
                    "description" : "ThousandEyes Test",
                    "type" : "agent-to-server",
                    "enabled" : true,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 60,
                    "modifiedBy" : "user@user.com",
                    "testId" : "281474976710706",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test"
                  }, {
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                      } ],
                      "self" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      }
                    },
                    "liveShare" : false,
                    "savedEvent" : true,
                    "description" : "ThousandEyes Test",
                    "type" : "agent-to-server",
                    "enabled" : true,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 60,
                    "modifiedBy" : "user@user.com",
                    "testId" : "281474976710706",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test"
                  } ],
                  "_links" : {
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "isEnabled" : false,
                  "repeat" : {
                    "intervalType" : "day",
                    "intervalLength" : 2,
                    "type" : "week",
                    "daysOfWeek" : [ "sun", "sun" ]
                  },
                  "endRepeat" : {
                    "date" : "2017-07-01",
                    "count" : 3,
                    "type" : "never"
                  },
                  "name" : "Monthly maintenance",
                  "startDate" : "2017-07-01T05:00:00Z",
                  "status" : "ended"
                }
                                  """;
        AlertSuppressionWindowDetail mappedResponse = 
                mapper.readValue(responseBodyJson, AlertSuppressionWindowDetail.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * List alert suppression windows
     * <p>
     * Returns a list of all alert suppression windows configured in your account group.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void getAlertSuppressionWindowsRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {

        String responseBodyJson = """
                {
                  "_links" : {
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "alertSuppressionWindows" : [ {
                    "duration" : 0,
                    "alertSuppressionWindowId" : "2411",
                    "_links" : {
                      "self" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      }
                    },
                    "isEnabled" : false,
                    "repeat" : {
                      "intervalType" : "day",
                      "intervalLength" : 2,
                      "type" : "week",
                      "daysOfWeek" : [ "sun", "sun" ]
                    },
                    "endRepeat" : {
                      "date" : "2017-07-01",
                      "count" : 3,
                      "type" : "never"
                    },
                    "name" : "Monthly maintenance",
                    "startDate" : "2017-07-01T05:00:00Z",
                    "status" : "ended"
                  }, {
                    "duration" : 0,
                    "alertSuppressionWindowId" : "2411",
                    "_links" : {
                      "self" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      }
                    },
                    "isEnabled" : false,
                    "repeat" : {
                      "intervalType" : "day",
                      "intervalLength" : 2,
                      "type" : "week",
                      "daysOfWeek" : [ "sun", "sun" ]
                    },
                    "endRepeat" : {
                      "date" : "2017-07-01",
                      "count" : 3,
                      "type" : "never"
                    },
                    "name" : "Monthly maintenance",
                    "startDate" : "2017-07-01T05:00:00Z",
                    "status" : "ended"
                  } ]
                }
                                  """;
        AlertSuppressionWindows mappedResponse = 
                mapper.readValue(responseBodyJson, AlertSuppressionWindows.class);
        assertNotNull(mappedResponse);
    }
    
    /**
     * Update alert suppression window
     * <p>
     * Updates an alert suppression window in ThousandEyes, using the  provided POST data. Only Account Admins can update alert suppression windows.
     *
     * @throws JsonProcessingException if the deserialization fails
     */
    
    @Test
    public void updateAlertSuppressionWindowRequestAndResponseDeserializationTest()
            throws JsonProcessingException 
    {
        String requestBodyJson = """
                {
                  "duration" : 0,
                  "alertSuppressionWindowId" : "2411",
                  "tests" : [ "71687", "71687" ],
                  "isEnabled" : false,
                  "repeat" : {
                    "intervalType" : "day",
                    "intervalLength" : 2,
                    "type" : "week",
                    "daysOfWeek" : [ "sun", "sun" ]
                  },
                  "endRepeat" : {
                    "date" : "2017-07-01",
                    "count" : 3,
                    "type" : "never"
                  },
                  "name" : "Monthly maintenance",
                  "startDate" : "2017-07-01T05:00:00Z",
                  "status" : "ended"
                }
                                 """;
        AlertSuppressionWindowRequest mappedRequest = 
                mapper.readValue(requestBodyJson, AlertSuppressionWindowRequest.class);
        assertNotNull(mappedRequest);

        String responseBodyJson = """
                {
                  "duration" : 0,
                  "alertSuppressionWindowId" : "2411",
                  "tests" : [ {
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                      } ],
                      "self" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      }
                    },
                    "liveShare" : false,
                    "savedEvent" : true,
                    "description" : "ThousandEyes Test",
                    "type" : "agent-to-server",
                    "enabled" : true,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 60,
                    "modifiedBy" : "user@user.com",
                    "testId" : "281474976710706",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test"
                  }, {
                    "_links" : {
                      "testResults" : [ {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/network"
                      }, {
                        "href" : "https://api.thousandeyes.com/v7/test-results/281474976710706/path-vis"
                      } ],
                      "self" : {
                        "hreflang" : "hreflang",
                        "templated" : true,
                        "profile" : "profile",
                        "name" : "name",
                        "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                        "type" : "type",
                        "deprecation" : "deprecation",
                        "title" : "title"
                      }
                    },
                    "liveShare" : false,
                    "savedEvent" : true,
                    "description" : "ThousandEyes Test",
                    "type" : "agent-to-server",
                    "enabled" : true,
                    "createdDate" : "2022-07-17T22:00:54Z",
                    "createdBy" : "user@user.com",
                    "modifiedDate" : "2022-07-17T22:00:54Z",
                    "interval" : 60,
                    "modifiedBy" : "user@user.com",
                    "testId" : "281474976710706",
                    "alertsEnabled" : true,
                    "testName" : "ThousandEyes Test"
                  } ],
                  "_links" : {
                    "self" : {
                      "hreflang" : "hreflang",
                      "templated" : true,
                      "profile" : "profile",
                      "name" : "name",
                      "href" : "https://api.thousandeyes.com/v7/link/to/resource/id",
                      "type" : "type",
                      "deprecation" : "deprecation",
                      "title" : "title"
                    }
                  },
                  "isEnabled" : false,
                  "repeat" : {
                    "intervalType" : "day",
                    "intervalLength" : 2,
                    "type" : "week",
                    "daysOfWeek" : [ "sun", "sun" ]
                  },
                  "endRepeat" : {
                    "date" : "2017-07-01",
                    "count" : 3,
                    "type" : "never"
                  },
                  "name" : "Monthly maintenance",
                  "startDate" : "2017-07-01T05:00:00Z",
                  "status" : "ended"
                }
                                  """;
        AlertSuppressionWindowDetail mappedResponse = 
                mapper.readValue(responseBodyJson, AlertSuppressionWindowDetail.class);
        assertNotNull(mappedResponse);
    }
    
}
