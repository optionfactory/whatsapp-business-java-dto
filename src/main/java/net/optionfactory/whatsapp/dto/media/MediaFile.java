package net.optionfactory.whatsapp.dto.media;

/**
 * @param fileName file name
 * @param content  file content
 */
public record MediaFile(String fileName, byte[] content) {
}
