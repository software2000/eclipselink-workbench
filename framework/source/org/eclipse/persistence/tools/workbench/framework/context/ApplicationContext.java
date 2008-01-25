/*******************************************************************************
* Copyright (c) 2007 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the terms of
* the Eclipse Public License v1.0, which accompanies this distribution and is available at
* http://www.eclipse.org/legal/epl-v10.html.
*
* Contributors:
*     Oracle - initial API and implementation
******************************************************************************/
package org.eclipse.persistence.tools.workbench.framework.context;

import java.util.prefs.Preferences;

import org.eclipse.persistence.tools.workbench.framework.Application;
import org.eclipse.persistence.tools.workbench.framework.NodeManager;
import org.eclipse.persistence.tools.workbench.framework.help.HelpManager;
import org.eclipse.persistence.tools.workbench.framework.resources.IconResourceFileNameMap;
import org.eclipse.persistence.tools.workbench.framework.resources.ResourceRepository;


/**
 * This interface defines the "context" passed to the various
 * parts of the application during execution.
 */
public interface ApplicationContext {

	/** Return the Application, used for information about the application (product name, version, etc.). */
	Application getApplication();

	/** Return the preferences used by the application. */
	Preferences getPreferences();

	/** Return a repository of strings, mnemonics, accelerators, and icons. */
	ResourceRepository getResourceRepository();

	/** Return a node manager that maintains all the current nodes. */
	NodeManager getNodeManager();

	/** Return the application's hook into the context-sensitive help (CSH) system. */
	HelpManager getHelpManager();	

	/** Build and return a context with a redirected set of preferences. */
	ApplicationContext buildRedirectedPreferencesContext(String path);

	/** Build and return a context with expanded resources. */
	ApplicationContext buildExpandedResourceRepositoryContext(Class resourceBundleClass, IconResourceFileNameMap iconResourceFileNameMap);

	/** Build and return a context with expanded resources. */
	ApplicationContext buildExpandedResourceRepositoryContext(IconResourceFileNameMap iconResourceFileNameMap);

	/** Build and return a context with expanded resources. */
	ApplicationContext buildExpandedResourceRepositoryContext(Class resourceBundleClass);

}
