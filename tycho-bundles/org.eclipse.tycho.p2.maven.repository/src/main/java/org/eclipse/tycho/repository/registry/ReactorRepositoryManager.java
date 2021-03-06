/*******************************************************************************
 * Copyright (c) 2012, 2015 SAP SE and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP SE - initial API and implementation
 *******************************************************************************/
package org.eclipse.tycho.repository.registry;

import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;
import org.eclipse.tycho.ReactorProject;
import org.eclipse.tycho.ReactorProjectIdentities;
import org.eclipse.tycho.repository.publishing.PublishingRepository;
import org.eclipse.tycho.repository.registry.facade.ReactorRepositoryManagerFacade;

public interface ReactorRepositoryManager extends ReactorRepositoryManagerFacade {

    IProvisioningAgent getAgent();

    public IMetadataRepository getFinalTargetPlatformMetadataRepository(ReactorProject project);

    /**
     * Returns the project's publishing repository.
     * 
     * @param project
     *            a reference to a project in the reactor.
     */
    @Override
    PublishingRepository getPublishingRepository(ReactorProjectIdentities project);

}
