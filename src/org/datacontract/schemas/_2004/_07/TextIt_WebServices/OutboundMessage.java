/**
 * OutboundMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.TextIt_WebServices;

public class OutboundMessage  implements java.io.Serializable {
    private java.lang.Integer categoryId;

    private java.lang.String[] cellNumbers;

    private java.lang.Boolean dontSendInvitationText;

    private java.lang.Integer keywordId;

    private java.lang.Boolean maintainContext;

    private java.lang.String messageText;

    private java.lang.String token;

    private java.lang.Integer topicId;

    private java.lang.String userName;

    public OutboundMessage() {
    }

    public OutboundMessage(
           java.lang.Integer categoryId,
           java.lang.String[] cellNumbers,
           java.lang.Boolean dontSendInvitationText,
           java.lang.Integer keywordId,
           java.lang.Boolean maintainContext,
           java.lang.String messageText,
           java.lang.String token,
           java.lang.Integer topicId,
           java.lang.String userName) {
           this.categoryId = categoryId;
           this.cellNumbers = cellNumbers;
           this.dontSendInvitationText = dontSendInvitationText;
           this.keywordId = keywordId;
           this.maintainContext = maintainContext;
           this.messageText = messageText;
           this.token = token;
           this.topicId = topicId;
           this.userName = userName;
    }


    /**
     * Gets the categoryId value for this OutboundMessage.
     * 
     * @return categoryId
     */
    public java.lang.Integer getCategoryId() {
        return categoryId;
    }


    /**
     * Sets the categoryId value for this OutboundMessage.
     * 
     * @param categoryId
     */
    public void setCategoryId(java.lang.Integer categoryId) {
        this.categoryId = categoryId;
    }


    /**
     * Gets the cellNumbers value for this OutboundMessage.
     * 
     * @return cellNumbers
     */
    public java.lang.String[] getCellNumbers() {
        return cellNumbers;
    }


    /**
     * Sets the cellNumbers value for this OutboundMessage.
     * 
     * @param cellNumbers
     */
    public void setCellNumbers(java.lang.String[] cellNumbers) {
        this.cellNumbers = cellNumbers;
    }


    /**
     * Gets the dontSendInvitationText value for this OutboundMessage.
     * 
     * @return dontSendInvitationText
     */
    public java.lang.Boolean getDontSendInvitationText() {
        return dontSendInvitationText;
    }


    /**
     * Sets the dontSendInvitationText value for this OutboundMessage.
     * 
     * @param dontSendInvitationText
     */
    public void setDontSendInvitationText(java.lang.Boolean dontSendInvitationText) {
        this.dontSendInvitationText = dontSendInvitationText;
    }


    /**
     * Gets the keywordId value for this OutboundMessage.
     * 
     * @return keywordId
     */
    public java.lang.Integer getKeywordId() {
        return keywordId;
    }


    /**
     * Sets the keywordId value for this OutboundMessage.
     * 
     * @param keywordId
     */
    public void setKeywordId(java.lang.Integer keywordId) {
        this.keywordId = keywordId;
    }


    /**
     * Gets the maintainContext value for this OutboundMessage.
     * 
     * @return maintainContext
     */
    public java.lang.Boolean getMaintainContext() {
        return maintainContext;
    }


    /**
     * Sets the maintainContext value for this OutboundMessage.
     * 
     * @param maintainContext
     */
    public void setMaintainContext(java.lang.Boolean maintainContext) {
        this.maintainContext = maintainContext;
    }


    /**
     * Gets the messageText value for this OutboundMessage.
     * 
     * @return messageText
     */
    public java.lang.String getMessageText() {
        return messageText;
    }


    /**
     * Sets the messageText value for this OutboundMessage.
     * 
     * @param messageText
     */
    public void setMessageText(java.lang.String messageText) {
        this.messageText = messageText;
    }


    /**
     * Gets the token value for this OutboundMessage.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this OutboundMessage.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the topicId value for this OutboundMessage.
     * 
     * @return topicId
     */
    public java.lang.Integer getTopicId() {
        return topicId;
    }


    /**
     * Sets the topicId value for this OutboundMessage.
     * 
     * @param topicId
     */
    public void setTopicId(java.lang.Integer topicId) {
        this.topicId = topicId;
    }


    /**
     * Gets the userName value for this OutboundMessage.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this OutboundMessage.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OutboundMessage)) return false;
        OutboundMessage other = (OutboundMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.categoryId==null && other.getCategoryId()==null) || 
             (this.categoryId!=null &&
              this.categoryId.equals(other.getCategoryId()))) &&
            ((this.cellNumbers==null && other.getCellNumbers()==null) || 
             (this.cellNumbers!=null &&
              java.util.Arrays.equals(this.cellNumbers, other.getCellNumbers()))) &&
            ((this.dontSendInvitationText==null && other.getDontSendInvitationText()==null) || 
             (this.dontSendInvitationText!=null &&
              this.dontSendInvitationText.equals(other.getDontSendInvitationText()))) &&
            ((this.keywordId==null && other.getKeywordId()==null) || 
             (this.keywordId!=null &&
              this.keywordId.equals(other.getKeywordId()))) &&
            ((this.maintainContext==null && other.getMaintainContext()==null) || 
             (this.maintainContext!=null &&
              this.maintainContext.equals(other.getMaintainContext()))) &&
            ((this.messageText==null && other.getMessageText()==null) || 
             (this.messageText!=null &&
              this.messageText.equals(other.getMessageText()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.topicId==null && other.getTopicId()==null) || 
             (this.topicId!=null &&
              this.topicId.equals(other.getTopicId()))) &&
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
        if (getCategoryId() != null) {
            _hashCode += getCategoryId().hashCode();
        }
        if (getCellNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCellNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCellNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDontSendInvitationText() != null) {
            _hashCode += getDontSendInvitationText().hashCode();
        }
        if (getKeywordId() != null) {
            _hashCode += getKeywordId().hashCode();
        }
        if (getMaintainContext() != null) {
            _hashCode += getMaintainContext().hashCode();
        }
        if (getMessageText() != null) {
            _hashCode += getMessageText().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getTopicId() != null) {
            _hashCode += getTopicId().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OutboundMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "OutboundMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "CategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "CellNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dontSendInvitationText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "DontSendInvitationText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "KeywordId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintainContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "MaintainContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "MessageText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "Token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topicId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TextIt.WebServices", "TopicId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
