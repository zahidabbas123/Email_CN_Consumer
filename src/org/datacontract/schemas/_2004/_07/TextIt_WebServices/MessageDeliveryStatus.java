/**
 * MessageDeliveryStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TextIt_WebServices;

public class MessageDeliveryStatus  implements java.io.Serializable {
    private java.lang.String cellNumber;

    private java.lang.Long deliveryID;

    private java.lang.String deliveryStatus;

    public MessageDeliveryStatus() {
    }

    public MessageDeliveryStatus(
           java.lang.String cellNumber,
           java.lang.Long deliveryID,
           java.lang.String deliveryStatus) {
           this.cellNumber = cellNumber;
           this.deliveryID = deliveryID;
           this.deliveryStatus = deliveryStatus;
    }


    /**
     * Gets the cellNumber value for this MessageDeliveryStatus.
     * 
     * @return cellNumber
     */
    public java.lang.String getCellNumber() {
        return cellNumber;
    }


    /**
     * Sets the cellNumber value for this MessageDeliveryStatus.
     * 
     * @param cellNumber
     */
    public void setCellNumber(java.lang.String cellNumber) {
        this.cellNumber = cellNumber;
    }


    /**
     * Gets the deliveryID value for this MessageDeliveryStatus.
     * 
     * @return deliveryID
     */
    public java.lang.Long getDeliveryID() {
        return deliveryID;
    }


    /**
     * Sets the deliveryID value for this MessageDeliveryStatus.
     * 
     * @param deliveryID
     */
    public void setDeliveryID(java.lang.Long deliveryID) {
        this.deliveryID = deliveryID;
    }


    /**
     * Gets the deliveryStatus value for this MessageDeliveryStatus.
     * 
     * @return deliveryStatus
     */
    public java.lang.String getDeliveryStatus() {
        return deliveryStatus;
    }


    /**
     * Sets the deliveryStatus value for this MessageDeliveryStatus.
     * 
     * @param deliveryStatus
     */
    public void setDeliveryStatus(java.lang.String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageDeliveryStatus)) return false;
        MessageDeliveryStatus other = (MessageDeliveryStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cellNumber==null && other.getCellNumber()==null) || 
             (this.cellNumber!=null &&
              this.cellNumber.equals(other.getCellNumber()))) &&
            ((this.deliveryID==null && other.getDeliveryID()==null) || 
             (this.deliveryID!=null &&
              this.deliveryID.equals(other.getDeliveryID()))) &&
            ((this.deliveryStatus==null && other.getDeliveryStatus()==null) || 
             (this.deliveryStatus!=null &&
              this.deliveryStatus.equals(other.getDeliveryStatus())));
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
        if (getCellNumber() != null) {
            _hashCode += getCellNumber().hashCode();
        }
        if (getDeliveryID() != null) {
            _hashCode += getDeliveryID().hashCode();
        }
        if (getDeliveryStatus() != null) {
            _hashCode += getDeliveryStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageDeliveryStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "MessageDeliveryStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "CellNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "DeliveryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "DeliveryStatus"));
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
