/*******************************************************************************
* Copyright (c) 2007 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the terms of
* the Eclipse Public License v1.0, which accompanies this distribution and is available at
* http://www.eclipse.org/legal/epl-v10.html.
*
* Contributors:
*     Oracle - initial API and implementation
******************************************************************************/
package org.eclipse.persistence.tools.workbench.mappingsmodel.descriptor;

import org.eclipse.persistence.tools.workbench.mappingsmodel.MWDataField;
import org.eclipse.persistence.tools.workbench.mappingsmodel.MWModel;
import org.eclipse.persistence.tools.workbench.mappingsmodel.xml.MWXmlNode;
import org.eclipse.persistence.tools.workbench.mappingsmodel.xml.SchemaChange;

import org.eclipse.persistence.descriptors.ClassDescriptor;

final class MWNullLockingPolicy extends MWModel implements MWLockingPolicy, MWXmlNode {

    MWNullLockingPolicy(MWTransactionalPolicy parent) {
        super(parent);
    }
    
    public String getLockingType() {
        return "";
    }
    
    public void setLockingType(String newLockingType) {
        throw new UnsupportedOperationException();
        
    }
  
    public MWDataField getVersionLockField() {
        return null;
    }
    
    public void setVersionLockField(MWDataField newLockField) {
        throw new UnsupportedOperationException();
    }
    
    public boolean shouldStoreVersionInCache() {
        return false;
    }
    
    public void setStoreInCache(boolean newStoreInCache) {
        throw new UnsupportedOperationException();        
    }
    
    // **************** Model synchronization *********************************
    
    /** @see MWXmlNode#resolveXpaths() */
    public void resolveXpaths() {
        // Do nothing.  Null policy.
    }
    
    /** @see MWXmlNode#schemaChanged(SchemaChange) */
    public void schemaChanged(SchemaChange change) {
        // Do nothing.  Null policy.
    }
    
    public void adjustRuntimeDescriptor(ClassDescriptor runtimeDescriptor) {
        // Do nothing.  Null policy.
    }
}
