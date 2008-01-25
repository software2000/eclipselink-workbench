/*******************************************************************************
* Copyright (c) 2007 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the terms of
* the Eclipse Public License v1.0, which accompanies this distribution and is available at
* http://www.eclipse.org/legal/epl-v10.html.
*
* Contributors:
*     Oracle - initial API and implementation
******************************************************************************/
package org.eclipse.persistence.tools.workbench.mappingsplugin.ui.schema;

import java.util.ListIterator;

import org.eclipse.persistence.tools.workbench.mappingsmodel.schema.MWModelGroupDefinition;


final class ModelGroupDefinitionNodeStructure
	extends NamedSchemaComponentNodeStructure 
{
	// **************** Constructors ******************************************
	
	ModelGroupDefinitionNodeStructure(MWModelGroupDefinition modelGroupDefinition) {
		super(modelGroupDefinition);
	}
	
	
	// **************** SchemaComponentNodeStructure contract *****************
	
	protected ListIterator componentDetails() {
		return this.nameDetails();
	}
	
	
	// **************** NamedSchemaComponentNodeStructure contract ************
	
	Integer topLevelOrderIndex() {
		return new Integer(1);
	}
}
