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

import org.eclipse.persistence.tools.workbench.framework.context.WorkbenchContext;
import org.eclipse.persistence.tools.workbench.mappingsmodel.descriptor.MWMappingDescriptor;
import org.eclipse.persistence.tools.workbench.mappingsmodel.descriptor.xml.MWEisDescriptor;
import org.eclipse.persistence.tools.workbench.mappingsmodel.mapping.MWMapping;
import org.eclipse.persistence.tools.workbench.mappingsmodel.mapping.xml.MWEisOneToOneMapping;
import org.eclipse.persistence.tools.workbench.mappingsmodel.meta.MWClassAttribute;
import org.eclipse.persistence.tools.workbench.mappingsplugin.ui.mapping.ChangeMappingTypeAction;


final class MapAsEisOneToOneAction extends ChangeMappingTypeAction
{
	MapAsEisOneToOneAction(WorkbenchContext context) {
		super(context);
	}

	protected void initialize() {
		super.initialize();
		initializeIcon("mapping.eisOneToOne");
		initializeText("MAP_AS_EIS_ONE_TO_ONE_ACTION");
		initializeMnemonic("MAP_AS_EIS_ONE_TO_ONE_ACTION");
		initializeToolTipText("MAP_AS_EIS_ONE_TO_ONE_ACTION.toolTipText");
	}


	protected MWMapping morphMapping(MWMapping mapping) {
		return mapping.asMWEisOneToOneMapping();
	}
	
	protected MWMapping addMapping(MWMappingDescriptor descriptor, MWClassAttribute attribute) {
		return ((MWEisDescriptor) descriptor).addEisOneToOneMapping(attribute);
	}

	protected Class mappingClass() {
		return MWEisOneToOneMapping.class;
	}

}
