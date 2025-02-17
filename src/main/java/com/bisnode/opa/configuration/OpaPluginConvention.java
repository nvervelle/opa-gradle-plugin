package com.bisnode.opa.configuration;

import javax.annotation.Nullable;

import com.bisnode.opa.OpaPlugin;
import org.gradle.api.plugins.Convention;

/**
 * <p>The {@link Convention} used for configuring the {@link OpaPlugin}.</p>
 */
public abstract class OpaPluginConvention {

    public abstract ExecutableMode getMode();

    public abstract void setMode(ExecutableMode mode);

    public abstract String getLocation();

    public abstract void setLocation(String location);

    @Nullable public abstract String getVersion();

    public abstract void setVersion(String version);

    public abstract String getSrcDir();

    public abstract void setSrcDir(String srcDir);

    public abstract String getTestDir();

    public abstract void setTestDir(String testDir);

}
