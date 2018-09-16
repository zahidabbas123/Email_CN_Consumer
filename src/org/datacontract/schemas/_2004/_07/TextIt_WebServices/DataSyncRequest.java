/**
 * DataSyncRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TextIt_WebServices;

public class DataSyncRequest  implements java.io.Serializable {
    private java.lang.Integer companyID;

    private org.datacontract.schemas._2004._07.TextIt_Model.ClientStagingDataLoad[] profileData;

    private java.lang.String token;

    private java.lang.String userName;

    public DataSyncRequest() {
    }

    public DataSyncRequest(
           java.lang.Integer companyID,
           org.datacontract.schemas._2004._07.TextIt_Model.ClientStagingDataLoad[] profileData,
           java.lang.String token,
           java.lang.String userName) {
           this.companyID = companyID;
           this.profileData = profileData;
           this.token = token;
           this.userName = userName;
    }


    /**
     * Gets the companyID value for this DataSyncRequest.
     * 
     * @return companyID
     */
    public java.lang.Integer getCompanyID() {
        return companyID;
    }


    /**
     * Sets the companyID value for this DataSyncRequest.
     * 
     * @param companyID
     */
    public void setCompanyID(java.lang.Integer companyID) {
        this.companyID = companyID;
    }


    /**
     * Gets the profileData value for this DataSyncRequest.
     * 
     * @return profileData
     */
    public org.datacontract.schemas._2004._07.TextIt_Model.ClientStagingDataLoad[] getProfileData() {
        return profileData;
    }


    /**
     * Sets the profileData value for this DataSyncRequest.
     * 
     * @param profileData
     */
    public void setProfileData(org.datacontract.schemas._2004._07.TextIt_Model.ClientStagingDataLoad[] profileData) {
        this.profileData = profileData;
    }


    /**
     * Gets the token value for this DataSyncRequest.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this DataSyncRequest.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the userName value for this DataSyncRequest.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this DataSyncRequest.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataSyncRequest)) return false;
        DataSyncRequest other = (DataSyncRequest) obj;
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
            ((this.profileData==null && other.getProfileData()==null) || 
             (this.profileData!=null &&
              java.util.Arrays.equals(this.profileData, other.getProfileData()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName())));
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
        if (getProfileData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfileData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfileData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataSyncRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "DataSyncRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "CompanyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "ProfileData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.Model", "ClientStagingDataLoad"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.Model", "ClientStagingDataLoad"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "Token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "UserName"));
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
