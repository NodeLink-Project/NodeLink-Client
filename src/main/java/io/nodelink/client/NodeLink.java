package io.nodelink.client;

import io.nodelink.client.log.Logger;

public class NodeLink extends NodeLinkHelper {

    private static NodeLink INSTANCE = new NodeLink();

    public static void main(String[] args) {
        getHelper().initTerminal();

    }


    /// Getters ///

    public static NodeLink getInstance() {
        return INSTANCE;
    }

    public Logger getLogger() {
        return Logger.getLoggerSingleton();
    }

}
