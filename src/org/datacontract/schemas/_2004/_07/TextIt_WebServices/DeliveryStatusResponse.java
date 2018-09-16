/**
 * DeliveryStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TextIt_WebServices;

public class DeliveryStatusResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.TextIt_WebServices.MessageDeliveryStatus[] deliveryStatuses;

    private java.lang.String errorMessage;

    private java.lang.Integer responseCode;

    public DeliveryStatusResponse() {
    }

    public DeliveryStatusResponse(
           org.datacontract.schemas._2004._07.TextIt_WebServices.MessageDeliveryStatus[] deliveryStatuses,
           java.lang.String errorMessage,
           java.lang.Integer responseCode) {
           this.deliveryStatuses = deliveryStatuses;
           this.errorMessage = errorMessage;
           this.responseCode = responseCode;
    }


    /**
     * Gets the deliveryStatuses value for this DeliveryStatusResponse.
     * 
     * @return deliveryStatuses
     */
    public org.datacontract.schemas._2004._07.TextIt_WebServices.MessageDeliveryStatus[] getDeliveryStatuses() {
        return deliveryStatuses;
    }


    /**
     * Sets the deliveryStatuses value for this DeliveryStatusResponse.
     * 
     * @param deliveryStatuses
     */
    public void setDeliveryStatuses(org.datacontract.schemas._2004._07.TextIt_WebServices.MessageDeliveryStatus[] deliveryStatuses) {
        this.deliveryStatuses = deliveryStatuses;
    }


    /**
     * Gets the errorMessage value for this DeliveryStatusResponse.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this DeliveryStatusResponse.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the responseCode value for this DeliveryStatusResponse.
     * 
     * @return responseCode
     */
    public java.lang.Integer getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this DeliveryStatusResponse.
     * 
     * @param responseCode
     */
    public void setResponseCode(java.lang.Integer responseCode) {
        this.responseCode = responseCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeliveryStatusResponse)) return false;
        DeliveryStatusResponse other = (DeliveryStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deliveryStatuses==null && other.getDeliveryStatuses()==null) || 
             (this.deliveryStatuses!=null &&
              java.util.Arrays.equals(this.deliveryStatuses, other.getDeliveryStatuses()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode())));
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
        if (getDeliveryStatuses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveryStatuses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeliveryStatuses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeliveryStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "DeliveryStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryStatuses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "DeliveryStatuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "MessageDeliveryStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "MessageDeliveryStatus"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "ErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "ResponseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
