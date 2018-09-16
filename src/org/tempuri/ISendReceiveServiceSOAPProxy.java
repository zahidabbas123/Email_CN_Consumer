package org.tempuri;

public class ISendReceiveServiceSOAPProxy implements org.tempuri.ISendReceiveServiceSOAP {
  private String _endpoint = null;
  private org.tempuri.ISendReceiveServiceSOAP iSendReceiveServiceSOAP = null;
  
  public ISendReceiveServiceSOAPProxy() {
    _initISendReceiveServiceSOAPProxy();
  }
  
  public ISendReceiveServiceSOAPProxy(String endpoint) {
    _endpoint = endpoint;
    _initISendReceiveServiceSOAPProxy();
  }
  
  private void _initISendReceiveServiceSOAPProxy() {
    try {
      iSendReceiveServiceSOAP = (new org.tempuri.SendReceiveServiceSOAPLocator()).getSendReceiveServiceSOAP();
      if (iSendReceiveServiceSOAP != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iSendReceiveServiceSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iSendReceiveServiceSOAP)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iSendReceiveServiceSOAP != null)
      ((javax.xml.rpc.Stub)iSendReceiveServiceSOAP)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.ISendReceiveServiceSOAP getISendReceiveServiceSOAP() {
    if (iSendReceiveServiceSOAP == null)
      _initISendReceiveServiceSOAPProxy();
    return iSendReceiveServiceSOAP;
  }
  
  public java.lang.String getData(java.lang.String value) throws java.rmi.RemoteException{
    if (iSendReceiveServiceSOAP == null)
      _initISendReceiveServiceSOAPProxy();
    return iSendReceiveServiceSOAP.getData(value);
  }
  
  public java.lang.String getToken(org.datacontract.schemas._2004._07.TextIt_WebServices.TokenRequest tokenRequest) throws java.rmi.RemoteException{
    if (iSendReceiveServiceSOAP == null)
      _initISendReceiveServiceSOAPProxy();
    return iSendReceiveServiceSOAP.getToken(tokenRequest);
  }
  
  public org.datacontract.schemas._2004._07.TextIt_WebServices.OutboundMessageResponse sendMessage(org.datacontract.schemas._2004._07.TextIt_WebServices.OutboundMessage msg) throws java.rmi.RemoteException{
    if (iSendReceiveServiceSOAP == null)
      _initISendReceiveServiceSOAPProxy();
    return iSendReceiveServiceSOAP.sendMessage(msg);
  }
  
  public org.datacontract.schemas._2004._07.TextIt_WebServices.DeliveryStatusResponse receiveDeliveryStatus(org.datacontract.schemas._2004._07.TextIt_WebServices.DeliveryStatusRequest deliveryStatusRequest) throws java.rmi.RemoteException{
    if (iSendReceiveServiceSOAP == null)
      _initISendReceiveServiceSOAPProxy();
    return iSendReceiveServiceSOAP.receiveDeliveryStatus(deliveryStatusRequest);
  }
  
  public org.datacontract.schemas._2004._07.TextIt_WebServices.DataSyncResponse dataSync(org.datacontract.schemas._2004._07.TextIt_WebServices.DataSyncRequest data) throws java.rmi.RemoteException{
    if (iSendReceiveServiceSOAP == null)
      _initISendReceiveServiceSOAPProxy();
    return iSendReceiveServiceSOAP.dataSync(data);
  }
  
  
}