/*
 * Copyright 2011 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openehealth.ipf.commons.ihe.hl7v2ws.pcd01;

import org.junit.Test;

import ca.uhn.hl7v2.HL7Exception;

/**
 * @author Kingsley Nwaigbo
 * 
 */
public class QA_Pcd01MSHValidatorTest extends AbstractPCD01ValidatorTest {

    @Test
    public void testMaximalMessage() throws HL7Exception {
        validate(maximumMessage);
    }

    // ################ MSH Segment tests ###############################
    @Test(expected = HL7Exception.class)
    public void testMissingMSH3() throws HL7Exception {
        validate(maxMsgReplace("AcmeInc^ACDE48234567ABCD^EUI-64", ""));
    }

    @Test(expected = HL7Exception.class)
    public void testMissingMSH7() throws HL7Exception  {
        validate(maxMsgReplace("20090713090030+0500", ""));
    }

    @Test(expected = HL7Exception.class)
    public void testMissingMSH9() throws HL7Exception  {
        validate(maxMsgReplace("ORU^R01^ORU_R01", ""));
    }

    @Test(expected = HL7Exception.class)
    public void testMissingMSH9dot1() throws HL7Exception  {
        validate(maxMsgReplace("ORU^R01^ORU_R01", "^R01^ORU_R01"));
    }

    @Test(expected = HL7Exception.class)
    public void testMissingMSH9dot1_9dot3() throws HL7Exception  {
        validate(maxMsgReplace("ORU^R01^ORU_R01", "^R01"));
    }

    @Test(expected = Exception.class)
    public void testMissingMSH9dot2_9dot3() throws HL7Exception  {
        validate(maxMsgReplace("ORU^R01^ORU_R01", "ORU"));
    }

    @Test(expected = HL7Exception.class)
    public void testMissingMSH10() throws HL7Exception  {
        validate(maxMsgReplace("MSGID1234", ""));
    }

    @Test(expected = HL7Exception.class)
    public void testMissingMSH11() throws HL7Exception  {
        validate(maxMsgReplace("P", ""));
    }

    @Test(expected = HL7Exception.class)
    public void testWrongMSH11() throws HL7Exception  {
        validate(maxMsgReplace("P", "X"));
    }

    @Test(expected = HL7Exception.class)
    public void testMissingMSH12() throws HL7Exception  {
        validate(maxMsgReplace("2.6", ""));
    }

    @Test(expected = HL7Exception.class)
    public void testMissingMSH21() throws HL7Exception  {
        validate(maxMsgReplace("IHE PCD ORU-R01 2006^HL7^1.3.6.1.4.1.19376.1.6.1.1.1^ISO",
                               ""));
    }

    @Test(expected = HL7Exception.class)
    public void testMissingMSH21dot1() throws HL7Exception {
        validate(maxMsgReplace("IHE PCD ORU-R01 2006^HL7^1.3.6.1.4.1.19376.1.6.1.1.1^ISO",
                               "^HL7^2.16.840.1.113883.9.n.m^HL7"));
    }

    @Test(expected = HL7Exception.class)
    public void testMissingMSH21dot2_3_4() throws HL7Exception  {
        validate(maxMsgReplace("IHE PCD ORU-R01 2006^HL7^1.3.6.1.4.1.19376.1.6.1.1.1^ISO",
                               "IHE PCD ORU-R01 2006"));
    }

    @Test(expected = HL7Exception.class)
    public void testMissingMSH21dot2_3() throws HL7Exception {
        validate(maxMsgReplace("IHE PCD ORU-R01 2006^HL7^1.3.6.1.4.1.19376.1.6.1.1.1^ISO",
                               "IHE PCD ORU-R01 2006^^^HL7"));
    }

}