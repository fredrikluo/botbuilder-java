// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.bot.schema.teams;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.bot.schema.Activity;

import java.util.List;

/**
 * Messaging extension result.
 */
public class MessagingExtensionResult {
    @JsonProperty(value = "attachmentLayout")
    private String attachmentLayout;

    @JsonProperty(value = "type")
    private String type;

    @JsonProperty(value = "attachments")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<MessagingExtensionAttachment> attachments;

    @JsonProperty(value = "suggestedActions")
    private MessagingExtensionSuggestedAction suggestedActions;

    @JsonProperty(value = "text")
    private String text;

    @JsonProperty(value = "activityPreview")
    private Activity activityPreview;

    /**
     * Gets hint for how to deal with multiple attachments.
     * Possible values include: 'list', 'grid'
     * @return The attachment layout hint.
     */
    public String getAttachmentLayout() {
        return attachmentLayout;
    }

    /**
     * Sets hint for how to deal with multiple attachments.
     * Possible values include: 'list', 'grid'
     * @param withAttachmentLayout The attachment layout hint.
     */
    public void setAttachmentLayout(String withAttachmentLayout) {
        attachmentLayout = withAttachmentLayout;
    }

    /**
     * Gets the type of the result. Possible values include:
     * 'result', 'auth', 'config', 'message', 'botMessagePreview'
     * @return The result type.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the result. Possible values include:
     * 'result', 'auth', 'config', 'message', 'botMessagePreview'
     * @param withType The result type.
     */
    public void setType(String withType) {
        type = withType;
    }

    /**
     * Gets (Only when type is result) Attachments.
     * @return The result attachments.
     */
    public List<MessagingExtensionAttachment> getAttachments() {
        return attachments;
    }

    /**
     * Sets (Only when type is result) Attachments.
     * @param withAttachments The result attachments.
     */
    public void setAttachments(List<MessagingExtensionAttachment> withAttachments) {
        attachments = withAttachments;
    }

    /**
     * Gets (Only when type is auth or config) suggested actions.
     * @return The suggested actions.
     */
    public MessagingExtensionSuggestedAction getSuggestedActions() {
        return suggestedActions;
    }

    /**
     * Sets (Only when type is auth or config) suggested actions.
     * @param withSuggestedActions The suggested actions.
     */
    public void setSuggestedActions(MessagingExtensionSuggestedAction withSuggestedActions) {
        suggestedActions = withSuggestedActions;
    }

    /**
     * Gets (Only when type is message) Text.
     * @return The result text.
     */
    public String getText() {
        return text;
    }

    /**
     * Sets (Only when type is message) Text.
     * @param withText The result text.
     */
    public void setText(String withText) {
        text = withText;
    }

    /**
     * Gets (Only when type is botMessagePreview) Message activity.
     * @return The preview Activity.
     */
    public Activity getActivityPreview() {
        return activityPreview;
    }

    /**
     * Sets (Only when type is botMessagePreview) Message activity.
     * @param withActivityPreview The preview Activity.
     */
    public void setActivityPreview(Activity withActivityPreview) {
        activityPreview = withActivityPreview;
    }
}