/*
 * Copyright 2018 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.openehealth.ipf.commons.ihe.hpd.iti59;

import org.openehealth.ipf.commons.audit.codes.ParticipantObjectTypeCode;
import org.openehealth.ipf.commons.audit.codes.ParticipantObjectTypeCodeRole;
import org.openehealth.ipf.commons.audit.model.AuditMessage;
import org.openehealth.ipf.commons.ihe.core.atna.event.IHEDataExportBuilder;
import org.openehealth.ipf.commons.ihe.hpd.audit.HpdEventTypeCode;
import org.openehealth.ipf.commons.ihe.hpd.audit.HpdParticipantObjectIdTypeCode;

/**
 * @author Christian Ohr
 */
public class Iti59ClientAuditStrategy extends Iti59AuditStrategy {

    public Iti59ClientAuditStrategy() {
        super(false);
    }

    protected AuditMessage makeAuditMessage(Iti59AuditDataset auditDataset, Iti59AuditDataset.RequestItem requestItem) {
        IHEDataExportBuilder builder = new IHEDataExportBuilder<>(
                auditDataset,
                requestItem.getOutcomeCode(),
                requestItem.getActionCode(),
                HpdEventTypeCode.ProviderInformationFeed,
                auditDataset.getPurposesOfUse()
        );
        requestItem.getProviderIds().forEach(providerId ->
                builder.addExportedEntity(
                        providerId,
                        HpdParticipantObjectIdTypeCode.ProviderIdentifier,
                        ParticipantObjectTypeCode.Organization,
                        ParticipantObjectTypeCodeRole.Provider,
                        null
                )
        );
        if (requestItem.getDn() != null) {
            builder.addExportedEntity(
                    requestItem.getDn(),
                    HpdParticipantObjectIdTypeCode.DistinguishedName,
                    ParticipantObjectTypeCode.System,
                    ParticipantObjectTypeCodeRole.Resource,
                    null
            );
        }
        if (requestItem.getNewRdn() != null) {
            builder.addExportedEntity(
                    requestItem.getNewRdn(),
                    HpdParticipantObjectIdTypeCode.DistinguishedName,
                    ParticipantObjectTypeCode.System,
                    ParticipantObjectTypeCodeRole.Resource,
                    null
            );
        }

        return builder.getMessage();
    }

}
