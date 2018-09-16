/**
 * DeliveryStatusRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TextIt_WebServices;

public class DeliveryStatusRequest  implements java.io.Serializable {
    private java.lang.Integer companyID;

    private long[] messageDeliveryIDs;

    private java.lang.String token;

    private java.lang.String username;

    public DeliveryStatusRequest() {
    }

    public DeliveryStatusRequest(
           java.lang.Integer companyID,
           long[] messageDeliveryIDs,
           java.lang.String token,
           java.lang.String username) {
           this.companyID = companyID;
           this.messageDeliveryIDs = messageDeliveryIDs;
           this.token = token;
           this.username = username;
    }


    /**
     * Gets the companyID value for this DeliveryStatusRequest.
     * 
     * @return companyID
     */
    public java.lang.Integer getCompanyID() {
        return companyID;
    }


    /**
     * Sets the companyID value for this DeliveryStatusRequest.
     * 
     * @param companyID
     */
    public void setCompanyID(java.lang.Integer companyID) {
        this.companyID = companyID;
    }


    /**
     * Gets the messageDeliveryIDs value for this DeliveryStatusRequest.
     * 
     * @return messageDeliveryIDs
     */
    public long[] getMessageDeliveryIDs() {
        return messageDeliveryIDs;
    }


    /**
     * Sets the messageDeliveryIDs value for this DeliveryStatusRequest.
     * 
     * @param messageDeliveryIDs
     */
    public void setMessageDeliveryIDs(long[] messageDeliveryIDs) {
        this.messageDeliveryIDs = messageDeliveryIDs;
    }


    /**
     * Gets the token value for this DeliveryStatusRequest.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this DeliveryStatusRequest.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the username value for this DeliveryStatusRequest.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this DeliveryStatusRequest.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeliveryStatusRequest)) return false;
        DeliveryStatusRequest other = (DeliveryStatusRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.companyID==null && other.getCompanyID()==null) || 
             (this.companyID!=null &&
              this.companyID.equals(other.getCompanyID()))) &&
            ((this.messageDeliveryIDs==null && other.getMessageDeliveryIDs()==null) || 
             (this.messageDeliveryIDs!=null &&
              java.util.Arrays.equals(this.messageDeliveryIDs, other.getMessageDeliveryIDs()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCompanyID() != null) {
            _hashCode += getCompanyID().hashCode();
        }
        if (getMessageDeliveryIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessageDeliveryIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessageDeliveryIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeliveryStatusRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "DeliveryStatusRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "CompanyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageDeliveryIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "MessageDeliveryIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "long"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "Token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "Username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
