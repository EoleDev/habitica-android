package com.habitrpg.android.habitica.events.commands;

import com.magicmicky.habitrpgwrapper.lib.models.Tag;

/**
 * Created by jjbillings on 8/16/16.
 */
public class EditTagCommand {
    public Tag tag;

    public EditTagCommand(Tag tag) {
        this.tag = tag;
    }
}
