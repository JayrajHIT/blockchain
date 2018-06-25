package com.ds4u.api;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

public class ServerTrustManager implements X509TrustManager{

    @Override
    public void checkClientTrusted(X509Certificate[] xcs, String string) throws CertificateException {
        }

    @Override
    public void checkServerTrusted(X509Certificate[] xcs, String string) throws CertificateException {
     xcs[0].checkValidity();
     xcs[0].getIssuerUniqueID();
     xcs[0].getSubjectDN();
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
       return null;
    }
    
    
    
}
