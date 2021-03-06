package net.lightbody.timecloud.api;

import net.lightbody.timecloud.api.TimeCloudException;

public class DatabaseAlreadyExistsException extends TimeCloudException {
    public DatabaseAlreadyExistsException() {
        super("Database already exists, please try another name", 500);
    }
}
