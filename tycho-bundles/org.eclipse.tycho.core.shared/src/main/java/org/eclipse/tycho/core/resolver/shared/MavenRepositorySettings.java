/*******************************************************************************
 * Copyright (c) 2012, 2013 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP AG - initial API and implementation
 *******************************************************************************/
package org.eclipse.tycho.core.resolver.shared;

/**
 * Provides the mirror configuration and credentials from the Maven settings for loading remote p2
 * repositories.
 */
public interface MavenRepositorySettings {

    public final class Credentials {
        private final String userName;
        private final String password;

        public Credentials(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }

        public String getUserName() {
            return userName;
        }

        public String getPassword() {
            return password;
        }
    }

    /**
     * Returns the configured mirror URL, or <code>null</code>.
     */
    MavenRepositoryLocation getMirror(MavenRepositoryLocation location);

    /**
     * Returns the configured credentials for the given repository, or <code>null</code>.
     */
    Credentials getCredentials(MavenRepositoryLocation location);

}
