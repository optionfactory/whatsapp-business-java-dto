package net.optionfactory.whatsapp.dto.messages;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The type Audio message.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AudioMessage extends MediaMessage<AudioMessage> {
}
