/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * The request to delete a origin access identity.
 */
public class DeleteCloudFrontOriginAccessIdentityRequest extends
        AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The origin access identity's id. */
    private String id;
    /**
     * The value of the ETag header you received from a previous GET or PUT
     * request. For example: E2QWRUHAPOMQZL.
     */
    private String ifMatch;

    /**
     * Default constructor for DeleteCloudFrontOriginAccessIdentityRequest
     * object. Callers should use the setter or fluent setter (with...) methods
     * to initialize the object after creating it.
     */
    public DeleteCloudFrontOriginAccessIdentityRequest() {
    }

    /**
     * Constructs a new DeleteCloudFrontOriginAccessIdentityRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param id
     *        The origin access identity's id.
     * @param ifMatch
     *        The value of the ETag header you received from a previous GET or
     *        PUT request. For example: E2QWRUHAPOMQZL.
     */
    public DeleteCloudFrontOriginAccessIdentityRequest(String id, String ifMatch) {
        setId(id);
        setIfMatch(ifMatch);
    }

    /**
     * The origin access identity's id.
     * 
     * @param id
     *        The origin access identity's id.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The origin access identity's id.
     * 
     * @return The origin access identity's id.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The origin access identity's id.
     * 
     * @param id
     *        The origin access identity's id.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteCloudFrontOriginAccessIdentityRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The value of the ETag header you received from a previous GET or PUT
     * request. For example: E2QWRUHAPOMQZL.
     * 
     * @param ifMatch
     *        The value of the ETag header you received from a previous GET or
     *        PUT request. For example: E2QWRUHAPOMQZL.
     */

    public void setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
    }

    /**
     * The value of the ETag header you received from a previous GET or PUT
     * request. For example: E2QWRUHAPOMQZL.
     * 
     * @return The value of the ETag header you received from a previous GET or
     *         PUT request. For example: E2QWRUHAPOMQZL.
     */

    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * The value of the ETag header you received from a previous GET or PUT
     * request. For example: E2QWRUHAPOMQZL.
     * 
     * @param ifMatch
     *        The value of the ETag header you received from a previous GET or
     *        PUT request. For example: E2QWRUHAPOMQZL.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteCloudFrontOriginAccessIdentityRequest withIfMatch(
            String ifMatch) {
        setIfMatch(ifMatch);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getIfMatch() != null)
            sb.append("IfMatch: " + getIfMatch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCloudFrontOriginAccessIdentityRequest == false)
            return false;
        DeleteCloudFrontOriginAccessIdentityRequest other = (DeleteCloudFrontOriginAccessIdentityRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIfMatch() == null ^ this.getIfMatch() == null)
            return false;
        if (other.getIfMatch() != null
                && other.getIfMatch().equals(this.getIfMatch()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getIfMatch() == null) ? 0 : getIfMatch().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCloudFrontOriginAccessIdentityRequest clone() {
        return (DeleteCloudFrontOriginAccessIdentityRequest) super.clone();
    }
}
