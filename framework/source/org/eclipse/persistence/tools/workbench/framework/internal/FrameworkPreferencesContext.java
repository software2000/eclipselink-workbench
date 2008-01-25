/*******************************************************************************
* Copyright (c) 2007 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the terms of
* the Eclipse Public License v1.0, which accompanies this distribution and is available at
* http://www.eclipse.org/legal/epl-v10.html.
*
* Contributors:
*     Oracle - initial API and implementation
******************************************************************************/
package org.eclipse.persistence.tools.workbench.framework.internal;

import java.util.prefs.Preferences;

import org.eclipse.persistence.tools.workbench.framework.Application;
import org.eclipse.persistence.tools.workbench.framework.NodeManager;
import org.eclipse.persistence.tools.workbench.framework.context.AbstractPreferencesContext;
import org.eclipse.persistence.tools.workbench.framework.help.HelpManager;
import org.eclipse.persistence.tools.workbench.framework.resources.ResourceRepository;
import org.eclipse.persistence.tools.workbench.uitools.app.ValueModel;


/**
 * This context delegates most of its behavior to the application
 * that created it.
 */
final class FrameworkPreferencesContext
	extends AbstractPreferencesContext
{
	private FrameworkApplication application;
	private ValueModel bufferTrigger;


	// ********** constructor **********

	/**
	 * Provide the application that will supply the context.
	 */
	public FrameworkPreferencesContext(FrameworkApplication application, ValueModel bufferTrigger) {
		super();
		this.application = application;
		this.bufferTrigger = bufferTrigger;
	}


	// ********** ApplicationContext implementation **********

	/**
	 * @see org.eclipse.persistence.tools.workbench.framework.ApplicationContext#getApplication()
	 */
	public Application getApplication() {
		return application;
	}

	/**
	 * @see org.eclipse.persistence.tools.workbench.framework.ApplicationContext#getPreferences()
	 */
	public Preferences getPreferences() {
		return application.getRootPreferences();
	}

	/**
	 * @see org.eclipse.persistence.tools.workbench.framework.ApplicationContext#getResourceRepository()
	 */
	public ResourceRepository getResourceRepository() {
		return application.getResourceRepository();
	}

	/**
	 * @see org.eclipse.persistence.tools.workbench.framework.context.ApplicationContext#getNodeManager()
	 */
	public NodeManager getNodeManager() {
		return application.getNodeManager();
	}

	/**
	 * @see org.eclipse.persistence.tools.workbench.framework.ApplicationContext#getHelpManager()
	 */
	public HelpManager getHelpManager() {
		return application.getHelpManager();
	}


	// ********** ApplicationContext implementation **********

	/**
	 * @see PreferencesContext#getBufferTrigger()
	 */
	public ValueModel getBufferTrigger() {
		return bufferTrigger;
	}

}
