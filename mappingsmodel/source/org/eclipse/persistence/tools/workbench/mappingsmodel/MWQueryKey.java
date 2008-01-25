/*******************************************************************************
* Copyright (c) 2007 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the terms of
* the Eclipse Public License v1.0, which accompanies this distribution and is available at
* http://www.eclipse.org/legal/epl-v10.html.
*
* Contributors:
*     Oracle - initial API and implementation
******************************************************************************/
package org.eclipse.persistence.tools.workbench.mappingsmodel;

import org.eclipse.persistence.tools.workbench.mappingsmodel.db.MWColumn;
import org.eclipse.persistence.tools.workbench.mappingsmodel.descriptor.relational.MWRelationalClassDescriptor;
import org.eclipse.persistence.tools.workbench.utility.node.NodeModel;


public interface MWQueryKey extends NodeModel, MWNode
{
	MWRelationalClassDescriptor getDescriptor();
	
	MWColumn getColumn();
	
	boolean isAutoGenerated();
	
	String getName();
		String NAME_PROPERTY = "name";
    
}
