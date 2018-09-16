/**
 * ISendReceiveServiceSOAP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface ISendReceiveServiceSOAP extends java.rmi.Remote {
    public java.lang.String getData(java.lang.String value) throws java.rmi.RemoteException;
    public java.lang.String getToken(org.datacontract.schemas._2004._07.TextIt_WebServices.TokenRequest tokenRequest) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.TextIt_WebServices.OutboundMessageResponse sendMessage(org.datacontract.schemas._2004._07.TextIt_WebServices.OutboundMessage msg) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.TextIt_WebServices.DeliveryStatusResponse receiveDeliveryStatus(org.datacontract.schemas._2004._07.TextIt_WebServices.DeliveryStatusRequest deliveryStatusRequest) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.TextIt_WebServices.DataSyncResponse dataSync(org.datacontract.schemas._2004._07.TextIt_WebServices.DataSyncRequest data) throws java.rmi.RemoteException;
}
