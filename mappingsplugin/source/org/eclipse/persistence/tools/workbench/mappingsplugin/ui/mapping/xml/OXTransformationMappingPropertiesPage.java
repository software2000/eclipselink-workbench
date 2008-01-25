/*******************************************************************************
* Copyright (c) 2007 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the terms of
* the Eclipse Public License v1.0, which accompanies this distribution and is available at
* http://www.eclipse.org/legal/epl-v10.html.
*
* Contributors:
*     Oracle - initial API and implementation
******************************************************************************/
package org.eclipse.persistence.tools.workbench.mappingsplugin.ui.mapping.xml;

import java.awt.Component;

import org.eclipse.persistence.tools.workbench.framework.context.WorkbenchContext;
import org.eclipse.persistence.tools.workbench.framework.ui.view.TitledPropertiesPage;
import org.eclipse.persistence.tools.workbench.mappingsplugin.ui.common.UiCommonBundle;
import org.eclipse.persistence.tools.workbench.mappingsplugin.ui.mapping.UiMappingBundle;
import org.eclipse.persistence.tools.workbench.mappingsplugin.ui.xml.UiXmlBundle;


public final class OXTransformationMappingPropertiesPage 
	extends TitledPropertiesPage
{
	// this value is queried reflectively during plug-in initialization
	private static final Class[] REQUIRED_RESOURCE_BUNDLES = new Class[] {
        UiCommonBundle.class,
        UiXmlBundle.class,
        UiMappingBundle.class,
        UiMappingXmlBundle.class
    };

	// **************** Constructors ******************************************
	
	OXTransformationMappingPropertiesPage(WorkbenchContext context) {
		super(context);
	}
	
	// **************** Initialization ****************************************
	
	protected Component buildPage() {

		return new XmlTransformationMappingPropertiesPage(getNodeHolder(), getWorkbenchContextHolder(), "mapping.xmlTransformation");
	}
}