/*
 * Copyright 2009 the original author or authors.
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
package org.openehealth.ipf.commons.xml;

import java.io.InputStream;
import java.io.Reader;

import org.w3c.dom.ls.LSInput;

/**
 * This class represents an input source for XML parser
 * 
 * @author Ferry Syafei Sapei
 */
class LSInputImpl implements LSInput {

    private String baseURI;

    private InputStream byteStream;

    private boolean certifiedText;

    private Reader characterStream;

    private String encoding;

    private String publicId;

    private String stringData;

    private String systemId;

    public LSInputImpl(InputStream byteStream) {
        this.byteStream = byteStream;
    }

    @Override
    public String getBaseURI() {
        return baseURI;
    }

    @Override
    public InputStream getByteStream() {
        return byteStream;
    }

    @Override
    public boolean getCertifiedText() {
        return certifiedText;
    }

    @Override
    public Reader getCharacterStream() {
        return characterStream;
    }

    @Override
    public String getEncoding() {
        return encoding;
    }

    @Override
    public String getPublicId() {
        return publicId;
    }

    @Override
    public String getStringData() {
        return stringData;
    }

    @Override
    public String getSystemId() {
        return systemId;
    }

    @Override
    public void setBaseURI(String baseURI) {
        this.baseURI = baseURI;
    }

    @Override
    public void setByteStream(InputStream byteStream) {
        this.byteStream = byteStream;
    }

    @Override
    public void setCertifiedText(boolean certifiedText) {
        this.certifiedText = certifiedText;
    }

    @Override
    public void setCharacterStream(Reader characterStream) {
        this.characterStream = characterStream;
    }

    @Override
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    @Override
    public void setPublicId(String publicId) {
        this.publicId = publicId;
    }

    @Override
    public void setStringData(String stringData) {
        this.stringData = stringData;
    }

    @Override
    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }
}