package net.optionfactory.whatsapp.dto.messages.builder;

import net.optionfactory.whatsapp.dto.messages.Action;
import net.optionfactory.whatsapp.dto.messages.InteractiveMessage;
import net.optionfactory.whatsapp.dto.messages.type.InteractiveMessageType;

/**
 * The interface Interactive message builder.
 */
public interface IInteractiveMessageBuilder {

    /**
     * The interface Interactive action.
     */
    interface IInteractiveAction {
        /**
         * Sets action.
         *
         * @param action the action
         * @return the action
         */
        IInteractiveType setAction(Action action);
    }

    /**
     * The interface Interactive type.
     */
    interface IInteractiveType {
        /**
         * Sets type.
         *
         * @param type the type
         * @return the type
         */
        InteractiveMessage setType(InteractiveMessageType type);
    }

}
