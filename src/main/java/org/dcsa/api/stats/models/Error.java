/*
 * StatsAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package org.dcsa.api.stats.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Error type.
 */
public class Error {
    private Integer errorCode;
    private String property;
    private String value;
    private String jsonPath;
    private String errorCodeText;
    private String erorCodeMessage;

    /**
     * Default constructor.
     */
    public Error() {
    }

    /**
     * Initialization constructor.
     * @param  errorCodeText  String value for errorCodeText.
     * @param  errorCode  Integer value for errorCode.
     * @param  property  String value for property.
     * @param  value  String value for value.
     * @param  jsonPath  String value for jsonPath.
     * @param  erorCodeMessage  String value for erorCodeMessage.
     */
    public Error(
            String errorCodeText,
            Integer errorCode,
            String property,
            String value,
            String jsonPath,
            String erorCodeMessage) {
        this.errorCode = errorCode;
        this.property = property;
        this.value = value;
        this.jsonPath = jsonPath;
        this.errorCodeText = errorCodeText;
        this.erorCodeMessage = erorCodeMessage;
    }

    /**
     * Getter for ErrorCode.
     * The detailed error code returned. - `7000-7999` Technical error codes - `8000-8999`
     * Functional error codes - `9000-9999` API provider-specific error codes [Error codes as
     * specified by
     * DCSA](https://dcsa.atlassian.net/wiki/spaces/DTG/pages/197132308/Standard+Error+Codes).
     * @return Returns the Integer
     */
    @JsonGetter("errorCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * Setter for ErrorCode.
     * The detailed error code returned. - `7000-7999` Technical error codes - `8000-8999`
     * Functional error codes - `9000-9999` API provider-specific error codes [Error codes as
     * specified by
     * DCSA](https://dcsa.atlassian.net/wiki/spaces/DTG/pages/197132308/Standard+Error+Codes).
     * @param errorCode Value for Integer
     */
    @JsonSetter("errorCode")
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter for Property.
     * The name of the property causing the error.
     * @return Returns the String
     */
    @JsonGetter("property")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProperty() {
        return property;
    }

    /**
     * Setter for Property.
     * The name of the property causing the error.
     * @param property Value for String
     */
    @JsonSetter("property")
    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * Getter for Value.
     * The value of the property causing the error serialised as a string exactly as in the original
     * request.
     * @return Returns the String
     */
    @JsonGetter("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * The value of the property causing the error serialised as a string exactly as in the original
     * request.
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Getter for JsonPath.
     * A path to the property causing the error, formatted according to
     * [JSONpath](https://github.com/json-path/JsonPath).
     * @return Returns the String
     */
    @JsonGetter("jsonPath")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getJsonPath() {
        return jsonPath;
    }

    /**
     * Setter for JsonPath.
     * A path to the property causing the error, formatted according to
     * [JSONpath](https://github.com/json-path/JsonPath).
     * @param jsonPath Value for String
     */
    @JsonSetter("jsonPath")
    public void setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
    }

    /**
     * Getter for ErrorCodeText.
     * A standard short description corresponding to the `errorCode`.
     * @return Returns the String
     */
    @JsonGetter("errorCodeText")
    public String getErrorCodeText() {
        return errorCodeText;
    }

    /**
     * Setter for ErrorCodeText.
     * A standard short description corresponding to the `errorCode`.
     * @param errorCodeText Value for String
     */
    @JsonSetter("errorCodeText")
    public void setErrorCodeText(String errorCodeText) {
        this.errorCodeText = errorCodeText;
    }

    /**
     * Getter for ErorCodeMessage.
     * A long description corresponding to the `errorCode` with additional information.
     * @return Returns the String
     */
    @JsonGetter("erorCodeMessage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getErorCodeMessage() {
        return erorCodeMessage;
    }

    /**
     * Setter for ErorCodeMessage.
     * A long description corresponding to the `errorCode` with additional information.
     * @param erorCodeMessage Value for String
     */
    @JsonSetter("erorCodeMessage")
    public void setErorCodeMessage(String erorCodeMessage) {
        this.erorCodeMessage = erorCodeMessage;
    }

    /**
     * Converts this Error into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Error [" + "errorCodeText=" + errorCodeText + ", errorCode=" + errorCode
                + ", property=" + property + ", value=" + value + ", jsonPath=" + jsonPath
                + ", erorCodeMessage=" + erorCodeMessage + "]";
    }

    /**
     * Builds a new {@link Error.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Error.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(errorCodeText)
                .errorCode(getErrorCode())
                .property(getProperty())
                .value(getValue())
                .jsonPath(getJsonPath())
                .erorCodeMessage(getErorCodeMessage());
        return builder;
    }

    /**
     * Class to build instances of {@link Error}.
     */
    public static class Builder {
        private String errorCodeText;
        private Integer errorCode;
        private String property;
        private String value;
        private String jsonPath;
        private String erorCodeMessage;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  errorCodeText  String value for errorCodeText.
         */
        public Builder(String errorCodeText) {
            this.errorCodeText = errorCodeText;
        }

        /**
         * Setter for errorCodeText.
         * @param  errorCodeText  String value for errorCodeText.
         * @return Builder
         */
        public Builder errorCodeText(String errorCodeText) {
            this.errorCodeText = errorCodeText;
            return this;
        }

        /**
         * Setter for errorCode.
         * @param  errorCode  Integer value for errorCode.
         * @return Builder
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Setter for property.
         * @param  property  String value for property.
         * @return Builder
         */
        public Builder property(String property) {
            this.property = property;
            return this;
        }

        /**
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for jsonPath.
         * @param  jsonPath  String value for jsonPath.
         * @return Builder
         */
        public Builder jsonPath(String jsonPath) {
            this.jsonPath = jsonPath;
            return this;
        }

        /**
         * Setter for erorCodeMessage.
         * @param  erorCodeMessage  String value for erorCodeMessage.
         * @return Builder
         */
        public Builder erorCodeMessage(String erorCodeMessage) {
            this.erorCodeMessage = erorCodeMessage;
            return this;
        }

        /**
         * Builds a new {@link Error} object using the set fields.
         * @return {@link Error}
         */
        public Error build() {
            return new Error(errorCodeText, errorCode, property, value, jsonPath, erorCodeMessage);
        }
    }
}
