/*
 * Endpoint Test Results API
 * Retrieve results for scheduled and dynamic tests on endpoint agents.
 *
 * The version of the OpenAPI document: 7.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.thousandeyes;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
                .registerTypeSelector(com.thousandeyes.api.model.EndpointAgentSelectorConfig.class, new TypeSelector<com.thousandeyes.api.model.EndpointAgentSelectorConfig>() {
                    @Override
                    public Class<? extends com.thousandeyes.api.model.EndpointAgentSelectorConfig> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("EndpointAgentLabelsSelectorConfig", com.thousandeyes.api.model.EndpointAgentLabelsSelectorConfig.class);
                        classByDiscriminatorValue.put("EndpointAllAgentsSelectorConfig", com.thousandeyes.api.model.EndpointAllAgentsSelectorConfig.class);
                        classByDiscriminatorValue.put("EndpointSpecificAgentsSelectorConfig", com.thousandeyes.api.model.EndpointSpecificAgentsSelectorConfig.class);
                        classByDiscriminatorValue.put("agent-labels", com.thousandeyes.api.model.EndpointAgentLabelsSelectorConfig.class);
                        classByDiscriminatorValue.put("all-agents", com.thousandeyes.api.model.EndpointAllAgentsSelectorConfig.class);
                        classByDiscriminatorValue.put("specific-agents", com.thousandeyes.api.model.EndpointSpecificAgentsSelectorConfig.class);
                        classByDiscriminatorValue.put("EndpointAgentSelectorConfig", com.thousandeyes.api.model.EndpointAgentSelectorConfig.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "agentSelectorType"));
                    }
          })
                .registerTypeSelector(com.thousandeyes.api.model.EndpointScheduledTest.class, new TypeSelector<com.thousandeyes.api.model.EndpointScheduledTest>() {
                    @Override
                    public Class<? extends com.thousandeyes.api.model.EndpointScheduledTest> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("EndpointAgentToServerTest", com.thousandeyes.api.model.EndpointAgentToServerTest.class);
                        classByDiscriminatorValue.put("EndpointHttpServerTest", com.thousandeyes.api.model.EndpointHttpServerTest.class);
                        classByDiscriminatorValue.put("agent-to-server", com.thousandeyes.api.model.EndpointAgentToServerTest.class);
                        classByDiscriminatorValue.put("http-server", com.thousandeyes.api.model.EndpointHttpServerTest.class);
                        classByDiscriminatorValue.put("EndpointScheduledTest", com.thousandeyes.api.model.EndpointScheduledTest.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.AccountGroupId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.AsnDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.CpuUtilization.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.DynamicBaseTestResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.DynamicBaseTestResultWebex.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.DynamicTest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.DynamicTestLinks.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.DynamicTestLinksSelf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.DynamicTestLinksTestResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.DynamicTestsDataRoundSearch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.DynamicTestsDataSearchFilter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointAgentLabelsSelectorConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointAgentSelectorConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointAgentToServerTest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointAllAgentsSelectorConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointBrowser.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointHttpDataPointScore.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointHttpServerBaseTest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointHttpServerTest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointNetworkTopologyResultRequestFilter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointPingDataPointScore.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointRealUserTest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointRealUserTestBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointRealUserTestDetail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointRealUserTestDetailResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointRealUserTestResultRequestFilter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointRealUserTestResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointResultRequestFilter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointScheduledTest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointSpecificAgentsSelectorConfig.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointTest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointTestAid.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointTestLinks.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointTestLinksSelf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EndpointTestLinksTestResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.Error.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.EthernetProfile.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.GetDynamicTestResultNetworkPathvis200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.GetDynamicTestResultPathvisAgentRound200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.GetEndpointLocalNetworkTopologyDetails200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.GetEndpointLocalNetworks200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.GetEndpointLocalNetworksTopologies200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.GetEndpointLocalNetworksTopologiesRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.GetEndpointRealUserTestDetails200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.GetEndpointRealUserTestPagesDetails200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.GetEndpointRealUserTests200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.GetEndpointRealUserTestsNetwork200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.GetEndpointRealUserTestsPages200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.GetEndpointRealUserTestsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.GetTestResultHttpServer200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.GetTestResultNetworkPathvis200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.GetTestResultPathvisAgentRound200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.Hop.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.HttpTestResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.HttpTestResultHeaders.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.HttpTestResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.Link.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.LocalNetworkResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.LocalNetworkResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.LocalNetworkTopologyDetailResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.LocalNetworkTopologyResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.LocalNetworkTopologyResultBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.LocalNetworkTopologyResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.MultiTestIdNetworkTestResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.MultiTestIdTestsDataRoundsSearch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.MultiTestIdTestsDataSearchFilter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.NetworkDynamicTestResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.NetworkDynamicTestResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.NetworkInterface.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.NetworkMetrics.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.NetworkPing.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.NetworkProfile.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.NetworkProxyProfile.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.NetworkProxyProfileProxiesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.NetworkTestResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.NetworkTestResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.NetworkWirelessProfile.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.PaginationNextLink.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.PaginationNextLinkLinks.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.PathVisBaseTestResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.PathVisDetailDynamicTestResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.PathVisDetailDynamicTestResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.PathVisDetailTestResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.PathVisDetailTestResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.PathVisDynamicTestResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.PathVisDynamicTestResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.PathVisEndpoint.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.PathVisHop.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.PathVisRoute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.PathVisTestResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.PathVisTestResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.PhysicalMemoryUsedBytes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.PostFetchDynamicTestResultMetrics200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.PostFetchTestResultMetrics200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.PostFetchTestResultMetricsMultiTest200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.QueryWindow.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.RealUserTestCoordinates.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.RealUserTestNetwork.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.RealUserTestNetworkGatewayPing.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.RealUserTestNetworkPing.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.RealUserTestNetworkResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.RealUserTestNetworkResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.RealUserTestNetworkTraceroute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.RealUserTestNetworkVpnPing.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.RealUserTestNetworkVpnTraceroute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.RealUserTestPage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.RealUserTestPagePageTimings.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.RealUserTestPageResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.RealUserTestPageResults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.SelfLinks.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.SelfLinksLinks.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.SystemMetrics.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.TcpConnect.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.TestResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.TestsDataRoundsSearch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.TestsDataSearchFilter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.TestsDataSearchSort.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.TestsDataThresholdFilter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.TestsDataThresholdFilters.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.Traceroute.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.TracerouteHop.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.UnauthorizedError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.thousandeyes.api.model.VpnProfile.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}